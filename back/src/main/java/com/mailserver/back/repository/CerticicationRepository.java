package com.mailserver.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mailserver.back.entity.CertificationEntity;

@Repository
public interface CerticicationRepository extends JpaRepository<CertificationEntity, String> {

}
