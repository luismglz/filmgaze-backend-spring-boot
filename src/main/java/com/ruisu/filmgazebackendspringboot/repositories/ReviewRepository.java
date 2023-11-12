package com.ruisu.filmgazebackendspringboot.repositories;

import com.ruisu.filmgazebackendspringboot.entities.Review;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends MongoRepository<Review, ObjectId> {
}
