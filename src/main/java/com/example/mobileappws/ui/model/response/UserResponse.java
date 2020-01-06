package com.example.mobileappws.ui.model.response;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class UserResponse {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;
}
