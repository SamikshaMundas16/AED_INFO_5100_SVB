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
public class HClub extends Enterprise {
    
    private List<Manager> listOfManager;
    private List<PhyOrg> listOfPhyOrg;
    private List<TrainerOrg> listOfTrainerOrg;
    private List<TherapyOrg> listOfTherapyOrg;

    HClub(String name, String phone) {
        super(name, phone);
        listOfManager = new ArrayList<>();
        listOfPhyOrg = new ArrayList<>();
        listOfTrainerOrg = new ArrayList<>();
        listOfTherapyOrg = new ArrayList<>();
    }

    public List<TherapyOrg> getListOfTherapyOrg() {
        return listOfTherapyOrg;
    }

    public void setListOfTherapyOrg(List<TherapyOrg> listOfTherapyOrg) {
        this.listOfTherapyOrg = listOfTherapyOrg;
    }

    public List<PhyOrg> getListOfPhyOrg() {
        return listOfPhyOrg;
    }

    public void setListOfPhyOrg(List<PhyOrg> listOfPhyOrg) {
        this.listOfPhyOrg = listOfPhyOrg;
    }

    public List<TrainerOrg> getListOfTrainerOrg() {
        return listOfTrainerOrg;
    }

    public void setListOfTrainerOrg(List<TrainerOrg> listOfTrainerOrg) {
        this.listOfTrainerOrg = listOfTrainerOrg;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public Manager addManager(String name, String uName, String pwd) {
        Manager manager = new Manager(name, uName, pwd);
        listOfManager.add(manager);
        System.out.println("size of manager in health club is " + listOfManager.size() + " name is " + manager.getuName());
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

    public void addPhyOrg(String name, String phone, String city) {
        PhyOrg PhyOrg = new PhyOrg(name, phone, city);
        listOfPhyOrg.add(PhyOrg);
    }

    public void addTherapyOrg(String name, String phone, String city) {
        TherapyOrg TherapyOrg = new TherapyOrg(name, phone, city);
        listOfTherapyOrg.add(TherapyOrg);
    }

    public void addTraineOrg(String name, String phone, String networkName) {
        TrainerOrg trainerOrg = new TrainerOrg(name, phone, networkName);
        listOfTrainerOrg.add(trainerOrg);
    }
    
    public String toString() {
        return name;
    }

    public void dltManager(Manager man) {
        listOfManager.remove(man);
    }

    public void dltPhy(PhyOrg Phy) {
      listOfPhyOrg.remove(Phy);
    }

    public void dltTrainer(TrainerOrg trainer) {
        listOfTrainerOrg.remove(trainer);
    }

    public void dltTherapy(TherapyOrg Therapy) {
           listOfTherapyOrg.remove(Therapy);
    }
}
