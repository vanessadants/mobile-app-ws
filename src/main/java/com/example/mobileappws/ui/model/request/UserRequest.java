package com.example.mobileappws.ui.model.request;

public class UserRequest {
    private String firstName;
    private String lastName;
    private String email;
    private String password;

    private UserRequest(UserRequestBuilder builder) {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.email = builder.email;
        this.password = builder.password;
    }

    public static UserRequestBuilder builder(){
        return new UserRequestBuilder();
    }

    public static class UserRequestBuilder {
        private String firstName;
        private String lastName;
        private String email;
        private String password;

        private UserRequestBuilder() {
        }

        public UserRequestBuilder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public UserRequestBuilder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserRequestBuilder withEmail(String email) {
            this.email = email;
            return this;
        }

        public UserRequestBuilder withPassword(String password) {
            this.password = password;
            return this;
        }

        public UserRequest build(){
            return new UserRequest(this);
        }
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

    public String getPassword() {
        return password;
    }
}
