package com.loginms.services;


import com.loginms.dto.JwtAuthenticationResponse;
import com.loginms.dto.RefreshTokenRequest;
import com.loginms.dto.SignUpRequest;
import com.loginms.dto.SigninRequest;
import com.loginms.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse sigin(SigninRequest signinRequest);
    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);
}