package com.mailserver.back.service.implement;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mailserver.back.dto.request.auth.IdCheckRequestDto;
import com.mailserver.back.dto.response.ResponseDto;
import com.mailserver.back.dto.response.auth.IdCheckResponseDto;
import com.mailserver.back.repository.UserRepository;
import com.mailserver.back.service.AuthService;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AuthServiceImplement implements AuthService {

  private final UserRepository userRepository;

  @Override
  public ResponseEntity<? super IdCheckResponseDto> idCheck(IdCheckRequestDto dto) {
    try {
      String userId = dto.getId();
      boolean isExistId = userRepository.existsByUserId(userId);
      if (isExistId)
        return IdCheckResponseDto.duplicateId();

    } catch (Exception exception) {
      exception.printStackTrace();
      return ResponseDto.databaseError();
    }
    return IdCheckResponseDto.success();
  }

}
