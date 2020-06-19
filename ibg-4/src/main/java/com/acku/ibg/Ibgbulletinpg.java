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
public class Ibgbulletinpg {
    private String name;
    private String email;
    private String location;
    private String code;
    private String send;

    @Override
    public String toString() {
        return "ibgbulletinpg{" + "name=" + name + ", email=" + email + ", location=" + location + ", code=" + code + ", send=" + send + '}';
    }

    public Ibgbulletinpg(String name, String email, String location, String code, String send) {
        this.name = name;
        this.email = email;
        this.location = location;
        this.code = code;
        this.send = send;
    }

    public Ibgbulletinpg() {
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getSend() {
        return send;
    }

    public void setSend(String send) {
        this.send = send;
    }
    
    
}
