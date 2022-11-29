/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Samikshan
 */
public class entDir {
    private List<Hotel> listOfHotel;
    private List<BussEvent> listOfEvents;
    private List<HClub> listOfHClub;
    private List<rest> listOfrests;

    public entDir() {
        listOfHotel = new ArrayList<>();
        listOfEvents = new ArrayList<>();
        listOfHClub = new ArrayList<>();
        listOfrests = new ArrayList<>();
    }

    public List<Hotel> getListOfHotel() {
        return listOfHotel;
    }

    public void setListOfHotel(List<Hotel> listOfHotel) {
        this.listOfHotel = listOfHotel;
    }

    public List<BussEvent> getListOfEvents() {
        return listOfEvents;
    }

    public void setListOfEvents(List<BussEvent> listOfEvents) {
        this.listOfEvents = listOfEvents;
    }

    public List<HClub> getListOfHClub() {
        return listOfHClub;
    }

    public void setListOfHClub(List<HClub> listOfHClub) {
        this.listOfHClub = listOfHClub;
    }

    public List<rest> getListOfrests() {
        return listOfrests;
    }

    public void setListOfrests(List<rest> listOfrests) {
        this.listOfrests = listOfrests;
    }

    public void addHClub(String name, String phone) {
        HClub HClub = new HClub(name, phone);
        listOfHClub.add(HClub);
    }

    public void addrest(String name, String phone) {
        rest rest = new rest(name, phone);
        listOfrests.add(rest);
    }

    public void addBussEvent(String name, String phone) {
        BussEvent event = new BussEvent(name, phone);
        listOfEvents.add(event);
    }

    public void addHotel(String name, String phone) {
        Hotel hotel = new Hotel(name, phone);
        listOfHotel.add(hotel);
    }

    public Hotel findHotel(String hotelName) {
        for (Hotel hotel : listOfHotel) {
            if (hotel.getName().equals(hotelName)) {
                return hotel;
            }
        }
        return null;
    }

    public HClub findHClub(String clubName) {
        for (HClub club : listOfHClub) {
            if (club.getName().equals(clubName)) {
                return club;
            }
        }
        return null;
    }

    public rest findrest(String name) {
        for (rest rest : listOfrests) {
            if (rest.getName().equals(name)) {
                return rest;
            }
        }
        return null;
    }

    public BussEvent findEvent(String name) {
        for (BussEvent event : listOfEvents) {
            if (event.getName().equals(name)) {
                return event;
            }
        }
        return null;
    }

    public void dltEnterpriseEvent(BussEvent event) {
        listOfEvents.remove(event);
    }

    public void dltEnterpriseHClub(HClub health) {
        listOfHClub.remove(health);
    }

    public void dltEnterpriserest(rest res) {
        listOfrests.remove(res);
    }

    public void dltEnterpriseHotel(Hotel hotel) {
        listOfHotel.remove(hotel);
    }
}
