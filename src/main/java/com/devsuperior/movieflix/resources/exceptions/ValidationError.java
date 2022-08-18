package com.devsuperior.movieflix.resources.exceptions;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError{

    private List<FieldMessage> errors = new ArrayList<>();

    public ValidationError() {
    }

    public List<FieldMessage> getErrors() {
        return errors;
    }

    public void addErrors(String fieldMessage, String message) {
        errors.add(new FieldMessage(fieldMessage, message));
    }
}
