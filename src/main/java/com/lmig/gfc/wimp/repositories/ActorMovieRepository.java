package com.lmig.gfc.wimp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface ActorMovieRepository<ActorMovie> extends JpaRepository<ActorMovie, Long> {

}
