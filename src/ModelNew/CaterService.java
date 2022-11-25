/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.List;

/**
 *
 * @author Samikshan
 */

public class CaterService extends Org {

    public CaterService(String name, String phone, String city) {
        super(name, phone, city);
    }

    public enum CateringType {
        STANDARD(150, "Standard", "Includes 1 starter and 1 entreee"),
        GOLD(250, "Gold", "Includes 1 starter and 2 entrée"),
        PLATINUM(400, "Platinum", "Includes 2 starter, 2 entree and 1 dessert");

        private final int cost;
        private final String name;
        private final String desc;

        private CateringType(int cost, String name, String desc) {
            this.cost = cost;
            this.name = name;
            this.desc = desc;
        }

        public int getcost() {
            return cost;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + cost + "$ per night)";
        }
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

    public void setphone(String phone) {
        this.phone = phone;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public Manager addManager(String name, String city, String user, String pwd1) {
        Manager manager = new Manager(name, user, pwd1);
        listOfManager.add(manager);
        return manager;
    }

    public void dltManager(Manager man) {
        listOfManager.remove(man);
    }

}

