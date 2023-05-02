package com.example.securitytoken.dto;

import com.example.securitytoken.model.Token;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TokenDTO {
        private String uuid;

        public static TokenDTO fromToken(Token token) {
                TokenDTO tokenDTO = new TokenDTO();
                tokenDTO.setUuid(token.getUuid());
                return tokenDTO;
        }

}
