package com.carobaprojetos.dslist.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.carobaprojetos.dslist.model.Game;
import com.carobaprojetos.dslist.repository.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRep;
	
	public Iterable<Game> findAll(){
		Iterable<Game> result = gameRep.findAll(Sort.unsorted());
		
		return result;
	}
}
