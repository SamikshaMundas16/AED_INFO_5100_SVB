/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

/**
 *
 * @author Samikshan
 */
public class PhotoService extends Org {
    public static enum PhotoType {
        STANDARD(50, "Standard", "Includes 1 candid photograher"),
        GOLD(100, "Gold", "Includes 1 candid photograher and 1 videographer"),
        PLATINUM(200, "Platinum", "Includes 2 candid photograhers and 2 videographers");

        private final int cost;
        private final String name;
        private final String desc;

        private PhotoType(int cost, String name, String desc) {
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
            return getName() + " (" + desc + ")";
        }
    }

    public PhotoService(String name, String phone, String city) {
        super(name, phone, city);
    }

    public Manager addManager(String name, String city, String user, String pwd1) {
        Manager manager = new Manager(name, user, pwd1);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getuName());
        return manager;
    }
     public void dltManager(Manager man) {
        listOfManager.remove(man);
    }
}
