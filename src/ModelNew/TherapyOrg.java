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
public class TherapyOrg extends Org {
    private List<Therapy> listOfTherapy;

    public TherapyOrg(String name, String phone, String city) {
        super(name, phone, city);
        listOfTherapy = new ArrayList<>();
    }

    public List<Therapy> getListOfTherapy() {
        return listOfTherapy;
    }

    public void setListOfTherapy(List<Therapy> listOfTherapy) {
        this.listOfTherapy = listOfTherapy;
    }

    public void addTherapy(String name, String city, String user, String pwd1) {
        Therapy Therapy = new Therapy(name, city, user, pwd1);
        listOfTherapy.add(Therapy);
    }

    public void dltManager(Manager man) {
        listOfManager.remove(man);
    }

}
