/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

/**
 *
 * @author Samikshan
 */
public class MenuContents {
    private String dtls;
    private int price;

    public MenuContents(String item, int price) {
        this.dtls = item;
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getdtls() {
        return dtls;
    }

    public void setdtls(String dtls) {
        this.dtls = dtls;
    }

    public String toString() {
        return dtls + " ($" + price + ")";
    }
}
