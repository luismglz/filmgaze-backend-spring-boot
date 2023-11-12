package com.ruisu.filmgazebackendspringboot.services;

import com.ruisu.filmgazebackendspringboot.entities.Movie;
import com.ruisu.filmgazebackendspringboot.entities.Review;
import com.ruisu.filmgazebackendspringboot.repositories.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    @Autowired
    private MongoTemplate mongoTemplate;

    public Review createReview(String body, String imdbId){
        Review review = reviewRepository.insert(new Review(body));


        mongoTemplate.update(Movie.class)
                .matching(Criteria.where("imdbId").is(imdbId))
                .apply(new Update().push("reviewIds").value(review))
                .first();

        return review;
    }
}
