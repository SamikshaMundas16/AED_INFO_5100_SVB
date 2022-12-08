/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import model.services.HotelService;
import model.services.Service;
import ui.main.DateUtils;

/**
 *
 * @author Samikshan
 */
public class Booking {

    private static final String TAB = "      ";

    private Date checkin;
    private Date checkout;
    private String status;
    private int cost;
    private Network network;

    private List<Service> services;
    private String id;

    public Booking() {
        
    }
    
    public Booking(Hotel hotel, Network network) {
        this.services = new ArrayList<>();
        this.services.add(new HotelService(hotel));
        this.network = network;
        this.id = UUID.randomUUID().toString();
    }

    public int getTotalCost() {
        int totalCost = this.cost;
        for (Service service : services) {
            totalCost += service.getTotalCost();
        }
        return totalCost;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String getId() {
        return id;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public Date getCheckin() {
        return checkin;
    }

    public void setCheckin(Date checkin) {
        this.checkin = DateUtils.formatDate(checkin);
    }

    public Date getCheckout() {
        return checkout;
    }

    public void setCheckout(Date checkout) {
        this.checkout = DateUtils.formatDate(checkout);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Network getNetwork() {
        return network;
    }

    public void setNetwork(Network network) {
        this.network = network;
    }

    public HotelService getHotelService() {
        for (Service service : services) {
            if (service instanceof HotelService) {
                return (HotelService) service;
            }
        }

        throw new RuntimeException("Booking should always have an hotel service");
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder("Below are your booking details -\n");
        sb.append("\n").append("Hotel booking details are as follows:");
        sb.append("\n").append(TAB).append("City: ").append(network.getName());
        sb.append("\n").append(TAB).append("Checkin date: ").append(checkin);
        sb.append("\n").append(TAB).append("Checkout date: ").append(checkout);
        
        List<Room> listOfRooms = getHotelService().getRoomlist().getListOfRooms();
        int roomCost = 0;
        sb.append("\n").append(TAB).append(String.format("Below are the details of the %d rooms booked:", listOfRooms.size()));
        for (Room room : listOfRooms) {
            roomCost += room.getRoomType().getRate();
            sb.append("\n").append(TAB).append(TAB).append("Room number: ")
                    .append(room.getRoomNo()).append(", Room type: ").append(room.getRoomType());
        }
        sb.append("\n").append(TAB).append("Total cost for your stay: $").append(roomCost);
        
        int totalCost = roomCost;
        for (Service service : services) {
            totalCost += service.getTotalCost();
            sb.append("\n").append(service).append("\n");
        }
        
        sb.append("\nTotal cost of the booking including all services: $").append(getTotalCost()).append("\n");
     
        return sb.toString();
    }

    public String toString() {
        return id;
    }
}
