/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

/**
 *
 * @author Samikshan
 */
public class DecorServices extends Org {

    public DecorServices(String name, String phone, String city) {
        super(name, phone, city);
    }

    public enum DecorType {
        STANDARD(150, "Standard", "Includes ballon decoration"),
        GOLD(200, "Gold", "Includes flower decoration and fire-works"),
        PLATINUM(400, "Platinum", "Includes flower decoration,fire-works and customised cake");

        private final int cost;
        private final String name;
        private final String desc;

        private DecorType(int cost, String name, String desc) {
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

        public String getdesc() {
            return desc;
        }

        public String toString() {
            return name + "(" + desc + ")";
        }
    }

    public void dltManager(Manager man) {
        listOfManager.remove(man);
    }

}

