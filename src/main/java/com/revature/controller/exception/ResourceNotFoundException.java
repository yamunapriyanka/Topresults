package com.revature.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException {


  private static final long serialVersionUID = 1L;

  public ResourceNotFoundException() {}

  public ResourceNotFoundException(String message) {
    super(message);
  }

  public ResourceNotFoundException(Exception e) {
    super(e);
  }

  public ResourceNotFoundException(String message, Exception e) {
    super(message, e);
  }



}
