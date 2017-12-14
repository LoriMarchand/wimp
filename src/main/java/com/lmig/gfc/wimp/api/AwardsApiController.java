package com.lmig.gfc.wimp.api;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lmig.gfc.wimp.models.Actor;
import com.lmig.gfc.wimp.models.Awards;
import com.lmig.gfc.wimp.models.Movie;
import com.lmig.gfc.wimp.repositories.ActorRepository;
import com.lmig.gfc.wimp.repositories.AwardsRepository;

@RestController
@RequestMapping("/api/actors/{actorId}/awards")
public class AwardsApiController {

	private AwardsRepository awardRepository;
	private ActorRepository actorRepository;

	public AwardsApiController(AwardsRepository awardRepository, ActorRepository actorRepository) {
		this.awardRepository = awardRepository;
		this.actorRepository = actorRepository;

	}
	
	@GetMapping("")
	public List<Awards> getAll() {
		return awardRepository.findAll();
	}

	@PostMapping("")
	public Awards create(@PathVariable Long actorId, @RequestBody Awards award) {
		Actor actor = actorRepository.findOne(actorId);
		award.setActor(actor);
		awardRepository.save(award);
		return award;

	}

	public AwardsRepository getAwardRepository() {
		return awardRepository;
	}

	public void setAwardRepository(AwardsRepository awardRepository) {
		this.awardRepository = awardRepository;
	}

	public ActorRepository getActorRepository() {
		return actorRepository;
	}

	public void setActorRepository(ActorRepository actorRepository) {
		this.actorRepository = actorRepository;
	}

}
