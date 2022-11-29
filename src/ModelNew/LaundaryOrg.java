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
public class LaundaryOrg extends Org {
    private List<LaundaryServ> listOfLaundaryMan;

    public LaundaryOrg(String name, String phone, String city) {
        super(name, phone, city);
        listOfLaundaryMan = new ArrayList<>();
    }

    public List<LaundaryServ> getListOfLaundaryMan() {
        return listOfLaundaryMan;
    }

    public void setListOfLaundaryMan(List<LaundaryServ> listOfLaundaryMan) {
        this.listOfLaundaryMan = listOfLaundaryMan;
    }

    public void addLaundaryman(String name, String city, String user, String pwd1) {
        LaundaryServ LStaff = new LaundaryServ(name, city, user, pwd1);
        listOfLaundaryMan.add(LStaff);
        System.out.println("DeliMan manager added is " + listOfLaundaryMan.size());
    }

    public void dltManager(Manager man) {
       listOfManager.remove(man);
    }
}
