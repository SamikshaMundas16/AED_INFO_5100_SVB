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
public class PhyOrg extends Org {
    List<Phy> listOfPhy;

    public PhyOrg(String name, String phone, String city) {
        super(name, phone, city);
        listOfPhy = new ArrayList<>();
    }

    public List<Phy> getListOfPhy() {
        return listOfPhy;
    }

    public void setListOfPhy(List<Phy> listOfPhy) {
        this.listOfPhy = listOfPhy;
    }

    public void addPhy(String name, String city, String user, String pwd1) {
        Phy Phy = new Phy(name, city, user, pwd1);
        listOfPhy.add(Phy);
        System.out.println("Physisicna manager added is " + listOfPhy.size());
    }

    public void dltManager(Manager man) {
        listOfManager.remove(man);
    }
}
