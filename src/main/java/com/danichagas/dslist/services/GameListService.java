package com.danichagas.dslist.services;

import com.danichagas.dslist.dto.GameDTO;
import com.danichagas.dslist.dto.GameListDTO;
import com.danichagas.dslist.dto.GameMinDTO;
import com.danichagas.dslist.entities.Game;
import com.danichagas.dslist.entities.GameList;
import com.danichagas.dslist.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameListService {
    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAllGames() {
        List<GameList> result = gameListRepository.findAll();
        return result.stream().map(x -> new GameListDTO(x)).toList();
    }
}
