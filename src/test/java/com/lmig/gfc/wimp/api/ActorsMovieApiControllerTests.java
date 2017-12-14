package com.lmig.gfc.wimp.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.lmig.gfc.wimp.models.Actor;
import com.lmig.gfc.wimp.models.Movie;
import com.lmig.gfc.wimp.repositories.ActorRepository;
import com.lmig.gfc.wimp.repositories.MovieRepository;

public class ActorsMovieApiControllerTests {

	private ActorMovieApiController actormovieapicontroller;
	private ActorRepository actorrepository;
	private MovieRepository movierepository;
	private MovieRepository mr;
	private ActorRepository ar;
		
	public ActorMovieApiController getActormovieapicontroller() {
		return actormovieapicontroller;
	}

	public void setActormovieapicontroller(ActorMovieApiController actormovieapicontroller) {
		this.actormovieapicontroller = actormovieapicontroller;
	}

	public ActorRepository getActorrepository() {
		return actorrepository;
	}

	public void setActorrepository(ActorRepository actorrepository) {
		this.actorrepository = actorrepository;
	}

	public MovieRepository getMovierepository() {
		return movierepository;
	}

	public void setMovierepository(MovieRepository movierepository) {
		this.movierepository = movierepository;
	}

	@Before
	public void setUp() {
		actorrepository = mock(ActorRepository.class);
		movierepository = mock(MovieRepository.class);
		actormovieapicontroller = new ActorMovieApiController(movierepository, actorrepository);

	}

	@PostMapping("")
	public Movie create(@PathVariable Long movieId, @RequestBody Long actorId) {
		Movie movie = mr.findOne(movieId);
		Actor actor = ar.findOne(actorId);

		movie.getActors().add(actor);
		this.mr.save(movie);

		return movie;

	}
}


