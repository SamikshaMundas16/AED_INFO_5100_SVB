/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

/**
 *
 * @author Samikshan
 */
public class Network {
    private String name;
    private entDir entDir;

    public Network(String name) {
        this.name = name;
        entDir = new entDir();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public entDir getentDir() {
        return entDir;
    }

    public void setentDir(entDir entDir) {
        this.entDir = entDir;
    }
   

    public String toString()

    {
        return name;
    }
    
}
