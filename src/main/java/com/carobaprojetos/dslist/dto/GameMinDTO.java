package com.carobaprojetos.dslist.dto;

import com.carobaprojetos.dslist.model.Game;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class GameMinDTO {
	private Long id;
	private String title;
	private Integer year;
	private double score;
	private String imgUrl;
	
	
	public GameMinDTO(Game game) {
		this.id = game.getId();
		this.title = game.getTitle();
		this.year = game.getYear();
		this.score = game.getScore();
		this.imgUrl = game.getImgUrl();
	}

	
	
}
