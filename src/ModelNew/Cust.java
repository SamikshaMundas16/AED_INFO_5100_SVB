/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Samikshan
 */
public class Cust {
    private String name;
    private String phone;
    private String address;
    private String city;
    private String pwd;
    private String uName;
    private List<Book> BkList;
    
    public Cust() {
        BkList = new ArrayList<>();
    }

    public String getpwd() {
        return pwd;
    }

    public void setpwd(String pwd) {
        this.pwd = pwd;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getphone() {
        return phone;
    }

    public List<Book> getBkList() {
        return BkList;
    }

    public void setBkList(List<Book> BkList) {
        this.BkList = BkList;
    }

    public void setphone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Book addBook(Hotel hotel, Network network) {
        Book Book = new Book(hotel, network);
        BkList.add(Book);
        return Book;
    }

    public String toString() {
        return uName;
    }
    
}
