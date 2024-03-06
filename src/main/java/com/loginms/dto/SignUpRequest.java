package com.loginms.dto;

import lombok.Data;

@Data
public class SignUpRequest {

    private long sapid;
    private String name;
    private String email;
    private String password;
}
