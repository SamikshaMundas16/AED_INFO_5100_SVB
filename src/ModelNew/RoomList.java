/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.ArrayList;
import java.util.List;
import ModelNew.Room.RoomType;

/**
 *
 * @author Samikshan
 */
public class RoomList {
    private List<Room> listOfRooms;
    private int nextRoomNumber = 1;

    public RoomList() {
        listOfRooms = new ArrayList<>();
    }

    public int getNextRoomNumber() {
        return nextRoomNumber;
    }

    public void setNextRoomNumber(int nextRoomNumber) {
        this.nextRoomNumber = nextRoomNumber;
    }

    public List<Room> getListOfRooms() {
        return listOfRooms;
    }

    public void setListOfRooms(List<Room> listOfRooms) {
        this.listOfRooms = listOfRooms;
        if (listOfRooms != null && listOfRooms.size() > 0) {
            nextRoomNumber = listOfRooms.get(listOfRooms.size() - 1).getRoomNo() + 1;
        }
    }

    public void createRoom(Room.RoomType type) {
        Room room = new Room(type, nextRoomNumber);
        nextRoomNumber++;
        listOfRooms.add(room);
    }

    public String toString() {
        return listOfRooms.toString();
    }
}
