package com.devsuperior.movieflix.services;

import com.devsuperior.movieflix.dto.GenreDTO;
import com.devsuperior.movieflix.dto.ReviewDTO;
import com.devsuperior.movieflix.dto.ReviewResponseDTO;
import com.devsuperior.movieflix.entities.Genre;
import com.devsuperior.movieflix.entities.Review;
import com.devsuperior.movieflix.entities.User;
import com.devsuperior.movieflix.repositories.GenreRepository;
import com.devsuperior.movieflix.repositories.MovieRepository;
import com.devsuperior.movieflix.repositories.ReviewRepository;
import com.devsuperior.movieflix.repositories.UserRepository;
import com.devsuperior.movieflix.services.exceptions.ResourceNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository repository;

    @Autowired
    private MovieRepository movieRepository;

    @Autowired
    private AuthService authService;

    @Transactional(readOnly = true)
    public Review findById(Long id){
        Optional<Review> opt = repository.findById(id);
        Review review = opt.orElseThrow(() -> new ResourceNotFoundException("Review not found for id:" + id));
        return review;
    }

    @PreAuthorize("hasRole('MEMBER')")
    @Transactional
    public ReviewResponseDTO insert(ReviewDTO dto){
        User user = authService.authenticated();
        Review entity = new Review();
        entity.setText(dto.getText());
        entity.setMovie(movieRepository.getOne(dto.getMovieId()));
        entity.setUser(user);
        Review review = repository.save(entity);
        return new ReviewResponseDTO(review);
    }
}
