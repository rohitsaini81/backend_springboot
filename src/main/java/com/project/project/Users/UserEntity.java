package com.project.project.Users;

import jakarta.persistence.*;

import java.util.UUID;


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

    public UserEntity(){
        this.id = UUID.randomUUID().toString();
    }
    public UserEntity(String id, String full_name, String email, String phone_number, String college, Integer age, String interest, String password) {
        this.id = UUID.randomUUID().toString();
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

    public void setInterest(String interest) {
        this.interest = interest;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setPassword(String password) {
        this.password = password;
    }
}


