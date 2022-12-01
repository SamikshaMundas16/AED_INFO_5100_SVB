/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew.services;

import java.util.Date;
import ModelNew.rest;
import static ModelNew.services.Service.TAB;


/**
 *
 * @author Samikshan
 */
public class restService extends Service {

    private String MenuContents;

    public restService(rest res, Date eventDate, String MenuContents, int price) {
        super(res, Service.ServiceType.RESTURANT, eventDate);
        this.MenuContents = MenuContents;
        super.totalprice = price;
    }

    public String getMenuContents() {
        return MenuContents;
    }

    public void setMenuContents(String MenuContents) {
        this.MenuContents = MenuContents;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nrest order dtls:");
        sb.append("\n").append(TAB).append("rest name: ").append(enterprise);
        sb.append("\n").append(TAB).append("Order item: ").append(MenuContents);
        sb.append("\n").append(TAB).append("Total price for rest: $").append(totalprice);
        sb.append("\n").append(TAB).append("Date of order: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());
        return sb.toString();
    }
}

