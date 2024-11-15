package com.danichagas.dslist.controllers;

import com.danichagas.dslist.dto.GameDTO;
import com.danichagas.dslist.dto.GameListDTO;
import com.danichagas.dslist.dto.GameMinDTO;
import com.danichagas.dslist.services.GameListService;
import com.danichagas.dslist.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;

    @GetMapping
    public List<GameListDTO> findAll() {
       List<GameListDTO> result =  gameListService.findAllGames();
       return result;
    }
}
