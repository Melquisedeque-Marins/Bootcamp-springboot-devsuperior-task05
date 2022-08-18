package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Review;

import java.io.Serializable;

public class ShortReviewResponseDTO implements Serializable {
    private String Text;
    private String userName;

    public ShortReviewResponseDTO() {
    }

    public ShortReviewResponseDTO(String text, String userName) {
        Text = text;
        this.userName = userName;
    }

    public ShortReviewResponseDTO(Review review) {
        Text = review.getText();
        userName = review.getUser().getName();
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
