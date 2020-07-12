package com.microservice.moviecatolog.controller;

import com.microservice.moviecatolog.model.CatalogItem;
import com.microservice.moviecatolog.model.MovieItem;
import com.microservice.moviecatolog.model.Rating;
import com.microservice.moviecatolog.model.UserRating;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/catalog")
public class ApiController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping(path="/{userId}", produces = MediaType.APPLICATION_JSON_VALUE )
    public List<CatalogItem> getCatalog(@PathVariable("userId")  String userId)
    {
        UserRating userRating = restTemplate.getForObject("http://ratings-data-service/rating/users/"+userId,UserRating.class);
        List<Rating> ratings= userRating.getRatings();


     return ratings.stream().map(rating -> {
            MovieItem movieItem= restTemplate.getForObject("http://movie-info-service/movies/"+rating.getMovieId(), MovieItem.class);
             return new CatalogItem(movieItem.getName(), "desc",rating.getRating());
        }).collect(Collectors.toList());

    }



}
