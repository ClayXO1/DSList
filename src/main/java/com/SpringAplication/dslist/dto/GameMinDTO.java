package com.SpringAplication.dslist.dto;

import com.SpringAplication.dslist.entities.Game;

public class GameMinDTO {
	private Long id;
	private String titulo;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO(){
		
	}

	public GameMinDTO(Game entity) {
		super();
		this.id = entity.getID();
		this.titulo = entity.getTitulo();
		this.imgUrl = entity.getImgUrl();
		this.shortDescription = entity.getShorDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	
	

}
