/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ModelNew.Enterprise;
import ModelNew.Org;
import ui.main.DateUtils;

/**
 *
 * @author Samikshan
 */
public abstract class Service {

    protected static final String TAB = "      ";

    static enum ServiceType {
        BUSINESS_EVENT,
        RESTURANT,
        HEALTH_CLUB,
        HOTEL,
    }

    public static enum Status {
        PENDING, CONFIRMED, REJECTED;
    }

    private ServiceType serviceType;
    private int price;
    private Date date;
    protected Enterprise enterprise;
    private Status status;
    protected int totalprice;
    private List<Org> listOfOrg;

    Service(Enterprise enterprise, ServiceType serviceType, Date date) {
        this.enterprise = enterprise;
        this.serviceType = serviceType;
        this.date = (date == null) ? null : DateUtils.formatDate(date);
        this.status = Status.PENDING;
        this.listOfOrg = new ArrayList<>();
    }

    public int getprice() {
        return price;
    }

    public void setprice(int price) {
        this.price = price;
    }

    public Enterprise getEnterprise() {
        return enterprise;
    }

    public void setEnterprise(Enterprise enterprise) {
        this.enterprise = enterprise;
    }

    public int getTotalprice() {
        return totalprice;
    }

    public void setTotalprice(int totalprice) {
        this.totalprice = totalprice;
    }

    public ServiceType getServiceType() {
        return serviceType;
    }

    public void setServiceType(ServiceType serviceType) {
        this.serviceType = serviceType;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public void addOrg(Org org) {
        listOfOrg.add(org);
    }

    public List<Org> getListOfOrg() {
        return listOfOrg;
    }

    public void setListOfOrg(List<Org> listOfOrg) {
        this.listOfOrg = listOfOrg;
    }

    public abstract String toString();
}

