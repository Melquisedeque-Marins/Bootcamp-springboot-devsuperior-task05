package com.devsuperior.movieflix.repositories;

import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
