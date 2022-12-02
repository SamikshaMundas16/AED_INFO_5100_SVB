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
public class TransportOrg extends Org  {
    private List<Transportation> listOfTransportation;

    public TransportOrg(String name, String phone, String city) {
        super(name, phone, city);
        listOfTransportation = new ArrayList<>();
    }

    public List<Transportation> getListOfTransportation() {
        return listOfTransportation;
    }

    public void setListOfTransportation(List<Transportation> listOfTransportation) {
        this.listOfTransportation = listOfTransportation;
    }

    public void addTransportationman(String name, String city, String user, String pwd1) {
        Transportation transportation = new Transportation(name, city, user, pwd1);
        listOfTransportation.add(transportation);
        System.out.println("DeliMan manager added is " + listOfTransportation.size());
    }

    public void dltManager(Manager man) {
       listOfManager.remove(man);
    }
}
