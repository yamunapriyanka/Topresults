package com.revature.controller.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST)
public class InvalidInputException extends RuntimeException {


  private static final long serialVersionUID = 1L;

  public InvalidInputException() {}

  public InvalidInputException(String message) {
    super(message);
  }

  public InvalidInputException(Exception e) {
    super(e);
  }

  public InvalidInputException(String message, Exception e) {
    super(message, e);
  }



}
