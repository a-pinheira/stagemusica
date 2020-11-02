package com.sony.codestage.controllers.config;

import java.util.Arrays;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sony.codestage.controllers.repositories.MusicRepository;
import com.sony.codestage.models.entities.Music;

@Configuration
@Profile("dev")
public class TestConfig implements CommandLineRunner{
	private MusicRepository musicRepository;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		//Music m1 = new Music(" \r\n dadosYtb", 2510, "inscritos", "engajamento");
		//Music m2 = new Music(" \r\n dadosYtb", 2510, "inscritos", "engajamento");

		Music m1 = new Music(null);
		Music m2 = new Music(null);
		musicRepository.saveAll(Arrays.asList(m1,m2));
	}

}
