package com.sony.codestage.controllers.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sony.codestage.controllers.services.MusicService;
import com.sony.codestage.models.entities.Music;



@RestController
@RequestMapping(value = "music")
public class MusicResource {
	
	@Autowired
	private MusicService service;
	
	//Endepoint
	@GetMapping
	public ResponseEntity<List<Music>> findAll(){
		List<Music> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}
	//@GetMapping(value = "/{id}") // Consulta por ID
	@GetMapping(value = "/{id}")
	public ResponseEntity<Music> findById(@PathVariable Long Id){
		Music obj = service.findById(Id);
		return ResponseEntity.ok().body(obj);
	}
	
	//endpoint de atualização
		@PutMapping(value = "/{id}")
		public ResponseEntity<Music> update(@PathVariable Long id, @RequestBody Music obj) {
			obj = service.update(id, obj);
			return ResponseEntity.ok().body(obj);
		}
		
	
}
