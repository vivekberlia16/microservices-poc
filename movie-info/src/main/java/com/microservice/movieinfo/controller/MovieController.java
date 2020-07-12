package com.microservice.movieinfo.controller;

import com.microservice.movieinfo.model.MovieInfo;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @RequestMapping("/{movieId}")
    public MovieInfo getMovieInfo(@PathVariable("movieId") int movieId)
    {
        return  new MovieInfo(123,"Transformers");
    }
}
