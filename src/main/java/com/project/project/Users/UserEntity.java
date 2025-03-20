package com.project.project.Users;

import jakarta.persistence.*;


@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    private String id;
    private String full_name;
    private String email;
    private String phone_number;
    private String college;
    private Integer age;
    private String interest;
    private String password;

    public UserEntity(){}
    public UserEntity(String id, String full_name, String email, String phone_number, String college, Integer age, String interest, String password) {
        this.id = id;
        this.full_name = full_name;
        this.email = email;
        this.phone_number = phone_number;
        this.college = college;
        this.age = age;
        this.interest = interest;
        this.password = password;
    }


    public String getId() {
        return id;
    }

    public String getFull_name() {
        return full_name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public String getCollege() {
        return college;
    }

    public Integer getAge() {
        return age;
    }

    public String getInterest() {
        return interest;
    }

    public String getPassword() {
        return password;
    }
}

