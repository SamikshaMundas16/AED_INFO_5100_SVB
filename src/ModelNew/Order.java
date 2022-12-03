/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ModelNew;

import java.util.UUID;

/**
 *
 * @author Samikshan
 */
public class Order {
    private String id;
    private String status;
    private String dtls;
    private String feedback;
    private Cust Cust;
    private rest rest;
    private DeliMan DeliMan;

    public Order(String dtls) {        
        this.dtls = dtls;
    }
      public String getFeedback() {
        return feedback;
    }

    public void setFeedback(String feedback) {
        this.feedback = feedback;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DeliMan getDeliMan() {
        return DeliMan;
    }

    public void setDeliMan(DeliMan DeliMan) {
        this.DeliMan = DeliMan;
    }

    public rest getrest() {
        return rest;
    }

    public void setrest(rest rest) {
        this.rest = rest;
    }

    public String getdtls() {
        return dtls;
    }

    public void setdtls(String dtls) {
        this.dtls = dtls;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Cust getCust() {
        return Cust;
    }

    public void setCust(Cust Cust) {
        this.Cust = Cust;
    }

    public String toString() {
        return dtls;
    }
}
