package com.carobaprojetos.dslist.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.carobaprojetos.dslist.dto.GameMinDTO;
import com.carobaprojetos.dslist.model.Game;
import com.carobaprojetos.dslist.repository.GameRepository;

@RestController
@RequestMapping("api/game")
public class GameRestController {
	
	@Autowired
	private GameRepository gameRep;
	
	@RequestMapping(value = "", method = RequestMethod.GET)
	public Iterable<Game> findAll(){
		Iterable<Game> lista = gameRep.findAll(Sort.unsorted());
		return lista;
	}
}
