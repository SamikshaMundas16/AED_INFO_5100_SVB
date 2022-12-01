/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew.services;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import ModelNew.Book;
import ModelNew.BussEvent;

/**
 *
 * @author Samikshan
 */
public class BussEventService extends Service  {
    private Book id;

    public static enum BussEventServiceType {
        PHOTOGRAPHY,
        DECOR,
        CATERING
    }

    private Map<BussEventServiceType, Integer> BussEventServiceTypes;

    public BussEventService(BussEvent business, Date eventDate) {
        super(business, ServiceType.BUSINESS_EVENT, eventDate);
        this.BussEventServiceTypes = new HashMap<>();
    }

    public Map<BussEventServiceType, Integer> getBussEventServiceTypes() {
        return BussEventServiceTypes;
    }

    public void setBussEventServiceTypes(Map<BussEventServiceType, Integer> BussEventServiceTypes) {
        this.BussEventServiceTypes = BussEventServiceTypes;
    }

    public void addService(BussEventServiceType type, int price) {
        BussEventServiceTypes.put(type, price);
        totalprice += price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nBusiness Event service dtls:");
        sb.append("\n").append(TAB).append("Org conducting event: ").append(enterprise);
        sb.append("\n").append(TAB).append("Date of event: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (BussEventServiceTypes == null || BussEventServiceTypes.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this Book.");
        } else {
            sb.append("\n").append(TAB).append("Below are the dtls of services included for the business event:");
            for (Map.Entry<BussEventServiceType, Integer> entry : BussEventServiceTypes.entrySet()) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, price: $%d", entry.getKey(), entry.getValue()));
            }
            sb.append("\n").append(TAB).append("Total price for business event: $").append(totalprice);
        }
        return sb.toString();
    }
}
