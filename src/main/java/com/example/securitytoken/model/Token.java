package com.example.securitytoken.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.Instant;

@Entity
@Table
@Getter
@Setter
public class Token {
    @Id
    private String uuid;
    private Instant expiredData;
    @ManyToOne
    private SerialSecret serialSecret;
}
