package com.lmig.gfc.wimp.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.web.servlet.ModelAndView;

import com.lmig.gfc.wimp.api.ActorsApiController;
import com.lmig.gfc.wimp.models.Actor;
import com.lmig.gfc.wimp.models.Movie;
import com.lmig.gfc.wimp.repositories.ActorRepository;

public class ActorsApiControllerTests {

	@Mock private ActorsApiController controller;
	@Mock private ActorRepository repo;

	@Before
	public void setUp() {
		repo = mock(ActorRepository.class);
		controller = new ActorsApiController(repo);

	}

//	@Test
//	public void getAll_names_of_actors() {
//		ArrayList<Actor> actors = new ArrayList<Actor>();
//		when(repo.findAll()).thenReturn(actors);
//		// Arrange
//		// when(the method call used in the code is being tested)
//		// .thenReturn(a value that you created)
//
//		// Act
//		List<Actor> actual = controller.getAll();
//
//		// Assert
//		assertThat(actual).isSameAs(actors);
//		verify(repo).findAll();
//
//	}
//
//	@Test
//	public void getAll_awards_with_female_gender_returns_list_of_actors() {
//		// Arrange
//		ArrayList<Actor> actors = new ArrayList<Actor>();
//		ModelAndView female = new ModelAndView();
//		when(repo.findByGender("female")).thenReturn(actors);
//
//		// Arrange
//		// when(the method call used in the code is being tested)
//		// .thenReturn(a value that you created)
//
//		// Act
//		List<Actor> actual = controller.getAll("female");
//
//		// Assert
//		assertThat(actual).isSameAs(actors);
//		verify(repo).findByGender("female");
//	}

}

//@Test
//	ArrayList<Actor> actors = new ArrayList<Actor>();
//
//when(repo.findByGender("female")).thenReturn(actor);
	// when(the method call used in the code is being tested)
	// .thenReturn(a value that you created)
