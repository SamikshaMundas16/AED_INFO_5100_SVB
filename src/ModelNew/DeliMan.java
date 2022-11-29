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
public class DeliMan extends Person {

    private String city;
    List<Order> list = new ArrayList<>();

    public DeliMan(String name, String city, String uName, String pwd) {
        this.name = name;
        this.pwd = pwd;
        this.uName = uName;
        this.city = city;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Order> getList() {
        return list;
    }

    public void setList(List<Order> list) {
        this.list = list;
    }

    public void addOrder(Order order) {
        list.add(order);
    }

    public Order findOrder(String orderId) {
        for (int i = 0; i < list.size(); i++) {
            if (orderId.equals(list.get(i).getId())) {
                return list.get(i);
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return name;
    }

}
