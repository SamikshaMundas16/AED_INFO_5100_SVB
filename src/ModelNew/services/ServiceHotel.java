/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew.services;

import java.util.ArrayList;
import java.util.List;
import ModelNew.Hotel;
import ModelNew.RoomList;
import static ModelNew.services.Service.TAB;
import ui.main.DateUtils;

/**
 *
 * @author Samikshan
 */
public class ServiceHotel extends Service {

    public static enum ServiceHotelType {
        LAUNDARY(10),
        TRANSPORTATION(20);

        private final int price;

        private ServiceHotelType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    private RoomList roomlist;
    private List<ServiceHotelType> ServiceHotels;

    public ServiceHotel(Hotel hotel) {
        super(hotel, Service.ServiceType.HOTEL, DateUtils.now());
        this.ServiceHotels = new ArrayList<>();
        this.roomlist = new RoomList();
    }

    public List<ServiceHotelType> getServiceHotels() {
        return ServiceHotels;
    }

    public void setServiceHotels(List<ServiceHotelType> ServiceHotels) {
        this.ServiceHotels = ServiceHotels;
    }

    public RoomList getRoomlist() {
        return roomlist;
    }

    public void setRoomlist(RoomList roomlist) {
        this.roomlist = roomlist;
    }

    public void addService(ServiceHotel.ServiceHotelType type) {
        ServiceHotels.add(type);
        totalprice += type.price;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("\nHotel service dtls:");
        sb.append("\n").append(TAB).append("Hotel: ").append(enterprise);
        sb.append("\n").append(TAB).append("Date of appointment: ").append(getDate());
        sb.append("\n").append(TAB).append("Status: ").append(getStatus());

        if (ServiceHotels == null || ServiceHotels.isEmpty()) {
            sb.append("\n").append(TAB).append("No services selected for this Book.");
        } else {
            sb.append("\n").append(TAB).append("Below are the dtls of services included for your Book:");
            for (ServiceHotel.ServiceHotelType service : ServiceHotels) {
                sb.append("\n").append(TAB).append(TAB)
                        .append(String.format("Service type: %s, price: $%d", service.toString(), service.getPrice()));
            }
            sb.append("\n").append(TAB).append("Total price for hotel: $").append(totalprice);
        }
        return sb.toString();
    }

}

