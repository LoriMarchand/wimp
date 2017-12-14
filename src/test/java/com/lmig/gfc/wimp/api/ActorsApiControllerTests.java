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
import com.lmig.gfc.wimp.api.ActorsApiController;
import com.lmig.gfc.wimp.models.Actor;
import com.lmig.gfc.wimp.repositories.ActorRepository;


public class ActorsApiControllerTests {	

	@Mock private ActorsApiController controller;
	@Mock private ActorRepository repo;

	@Before
	public void setUp() {
		repo = mock(ActorRepository.class);
		controller = new ActorsApiController(repo);

	}

	@Test
	public void getAll_actors_to_validate_list_of_actors_returned() {
		ArrayList<Actor> actors = new ArrayList<Actor>();
		when(repo.findAll()).thenReturn(actors);
		// Arrange
		// when(the method call used in the code is being tested)
		// .thenReturn(a value that you created)

		// Act
		List<Actor> actual = controller.getAll();

		// Assert
		assertThat(actual).isSameAs(actors);
		verify(repo).findAll();

	}

	@Test
  public void getAll_list_of_actors_who_received_awards_returned() {
	 		// Arrange
	 		// when(the method call used in the code is being tested)
	 		// .thenReturn(a value that you created)
		ArrayList<Actor> actors = new ArrayList<Actor>();
		when(repo.findAll()).thenReturn(actors);
			// Act
	List<Actor> actual = controller.getAll();
			// Assert
			assertThat(actual).isSameAs(actors);
			verify(repo).findAll();
 }
}

