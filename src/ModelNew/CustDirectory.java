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
public class CustDirectory {
    private List<Cust> listOfCust;

    public CustDirectory() {
        listOfCust = new ArrayList<>();
    }

    public List<Cust> getListOfCust() {
        return listOfCust;
    }

    public void setListOfCust(List<Cust> listOfCust) {
        this.listOfCust = listOfCust;
    }

    public Cust addCust() {
        Cust Cust = new Cust();
        listOfCust.add(Cust);
        return Cust;
    }

    public Cust findCustuName(String uName) {
        for (int i = 0; i < listOfCust.size(); i++) {
            if (listOfCust.get(i).getuName().equals(uName)) {
                return listOfCust.get(i);
            }
        }
        return null;
    }
}
