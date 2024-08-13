package com.mailserver.back.handler;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.mailserver.back.dto.response.ResponseDto;

@RestControllerAdvice
public class ValidationExceptionHandler {

  @ExceptionHandler({ MethodArgumentNotValidException.class })
  public ResponseEntity<ResponseDto> ValidationExceptionHandler(Exception exception) {
    return ResponseDto.validationFail();
  }

}
