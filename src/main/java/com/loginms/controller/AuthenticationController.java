package com.loginms.controller;


import org.springframework.web.bind.annotation.CrossOrigin;
import com.loginms.dto.JwtAuthenticationResponse;
import com.loginms.dto.RefreshTokenRequest;
import com.loginms.dto.SignUpRequest;
import com.loginms.dto.SigninRequest;
import com.loginms.entities.User;
import com.loginms.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/signup")
    public ResponseEntity<User> signup(@RequestBody SignUpRequest signUpRequest){
        return ResponseEntity.ok(authenticationService.signup(signUpRequest));
    }

    @PostMapping("/signin")
    public ResponseEntity<JwtAuthenticationResponse> signin(@RequestBody SigninRequest signinRequest){
        return ResponseEntity.ok(authenticationService.sigin(signinRequest));
    }
    @PostMapping("/refresh")
    public ResponseEntity<JwtAuthenticationResponse> token(@RequestBody RefreshTokenRequest refreshTokenRequest){
        return ResponseEntity.ok(authenticationService.refreshToken(refreshTokenRequest));
    }
}

