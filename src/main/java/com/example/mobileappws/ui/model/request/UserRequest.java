package com.example.mobileappws.ui.model.request;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;
}
