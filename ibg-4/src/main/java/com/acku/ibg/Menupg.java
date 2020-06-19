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
public class Menupg {
   private String menu;
  private String order;

    @Override
    public String toString() {
        return "ibg2{" + "menu=" + menu + ", order=" + order + '}';
    }

    public Menupg(String menu, String order) {
        this.menu = menu;
        this.order = order;
    }

    public Menupg() {
    }

    public String getMenu() {
        return menu;
    }

    public void setMenu(String menu) {
        this.menu = menu;
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }
  
}
