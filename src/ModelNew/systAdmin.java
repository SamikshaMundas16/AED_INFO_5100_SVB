/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Samikshan
 */
public class systAdmin {
    private List<Network> listOfNetwork;
    private CustDirectory CustDirec;
    private Map<String, String> mapType;
    private Map<String, String> uNamepwdMap;

    public systAdmin(String uName, String pwd) {
        listOfNetwork = new ArrayList<>();
        listOfNetwork.add(new Network("Seattle"));
        listOfNetwork.add(new Network("Boston"));
        CustDirec = new CustDirectory();
        mapType = new HashMap<>();
        uNamepwdMap = new HashMap<>();
        uNamepwdMap.put(uName, pwd);
        adduser(uName, pwd, "admin");
    }

    public Map<String, String> getuNamepwdMap() {
        return uNamepwdMap;
    }

    public void setuNamepwdMap(Map<String, String> uNamepwdMap) {
        this.uNamepwdMap = uNamepwdMap;
    }

    public Map<String, String> getMapType() {
        return mapType;
    }

    public void setMapType(Map<String, String> mapType) {
        this.mapType = mapType;
    }

    public List<Network> getListOfNetwork() {
        return listOfNetwork;
    }

    public void setListOfNetwork(List<Network> listOfNetwork) {
        this.listOfNetwork = listOfNetwork;
    }

    public CustDirectory getCustDirec() {
        return CustDirec;
    }

    public void setCustDirec(CustDirectory CustDirec) {
        this.CustDirec = CustDirec;
    }

    public void addNetwork(String name) {
        Network network = new Network(name);
        listOfNetwork.add(network);
    }

    public Network findNetwork(String networkName) {
        for (Network network : listOfNetwork) {
            if (listOfNetwork != null && network.getName().equals(networkName)) {
                return network;
            }
        }
        return null;
    }

    public void adduser(String uName, String pwd, String type) {
        mapType.put(uName, type);
        uNamepwdMap.put(uName, pwd);
    }

    public String finduserType(String uName) {
        if (mapType.containsKey(uName)) {
            return mapType.get(uName);
        }
        return null;
    }

    public boolean userExistsInSystem(String uName) {
        return mapType.containsKey(uName);
    }

    public boolean validateuNamepwd(String uName, String pwd) {
        return uNamepwdMap.containsKey(uName) && uNamepwdMap.get(uName).equals(pwd);
    }

    public static systAdmin createsystAdmin() {
        return new systAdmin("admin", "admin");
    }

    public void dltCust(Cust Cust) {
        CustDirec.getListOfCust().remove(Cust);
        mapType.remove(Cust.getuName());
    }

    public void updateuser(String uName, String pwd) {
        if (uNamepwdMap.containsKey(uName)) {
            uNamepwdMap.put(uName, pwd);
        }
    }

    public Cust findCust(String user) {
        for (Cust custom : CustDirec.getListOfCust()) {
            if (custom.getuName().equals(user)) {
                return custom;
            }
        }
        return null;
    }
}
