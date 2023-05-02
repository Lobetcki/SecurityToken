package com.example.securitytoken.repository;

import com.example.securitytoken.model.SerialSecret;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SerialSecretRepository extends JpaRepository<SerialSecret, String> {

    Boolean existsBySecretAndSerial(String secret, String serial);
}
