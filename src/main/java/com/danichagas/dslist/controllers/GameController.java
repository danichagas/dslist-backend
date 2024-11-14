package com.danichagas.dslist.controllers;

import com.danichagas.dslist.dto.GameMinDTO;
import com.danichagas.dslist.entities.Game;
import com.danichagas.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameService gameService;

    @GetMapping
    public List<GameMinDTO> findAll() {
       List<GameMinDTO> result =  gameService.findAllGames();
       return result;
    }
}
