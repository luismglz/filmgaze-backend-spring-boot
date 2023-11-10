package com.ruisu.filmgazebackendspringboot.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/movies")
public class MovieController {

    @GetMapping
    public ResponseEntity<String> allMovies() {
        return ResponseEntity.ok("All movies");
    }

}