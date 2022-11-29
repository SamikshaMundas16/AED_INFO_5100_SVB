/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ModelNew.Room.RoomType;

/**
 *
 * @author Samikshan
 */
public class Hotel extends Enterprise {
    private RoomList roomListDir;
    private List<Manager> listOfManager;
    private List<LaundaryOrg> laundaryOrg;
    private List<TransportOrg> transportOrgList;

    public Hotel() {

    }

    public Hotel(String name, String phone) {
        super(name, phone);
        listOfManager = new ArrayList<>();
        roomListDir = new RoomList();
        transportOrgList = new ArrayList<>();
        laundaryOrg = new ArrayList<>();
    }

    public List<LaundaryOrg> getLaundaryOrg() {
        return laundaryOrg;
    }

    public void setLaundaryOrg(List<LaundaryOrg> laundaryList) {
        this.laundaryOrg = laundaryList;
    }

    public List<TransportOrg> gettransportOrgList() {
        return transportOrgList;
    }

    public void settransportOrgList(List<TransportOrg> transportationList) {
        this.transportOrgList = transportationList;
    }

    public RoomList getroomListDir() {
        return roomListDir;
    }

    public void setroomListDir(RoomList roomList) {
        this.roomListDir = roomList;
    }

    public List<Room> availRooms(Date stDate, Date eDate, RoomType roomType) {
        List<Room> availRooms = new ArrayList<>();
        for (Room room : roomListDir.getListOfRooms()) {
            if (room.getRoomType().equals(roomType) && room.isavail(stDate, eDate)) {
                availRooms.add(room);
            }
        }
        return availRooms;
    }

    public List<Room> bookRooms(Date stDate, Date eDate, int count, RoomType roomType) {
        List<Room> availRooms = availRooms(stDate, eDate, roomType);
        if (availRooms.size() < count) {
            throw new IllegalArgumentException("Rooms not avail for the specified date.");
        }

        for (int i = 0; i < count; i++) {
            availRooms.get(i).book(stDate, eDate);
        }

        // return booked room list
        return availRooms.subList(0, count);
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public Manager addManager(String name, String uName, String pwd) {
        Manager manager = new Manager(name, uName, pwd);
        listOfManager.add(manager);
        return manager;
    }

    public Manager findManager(String uName) {
        for (Manager man : listOfManager) {
            if (man.getuName().equals(uName)) {
                return man;
            }
        }
        return null;
    }

    public void addLaundaryOrg(String name, String phone, String city) {
        LaundaryOrg laundaryOrg1 = new LaundaryOrg(name, phone, city);
        laundaryOrg.add(laundaryOrg1);
    }

    public void addTransportOrg(String name, String phone, String networkName) {
        TransportOrg to = new TransportOrg(name, phone, networkName);
        transportOrgList.add(to);
    }

    public void dltManager(Manager man) {
        listOfManager.remove(man);
    }

    public void dltLaundary(LaundaryOrg laundary) {
        laundaryOrg.remove(laundary);
    }

    public void dltTransportation(TransportOrg transport) {
        transportOrgList.remove(transport);
    }
}
