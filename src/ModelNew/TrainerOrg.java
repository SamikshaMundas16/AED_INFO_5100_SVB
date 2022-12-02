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
public class TrainerOrg extends Org {
    private List<Trainer> listOfTrainer;

    public TrainerOrg(String name, String phone, String city) {
        super(name, phone, city);
        listOfTrainer = new ArrayList<>();
    }
    
    public void addTrainer(String name, String city, String user, String pwd1) {
        Trainer trainer = new Trainer(name, city, user, pwd1);
        listOfTrainer.add(trainer);
    }
      public void dltManager(Manager man) {
     listOfManager.remove(man);
    }
}
