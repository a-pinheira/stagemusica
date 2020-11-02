package com.sony.codestage.controllers.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sony.codestage.models.entities.Music;

//Instancia o Objeto com várias operaçoes para tratar a entity Music
public interface MusicRepository extends JpaRepository<Music, Long>{

}
