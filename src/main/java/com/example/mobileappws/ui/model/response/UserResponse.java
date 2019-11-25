package com.example.mobileappws.ui.model.response;

public class UserResponse {
    private String userId;
    private String firstName;
    private String lastName;
    private String email;


    private UserResponse(UserResponseBuilder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public static UserResponseBuilder builder(){
        return new UserResponseBuilder();
    }

    public static class UserResponseBuilder {
        private String userId;
        private String firstName;
        private String lastName;
        private String email;

        private UserResponseBuilder() {
        }

        public UserResponseBuilder withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserResponseBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserResponseBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserResponseBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserResponse build(){
            return new UserResponse(this);
        }
    }

    public String getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
