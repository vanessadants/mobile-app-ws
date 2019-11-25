package com.example.mobileappws.ui.model.response;

public class User{
    private String userId;
    private String firstName;
    private String lastName;
    private String email;

    private User(UserBuilder builder) {
        this.userId = builder.userId;
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
    }

    public static UserBuilder builder(){
        return new UserBuilder();
    }

    private static class UserBuilder {
        private String userId;
        private String firstName;
        private String lastName;
        private String email;

        private UserBuilder() {
        }

        public UserBuilder withUserId(String userId) {
            this.userId = userId;
            return this;
        }

        public UserBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public User build(){
            return new User(this);
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
