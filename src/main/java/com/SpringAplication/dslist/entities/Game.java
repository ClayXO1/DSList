package com.SpringAplication.dslist.entities;

import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_game")
public class Game {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String titulo;
	private Integer ano;
	private String genero;
	private String plataformas;
	private Double score;
	private String imgUrl;

	@Column(columnDefinition = "TEXT")
	private String shortDescription;

	@Column(columnDefinition = "TEXT")
	private String longDescription;

	public Game() {

	}

	public Game(Long id, String titulo, Integer ano, String genero, String plataformas, Double score, String imgUrl,
			String shorDescription, String longDescription) {
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.ano = ano;
		this.plataformas = plataformas;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shorDescription;
		this.longDescription = longDescription;
	}

	public Long getID() {
		return id;
	}

	public void setID(Long iD) {
		id = iD;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Integer getAno() {
		return ano;
	}

	public void setAno(Integer ano) {
		this.ano = ano;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(String plataformas) {
		this.plataformas = plataformas;
	}

	public Double getScore() {
		return score;
	}

	public void setScore(Double score) {
		this.score = score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public String getShorDescription() {
		return shortDescription;
	}

	public void setShorDescription(String shorDescription) {
		this.shortDescription = shorDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}

}
