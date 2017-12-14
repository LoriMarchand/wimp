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

import com.lmig.gfc.wimp.api.MoviesApiController;
import com.lmig.gfc.wimp.models.Movie;
import com.lmig.gfc.wimp.repositories.MovieRepository;

public class MovieApiControllerTests {

	@Mock private MoviesApiController controller;
	@Mock private MovieRepository repo;

	@Before
	public void setUp() {
		repo = mock(MovieRepository.class);
		controller = new MoviesApiController(repo);

	}

	@Test
	public void getAll_movies_to_validate_list_of_movies_returned() {
		ArrayList<Movie> movies = new ArrayList<Movie>();
		when(repo.findAll()).thenReturn(movies);
		// Arrange
		// when(the method call used in the code is being tested)
		// .thenReturn(a value that you created)

		// Act
		List<Movie> actual = controller.getAll();

		// Assert
		assertThat(actual).isSameAs(movies);
		verify(repo).findAll();

	}

  @Test
  public void getAll_names_of_movies_with_female_actors_returned() {
	  List<Movie>movies = new ArrayList<Movie>();
	  when(repo.findAll()).thenReturn(movies);
	
	  	//Arrange
	  	// when(the method call used in the code is being tested)
	  	// .thenReturn(a value that you created)

	  	// Act
	  List<Movie>actual = controller.getAll();

	  // Assert			
	  assertThat(actual).isSameAs(movies);
	  verify(repo).findAll();

}
}