package com.ruisu.filmgazebackendspringboot.services;

import com.ruisu.filmgazebackendspringboot.entities.Movie;
import com.ruisu.filmgazebackendspringboot.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> allMovies(){
        return movieRepository.findAll();
    }
}
