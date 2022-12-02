/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.Date;

/**
 *
 * @author Samikshan
 */
public class Trainer {
    private String name;
    private String city;
    private String phone;
    private String uName;
    private String pwd;

    public Trainer(String name, String phone, String city, String uName, String pwd) {
           this.name = name;
           this.phone = phone;
           this.city = city;
           this.uName = uName;
           this.pwd = pwd;
    }

    Trainer(String name, String city, String user, String pwd1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of genecostd methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getuName() {
        return uName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getphone() {
        return phone;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

}
