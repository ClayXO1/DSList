package com.SpringAplication.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.SpringAplication.dslist.entities.Game;
import com.SpringAplication.dslist.repositories.GameRepository;

@Service
public class GameService {
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<Game> findAll(){
		List<Game> result = gameRepository.findAll();
		return result;
	}
}
