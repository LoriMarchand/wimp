package com.lmig.gfc.wimp.config;

import java.util.Date;

import org.springframework.context.annotation.Configuration;

import com.lmig.gfc.wimp.models.Actor;
import com.lmig.gfc.wimp.models.Movie;
import com.lmig.gfc.wimp.repositories.ActorRepository;
import com.lmig.gfc.wimp.repositories.AwardsRepository;
import com.lmig.gfc.wimp.repositories.MovieRepository;

@Configuration
public class SeedData {

	public SeedData(MovieRepository movieRepository, ActorRepository actorRepository, AwardsRepository awardRepository) {		
		
		movieRepository.save(new Movie("Tumbleweeds", new Date(1951, 04, 01), 5000000L, "Audie Murphy Productions"));
		movieRepository.save(new Movie("Happy Days", new Date(1973, 04, 01), 4000000L, "Ralph Malph Productions"));
		movieRepository.save(new Movie("Soylent Green", new Date(1969, 04, 01), 8000000L, "Charleton Heston Productions"));
		movieRepository.save(new Movie("Worms", new Date(1981, 04, 01), 3000000L, "John James Productions"));
		movieRepository.save(new Movie("Bats", new Date(1991, 04, 01), 7000000L, "Batty Productions"));
		

		actorRepository.save(new Actor("Lori", "Nelson", 1951L, new Date (1931, 04, 01)));
		actorRepository.save(new Actor("Arthur", "Fonzarelli", 1942L, new Date (1973, 04, 01)));
		actorRepository.save(new Actor("Charleton", "Heston", 1921L, new Date (1969, 04, 01)));
		actorRepository.save(new Actor("Alan", "West", 1921L, new Date (1951, 05, 01)));
		actorRepository.save(new Actor("Bruce", "Ward", 1963L, new Date (1962, 07, 01)));
		
	}

}