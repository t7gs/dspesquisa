package com.rochatf.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rochatf.dspesquisa.entities.Genre;

public interface GenreRepository extends JpaRepository<Genre, Long> {
	

}
