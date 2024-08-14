package com.mailserver.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mailserver.back.entity.UserEntity;

@Repository
public interface UserRepository extends JpaRepository<UserRepository, String> {

  boolean existsByUserId(String userId);

  UserEntity findByUserId(String userId);

}
