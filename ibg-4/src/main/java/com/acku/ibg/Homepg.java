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
public class Homepg {
    private String url;
    private String newsletter;
    private String location;
    private String username; 
    private String password; 

    @Override
    public String toString() {
        return "ibg1{" + "url=" + url + ", newsletter=" + newsletter + ", location=" + location + ", username=" + username + ", password=" + password + '}';
    }

    public Homepg(String url, String newsletter, String location, String username, String password) {
        this.url = url;
        this.newsletter = newsletter;
        this.location = location;
        this.username = username;
        this.password = password;
    }

    public Homepg() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getNewsletter() {
        return newsletter;
    }

    public void setNewsletter(String newsletter) {
        this.newsletter = newsletter;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
}
