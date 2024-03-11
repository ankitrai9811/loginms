package com.loginms.services;


import com.loginms.dto.*;
import com.loginms.entities.User;

public interface AuthenticationService {

    User signup(SignUpRequest signUpRequest);
    JwtAuthenticationResponse sigin(SigninRequest signinRequest);
    AccessTokenRequest refreshToken(RefreshTokenRequest refreshTokenRequest);
}