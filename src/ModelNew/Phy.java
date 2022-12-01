/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

/**
 *
 * @author Samikshan
 */
public class Phy extends Person {
    private String city;

    public Phy(String name, String city, String uName, String pwd) {
        this.name = name;
        this.city = city;
        this.uName = uName;
        this.pwd = pwd;
    }

    public String getCity() {
        return city;
    }
}
