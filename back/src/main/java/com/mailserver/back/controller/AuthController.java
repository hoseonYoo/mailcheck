package com.mailserver.back.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mailserver.back.dto.request.auth.IdCheckRequestDto;
import com.mailserver.back.dto.response.auth.IdCheckResponseDto;
import com.mailserver.back.service.AuthService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

  private final AuthService authService;

  @PostMapping("/id-check")
  public ResponseEntity<? super IdCheckResponseDto> idCheck(
      @RequestBody @Valid IdCheckRequestDto requestBody) {
    ResponseEntity<? super IdCheckResponseDto> response = authService.idCheck(requestBody);
    return response;
  }

}
