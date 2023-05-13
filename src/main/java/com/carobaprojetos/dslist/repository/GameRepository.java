package com.carobaprojetos.dslist.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.carobaprojetos.dslist.model.Game;

public interface GameRepository extends PagingAndSortingRepository<Game, Long>{
	
}
