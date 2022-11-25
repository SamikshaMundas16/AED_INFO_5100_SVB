/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import ModelNew.HClub;

/**
 *
 * @author DELL
 */
public class HealthClubService extends Service{
     public static enum HClubServiceType {
        Phy(60),
        TRAINER(20),
        Therapy(20);

        private final int price;

        private HClubServiceType(int price) {
            this.price = price;
        }

        public int getPrice() {
            return price;
        }
    }

    private List<HClubServiceType> HClubServices;

    public HClubService(HClub HClub, Date date) {
        super(HClub, Service.ServiceType.HEALTH_CLUB, date);
        this.HClubServices = new ArrayList<>();
    }

    public List<HClubServiceType> getHClubServices() {
        return HClubServices;
    }

    public void setHClubServices(List<HClubServiceType> HClubServices) {
        this.HClubServices = HClubServices;
    }

    public void addService(HClubServiceType type) {
        HClubServices.add(type);
        totalprice += type.price;
    }
    
}
