package com.example.photography.model;

public class PhotoGrapher {
    public String email;
    public String password;
    public String profilePic;

    public PhotoGrapher(String email, String password, String profilePic) {
        this.email = email;
        this.password = password;
        this.profilePic = profilePic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }
}
