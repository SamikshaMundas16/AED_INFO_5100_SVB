/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samikshan
 */
public class LaundaryServ {
    private String name;
    private String city;
    private String pwd;
    private String uName;

    List<Order> list = new ArrayList<>();

    public LaundaryServ(String name, String city, String uName, String pwd) {
        this.name = name;
        this.pwd = pwd;
        this.uName = uName;
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
