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
import org.mockito.MockitoAnnotations;

import com.lmig.gfc.wimp.api.AwardsApiController;
import com.lmig.gfc.wimp.models.Actor;
import com.lmig.gfc.wimp.models.Awards;
import com.lmig.gfc.wimp.repositories.ActorRepository;
import com.lmig.gfc.wimp.repositories.AwardsRepository;

public class AwardApiControllerTests {

	private AwardsApiController controller;

	@Mock private AwardsRepository awardsRepo;
	@Mock private ActorRepository actorRepo;

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
		ActorRepository actorRepo = null;
		controller = new AwardsApiController(awardsRepo, actorRepo);
	}

//	@Test
//	public void saves_award_when_actor_is_the_owner() {
//		// Arrange
//		Actor actor = new Actor();
//		when(actorRepo.findOne(1L)).thenReturn(actor);
//		Awards award;
//		when(awardsRepo.findOne(2L)).thenReturn(award);
//
//		// Act
//		Awards actual = controller.create(2L, 1L);
//
//		// Assert
//		assertThat(actual).isSameAs(actor);
//		verify(actorRepo).save(actor);
//		verify(awardsRepo).findOne(2L);
//		verify(actorRepo).findOne(1L);
//
//	}
//
//	@Test
//	public void getAll_names_of_awards() {
//		ArrayList<Awards> award = new ArrayList<Awards>();
//		when(award.findAll()).thenReturn(award);
//		// Arrange
//		// when(the method call used in the code is being tested)
//		// .thenReturn(a value that you created)
//
//		// Act
//		List<Awards> actual = controller.getAll();
//
//		// Assert
//		assertThat(actual).isSameAs(award);
//		verify(actorRepo).findAll();
//	}
}
