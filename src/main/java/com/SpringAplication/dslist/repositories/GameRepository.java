package com.SpringAplication.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.SpringAplication.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
	
}
