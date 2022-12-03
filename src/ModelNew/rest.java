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
public class rest extends Enterprise {
    private List<Manager> listOfManager;
    private List<Order> listOfOrder;
    private List<MenuContents> listOfItem;
    private List<DeliManOrg> listOfDeliManOrg;

    public rest(String name, String phone) {
        super(name, phone);
        listOfManager = new ArrayList<>();
        listOfOrder = new ArrayList<>();
        listOfItem = new ArrayList<>();
        listOfDeliManOrg = new ArrayList<>();
    }

    public List<MenuContents> getListOfItem() {
        return listOfItem;
    }

    public void setListOfItem(List<MenuContents> ListOfItem) {
        this.listOfItem = ListOfItem;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public List<Order> getListOfOrder() {
        return listOfOrder;
    }

    public void setListOfOrder(List<Order> listOfOrder) {
        this.listOfOrder = listOfOrder;
    }

    public List<DeliManOrg> getListOfDeliManOrg() {
        return listOfDeliManOrg;
    }

    public void setListOfDeliManOrg(List<DeliManOrg> listOfDeliManOrg) {
        this.listOfDeliManOrg = listOfDeliManOrg;
    }

    public Manager addManager(String name, String uName, String pwd) {
        Manager manager = new Manager(name, uName, pwd);
        listOfManager.add(manager);
        return manager;
    }

    public Manager findManager(String uName) {
        for (Manager man : listOfManager) {
            if (man.getuName().equals(uName)) {
                return man;
            }
        }
        return null;
    }

    public void addDeliManOrg(String name, String phone, String networkName) {
        DeliManOrg del = new DeliManOrg(name, phone, networkName);
        listOfDeliManOrg.add(del);
    }

    public void addItem(String item, int price) {
        listOfItem.add(new MenuContents(item, price));
    }

    public void dltManager(Manager man) {
        listOfManager.remove(man);
    }
}
