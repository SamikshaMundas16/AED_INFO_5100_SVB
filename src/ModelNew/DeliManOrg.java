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

public class DeliManOrg extends Org{

    private List<DeliMan> listOfDeliMan;

  public DeliManOrg(String name, String phone, String city) {
        super(name, phone, city);
        this .listOfDeliMan = new ArrayList<>();
    }
  
    public List<DeliMan> getListOfDeliMan() {
        return listOfDeliMan;
    }

    public void setListOfDeliMan(List<DeliMan> listOfDeliMan) {
        this.listOfDeliMan = listOfDeliMan;
    }

    public void addDeliMan(String name, String city, String user, String pwd1) {
        DeliMan del = new DeliMan(name, city, user, pwd1);
        listOfDeliMan.add(del);
        System.out.println("DeliMan manager added is " + listOfDeliMan.size());
    }

    public void dltDeliMan(DeliManOrg del) {
     listOfDeliMan.remove(del);
    }

    public void dltManager(Manager man) {
      listOfManager.remove(man);
    }

}
