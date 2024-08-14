package com.mailserver.back.service;

import org.springframework.http.ResponseEntity;

import com.mailserver.back.dto.request.auth.IdCheckRequestDto;
import com.mailserver.back.dto.response.auth.IdCheckResponseDto;

public interface AuthService {
  ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto);
}
