/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import ModelNew.services.ServiceHotel;
import ModelNew.services.Service;
import ui.main.DateUtils;

/**
 *
 * @author Samikshan
 */

public class Book {

    private static final String TAB = "      ";

    private Date intime;
    private Date outtime;
    private String status;
    private int price;
    private Network network;

    private List<Service> services;
    private String id;

    public Book() {
        
    }
    public Book(Hotel hotel, Network network) {
        this.services = new ArrayList<>();
        this.services.add(new ServiceHotel(hotel));
        this.network = network;
        this.id = UUID.randomUUID().toString();
    }

    public int getTotalprice() {
        int totalprice = this.price;
        for (Service service : services) {
            totalprice += service.getTotalprice();
        }
        return totalprice;
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
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

    public Date getintime() {
        return intime;
    }

    public void setintime(Date intime) {
        this.intime = DateUtils.formatDate(intime);
    }

    public Date getouttime() {
        return outtime;
    }

    public void setouttime(Date outtime) {
        this.outtime = DateUtils.formatDate(outtime);
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

    public ServiceHotel getServiceHotel() {
        for (Service service : services) {
            if (service instanceof ServiceHotel) {
                return (ServiceHotel) service;
            }
        }

        throw new RuntimeException("Booking should always have an hotel service");
    }

    public String prettyPrint() {
        StringBuilder sb = new StringBuilder("Below are your Booking details -\n");
        sb.append("\n").append("Hotel Book details are as follows:");
        sb.append("\n").append(TAB).append("City: ").append(network.getName());
        sb.append("\n").append(TAB).append("CheckIn date: ").append(intime);
        sb.append("\n").append(TAB).append("CheckOut date: ").append(outtime);
        
        List<Room> listOfRooms = getServiceHotel().getRoomlist().getListOfRooms();
        int roomprice = 0;
        sb.append("\n").append(TAB).append(String.format("Below are the details of the %d rooms booked:", listOfRooms.size()));
        for (Room room : listOfRooms) {
            roomprice += room.getRoomType().getcost();
            sb.append("\n").append(TAB).append(TAB).append("Room number: ")
                    .append(room.getRoomNo()).append(", Room type: ").append(room.getRoomType());
        }
        sb.append("\n").append(TAB).append("Total price for your stay: $").append(roomprice);
        
        int totalprice = roomprice;
        for (Service service : services) {
            totalprice += service.getTotalprice();
            sb.append("\n").append(service).append("\n");
        }
        
        sb.append("\nTotal price of the Book including all services: $").append(getTotalprice()).append("\n");
     
        return sb.toString();
    }

    public String toString() {
        return id;
    }
}

