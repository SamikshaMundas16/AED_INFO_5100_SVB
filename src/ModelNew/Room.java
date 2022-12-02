/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import ui.main.DateUtils;

/**
 *
 * @author Samikshan
 */
public class Room {
    public enum RoomType {
        REGULAR(50, "Regular"),
        DELUXE(100, "Deluxe"),
        SUPER_DELUXE(200, "Super Deluxe");

        private final int cost;
        private final String name;

        private RoomType(int cost, String name) {
            this.cost = cost;
            this.name = name;
        }

        public int getcost() {
            return cost;
        }

        public String getName() {
            return name;
        }

        public String toString() {
            return getName() + " (" + cost + "$ per night)";
        }
    }

    private Set<Date> Books;
    public RoomType roomType;
    private int roomNo;


    public Room(RoomType roomType, int roomNumber) {
        this.roomType = roomType;
        this.roomNo = roomNumber;
        this.Books = new HashSet<>();
    }


    
    
    public Set<Date> getBooks() {
        return Books;
    }

    public void setBooks(Set<Date> Books) {
        this.Books = Books;
    }
    
    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }
    
    public void setRoomNo(int no) {
        this.roomNo = no;
    }

    public int getRoomNo() {
        return roomNo;
    }

    public boolean isavail(Date stDate, Date eDate) {
        Set<Date> BookDates = daysBetween(stDate, eDate);
        for (Date date : BookDates) {
            if (Books.contains(date)) {
                return false;
            }
        }
        return true;
    }

    public void book(Date stDate, Date eDate) {
        if (isavail(stDate, eDate)) {
            Books.addAll(daysBetween(stDate, eDate));
        } else {
            throw new IllegalArgumentException("Room not avail");
        }
    }

    private Set<Date> daysBetween(Date stDate, Date eDate) {
        stDate = DateUtils.formatDate(stDate);
        eDate = DateUtils.formatDate(eDate);

        Set<Date> days = new HashSet<>();
        do {
            days.add(stDate);

            Calendar cal = Calendar.getInstance();
            cal.setTime(stDate);
            cal.add(Calendar.DATE, 1);
            stDate = cal.getTime();
        } while (stDate.getTime() <= eDate.getTime());

        return days;
    }

    public String toString() {
        return "Room:{" + roomNo + ", Books " + Books + "}";
    }
}
