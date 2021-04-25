package com.example.admin.myapplication.Entity;

public class UserEntity extends BaseEntity {
    public UserEntity(String id, String userName, String email, String adress) {
        this.id = id;
        this.userName = userName;
        this.email = email;
        this.adress = adress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    private String id;
    private String userName;
    private String email;
    private String adress;

}
