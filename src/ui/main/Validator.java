/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.main;

import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author Samikshan
 */
public class Validator {
    
    private Validator() {

    }

    public static boolean validateName(JPanel obj, String name) {
        if (name != null && name.matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(obj, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public static boolean validatepwd(JPanel obj, String pwd) {
        if (pwd != null && pwd.length() > 2) {
            return true;
        } else {
            JOptionPane.showMessageDialog(obj, "Invalid input : pwd should contain 3 or more characters.");
            return false;
        }
    }

    public static boolean validateuName(JPanel obj, String uName) {
        if (uName != null && uName.length() > 1) {
            return true;
        }
        JOptionPane.showMessageDialog(obj, "Invalid input : uName should contain 2 or more charactewrs");
        return false;
    }
    
}
