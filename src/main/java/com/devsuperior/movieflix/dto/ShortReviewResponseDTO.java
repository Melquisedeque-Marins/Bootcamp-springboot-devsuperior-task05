package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

import java.io.Serializable;

public class ShortReviewResponseDTO implements Serializable {

    private Long id;
    private String Text;
    private Long movieId;
    private ShortUserDTO user;

    public ShortReviewResponseDTO() {
    }

    public ShortReviewResponseDTO(Long id, String text, Long movieId, ShortUserDTO user) {
        this.id = id;
        Text = text;
        this.user = user;
    }

    public ShortReviewResponseDTO(Review review) {
        id = review.getId();
        Text = review.getText();
        movieId = review.getMovie().getId();
        user = new ShortUserDTO(review.getUser());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public ShortUserDTO getUser() {
        return user;
    }

    public void setUser(ShortUserDTO user) {
        this.user = user;
    }
}
