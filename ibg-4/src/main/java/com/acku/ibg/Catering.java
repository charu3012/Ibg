/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.acku.ibg;

/**
 *
 * @author ashut
 */
public class Catering {
    private String name;
    private String email;
    private String phone;
    private String location;
    private String comment;
    private String code;
    private String submit;

    @Override
    public String toString() {
        return "catering{" + "name=" + name + ", email=" + email + ", phone=" + phone + ", location=" + location + ", comment=" + comment + ", code=" + code + ", submit=" + submit + '}';
    }

    public Catering(String name, String email, String phone, String location, String comment, String code, String submit) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.location = location;
        this.comment = comment;
        this.code = code;
        this.submit = submit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSubmit() {
        return submit;
    }

    public void setSubmit(String submit) {
        this.submit = submit;
    }
   
   
   
   
}
