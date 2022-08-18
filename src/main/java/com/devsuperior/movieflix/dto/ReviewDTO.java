package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

public class ReviewDTO implements Serializable {

    private Long id;

    @NotBlank(message = "Enter a valid review")
    private String text;
    private Long movieId;

    public ReviewDTO() {
    }

    public ReviewDTO(String text, Long movieId) {
        this.text = text;
        this.movieId = movieId;
    }

    public ReviewDTO(Review review) {
        this.text = review.getText();
        this.movieId = review.getId();
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }
}
