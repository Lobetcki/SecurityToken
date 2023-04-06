package com.example.securitytoken.controller;

import com.example.securitytoken.dto.LogIndication;
import com.example.securitytoken.dto.TokenDTO;
import com.example.securitytoken.model.SerialSecret;
import com.example.securitytoken.model.Token;
import com.example.securitytoken.service.IndicationService;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/indications")
public class IndicationController {

    private final IndicationService indicationService;

    public IndicationController(IndicationService indicationService) {
        this.indicationService = indicationService;
    }

    @PostMapping("/authority")
    public TokenDTO authority(@RequestBody SerialSecret serialSecret){
        return indicationService.authority(serialSecret);
    }

    @PostMapping
    public void indication(@RequestBody LogIndication logIndication, Authentication authentication) {
        Token principal = (Token) authentication.getPrincipal();
        indicationService.save(principal.getSerialSecret(), logIndication);
    }

    @GetMapping("/avg/{serial}")
    public Double avg(@PathVariable String serial) {
        return indicationService.calculateAvgIndication(serial);
    }


}
