package com.rochatf.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rochatf.dspesquisa.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	

}
