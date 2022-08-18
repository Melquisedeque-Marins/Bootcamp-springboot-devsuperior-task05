package com.devsuperior.movieflix.dto;

import java.io.Serializable;

public class ReviewDTO implements Serializable {

    private String text;
    private Long movieId;

    public ReviewDTO() {
    }

    public ReviewDTO(String text, Long movieId) {
        this.text = text;
        this.movieId = movieId;
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
