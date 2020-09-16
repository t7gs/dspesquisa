package com.rochatf.dspesquisa.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rochatf.dspesquisa.entities.Record;

public interface RecordRepository extends JpaRepository<Record, Long> {
	

}
