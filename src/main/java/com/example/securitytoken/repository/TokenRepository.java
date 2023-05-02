package com.example.securitytoken.repository;

import com.example.securitytoken.model.Token;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.Instant;

public interface TokenRepository extends JpaRepository<Token, String> {

    void deleteAllByExpiredDataIsBefore(Instant now);
}
