package com.devsuperior.movieflix.resources.exceptions;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

public class OauthCustomError implements Serializable {

    private String error;

    @JsonProperty("error_description")
    private String descriptionError;

    public OauthCustomError() {
    }

    public OauthCustomError(String error, String descriptionError) {
        this.error = error;
        this.descriptionError = descriptionError;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getDescriptionError() {
        return descriptionError;
    }

    public void setDescriptionError(String descriptionError) {
        this.descriptionError = descriptionError;
    }
}
