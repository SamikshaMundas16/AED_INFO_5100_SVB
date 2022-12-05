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
public abstract class Org {
    protected String name;
    protected String city;
    protected String phone;
    protected List<Manager> listOfManager;

    public Org(String name, String phone, String city) {
        this.name = name;
        this.city = city;
        this.phone = phone;
        this.listOfManager = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }
    
    public Manager addManager(String name, String city, String user, String pwd) {
        Manager manager = new Manager(name, user, pwd);
        listOfManager.add(manager);
        return manager;
    }
    
    
    public String toString() {
        return name;
    }
}
