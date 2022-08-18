package com.devsuperior.movieflix.dto;

import com.devsuperior.movieflix.entities.Movie;
import com.devsuperior.movieflix.entities.Review;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MovieReviewDTO implements Serializable {

    private String title;
    private String subTitle;
    private Integer year;
    private String imgUrl;
    private String synopsis;

    private List<ShortReviewResponseDTO> reviews = new ArrayList<ShortReviewResponseDTO>();

    public MovieReviewDTO() {
    }

    public MovieReviewDTO(String title, String subTitle, Integer year, String imgUrl, String synopsis, List<ShortReviewResponseDTO> reviews) {
        this.title = title;
        this.subTitle = subTitle;
        this.year = year;
        this.imgUrl = imgUrl;
        this.synopsis = synopsis;
        this.reviews = reviews;
    }

    public MovieReviewDTO(Movie movie) {
        title = movie.getTitle();
        subTitle = movie.getSubTitle();
        year = movie.getYear();
        imgUrl = movie.getImgUrl();
        synopsis = movie.getSynopsis();
    }

    public MovieReviewDTO(Movie movie, List<Review> reviews) {
        title = movie.getTitle();
        subTitle = movie.getSubTitle();
        year = movie.getYear();
        imgUrl = movie.getImgUrl();
        synopsis = movie.getSynopsis();
        reviews.forEach(rev -> this.reviews.add(new ShortReviewResponseDTO(rev)));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public List<ShortReviewResponseDTO> getReviews() {
        return reviews;
    }

}
