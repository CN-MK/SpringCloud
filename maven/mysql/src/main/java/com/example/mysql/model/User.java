package com.example.mysql.model;

public class User {
    private Long id;
    private String name;
    private String pwd;
    private Character sex;
    private String mobile;
    private String email;
    private String avatar;
    private String status;


    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", sex=" + sex +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", avatar='" + avatar + '\'' +
                ", status='" + status + '\'' +
                '}';
    }

    public User() {
    }

    public User(String name, String pwd, Character sex, String mobile, String email, String avatar, String status) {
        this.name = name;
        this.pwd = pwd;
        this.sex = sex;
        this.mobile = mobile;
        this.email = email;
        this.avatar = avatar;
        this.status = status;
    }

    public User(String name, String pwd) {
        this.name = name;
        this.pwd = pwd;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public Character getSex() {
        return sex;
    }

    public void setSex(Character sex) {
        this.sex = sex;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
