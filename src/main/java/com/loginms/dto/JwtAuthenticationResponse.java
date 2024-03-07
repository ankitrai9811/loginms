package com.loginms.dto;

import lombok.Data;

@Data
public class JwtAuthenticationResponse {

    private String accessToken;
    private String refreshToken;
    private long sapid;
    private String role;
    private String name;
}