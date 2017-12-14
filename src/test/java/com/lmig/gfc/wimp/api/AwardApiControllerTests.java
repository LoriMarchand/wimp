package com.lmig.gfc.wimp.api;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import com.lmig.gfc.wimp.api.AwardsApiController;
import com.lmig.gfc.wimp.models.Awards;
import com.lmig.gfc.wimp.repositories.ActorRepository;
import com.lmig.gfc.wimp.repositories.AwardsRepository;

public class AwardApiControllerTests {

	@Mock private AwardsApiController controller;
	@Mock private AwardsRepository awardsRepo;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		ActorRepository actorRepo = null;
		controller = new AwardsApiController(awardsRepo, actorRepo);

	}

	@Test
	public void getAll_awards_to_validate_list_of_awards_returned() {
		ArrayList<Awards> awards = new ArrayList<Awards>();
		when(awardsRepo.findAll()).thenReturn(awards);
		// Arrange
		// when(the method call used in the code is being tested)
		// .thenReturn(a value that you created)

		// Act
		List<Awards> actual = controller.getAll();

		// Assert
		assertThat(actual).isSameAs(awards);
		verify(awardsRepo).findAll();

	}

	@Test
	public void return_names_of_awards_presented() {
		ArrayList<Awards> award = new ArrayList<Awards>();
		when(awardsRepo.findAll()).thenReturn(award);
		// // Arrange
		// // when(the method call used in the code is being tested)
		// // .thenReturn(a value that you created)
		//
		// // Act
		List<Awards> actual = controller.getAll();
	
		// // Assert
		assertThat(actual).isSameAs(award);
		verify(awardsRepo).findAll();
	}
}
