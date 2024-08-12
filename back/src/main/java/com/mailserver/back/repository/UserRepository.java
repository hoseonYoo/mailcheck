package com.mailserver.back.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

@Repository
public interface UserRepository extends JpaRepository<UserRepository, String> {

}
