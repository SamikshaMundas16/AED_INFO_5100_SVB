/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Samikshan
 */

public class BussEvent extends Enterprise {

    private Date date;
    private List<Manager> listOfManager;
    private List<CaterService> listOfCatering;
    private List<PhotoService> listOfPhotoServices;
    private List<DecorServices> listOfDecors;

    public BussEvent(String name, String phone) {
        super(name, phone);
        listOfManager = new ArrayList<>();
        listOfCatering = new ArrayList<>();
        listOfPhotoServices = new ArrayList<>();
        listOfDecors = new ArrayList<>();

    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public List<Manager> getListOfManager() {
        return listOfManager;
    }

    public void setListOfManager(List<Manager> listOfManager) {
        this.listOfManager = listOfManager;
    }

    public List<CaterService> getListOfCatering() {
        return listOfCatering;
    }

    public void setListOfCatering(List<CaterService> listOfCatering) {
        this.listOfCatering = listOfCatering;
    }

    public List<PhotoService> getListOfPhotoServices() {
        return listOfPhotoServices;
    }

    public void setListOfPhotoServices(List<PhotoService> listOfPhotoServices) {
        this.listOfPhotoServices = listOfPhotoServices;
    }

    public List<DecorServices> getListOfDecors() {
        return listOfDecors;
    }

    public void setListOfDecors(List<DecorServices> listOfDecors) {
        this.listOfDecors = listOfDecors;
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

    public void addCaterService(String name, String phone, String city) {
        CaterService cat = new CaterService(name, phone, city);
        System.out.println(name);
        listOfCatering.add(cat);
        System.out.println("catering size is " + listOfCatering.size() + " name is " + listOfCatering.get(0).getName());

    }

    public void addPhotoService(String name, String phone, String city) {
        PhotoService photo = new PhotoService(name, phone, city);
        listOfPhotoServices.add(photo);

    }

    public void addDecorService(String name, String phone, String city) {
        DecorServices decor = new DecorServices(name, phone, city);
        listOfDecors.add(decor);
    }

    public void dltManager(Manager man) {
        listOfManager.remove(man);
    }

    public void dltCatering(CaterService catering) {
        listOfCatering.remove(catering);
    }

    public void dltPhotography(PhotoService photo) {
        listOfPhotoServices.remove(photo);
    }

    public void dltDecor(DecorServices decor) {
        listOfDecors.remove(decor);
    }

}

