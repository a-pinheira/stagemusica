package com.sony.codestage.controllers.services;
//package com.sony.codestage.controllers.services.exceptions;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityNotFoundException;

import org.springframework.stereotype.Service;

import com.sony.codestage.controllers.repositories.MusicRepository;
import com.sony.codestage.controllers.services.exceptions.ResourceNotFoundExcpetion;
import com.sony.codestage.models.entities.Music;


@Service
public class MusicService {
	
	private MusicRepository repository;
	//private static final String API_URL = "https://www.googleapis.com/youtube/v3/channels";
	private static final String cURL = "https://www.googleapis.com/auth/yt-analytics.readonly";
    private static final String KEY = "AIzaSyCcQVbfk4dTfvg5Weo76PqhT1LrbQMTARk";
    private static final String PART = "snippet,contentDetails,statistics,status";

	
	//Busca/recupera todos os musicos
		public List<Music> findAll(){
			return repository.findAll();
		}
		//Busca/recupera o Musicos por View
		public Music findById(Long id) {
			Optional<Music> obj = repository.findById(id);
			//return obj.get();
			//usa lambda
			return obj.orElseThrow(() -> new ResourceNotFoundExcpetion(id));

		}
		//Busca/recupera o Musicos por inscritos
		//Busca/recupera o Musicos por engajamento (compartilhamento+salvo+comentários)
		
		//Metodo que retorna o exame salvo - insere do BD um novo objeto exame
		public Music insert(Music obj) {
			return repository.save(obj);
			
		}
		public Music update(Long id, Music obj) {
			try {
				Music entity = repository.getOne(id);
				updateData(entity, obj);			
				return repository.save(entity);
			} catch (EntityNotFoundException e) {
				throw new ResourceNotFoundExcpetion(id);				
			}
		}
		private void updateData(Music entity, Music obj) {
			//entity.setId(obj.getId());
			entity.setDadosYtb(obj.getDadosYtb());
			entity.setEngajamento(obj.getEngajamento());
			entity.setInscritos(obj.getInscritos());
			entity.setViews(obj.getViews());

		}

}
