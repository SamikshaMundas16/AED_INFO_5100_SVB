/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HManageRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModelNew;
import ModelNew.Book;
import ModelNew.Cust;
import ModelNew.CustDirectory;
import ModelNew.Hotel;
import ModelNew.LaundaryOrg;
import ModelNew.Org;
import ModelNew.systAdmin;
import ModelNew.TransportOrg;
import ModelNew.services.ServiceHotel;
import ModelNew.services.Service;

/**
 *
 * @author doshi
 */
public class ViewTaskHotel extends javax.swing.JPanel {

    private systAdmin systAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Hotel hotel;

    public ViewTaskHotel(systAdmin systAdmin, Runnable callOnCreateMethod, String user, String type, Hotel hotel) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.hotel = hotel;
        populateComboBox();
        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));
        viewTask.setBackground(new java.awt.Color(244, 120, 140));
        viewTask.setOpaque(true);
        backButton.setBackground(new java.awt.Color(244, 120, 140));
        backButton.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        laundaryOrg = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        transportationOrg = new javax.swing.JComboBox<>();
        viewTask = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORDER ID", "CUSTOMER NAME", "STATUS", "LAUNDARY", "TRANSPORTATION"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("SELECT A LAUNDARY ORG");

        laundaryOrg.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        laundaryOrg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laundaryOrgActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT A TRANSPORTATION ORG");

        viewTask.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        viewTask.setText("ASSIGN AND CONFIRM TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel3.setText("VIEW ORDER DETAILS FOR HOTEL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 866, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(15, 15, 15)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(83, 83, 83)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(laundaryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(transportationOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(44, 44, 44))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(702, 702, 702))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 835, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 479, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(147, 147, 147))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(262, 262, 262)
                            .addComponent(viewTask)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 281, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(16, 16, 16)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 751, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addComponent(backButton)
                    .addGap(14, 14, 14)
                    .addComponent(jLabel3)
                    .addGap(45, 45, 45)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(89, 89, 89)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel2))
                    .addGap(18, 18, 18)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(laundaryOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(transportationOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                    .addComponent(viewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(60, 60, 60)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void laundaryOrgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laundaryOrgActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laundaryOrgActionPerformed

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewTaskActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Book to assign tasks.");
            return;
        }

        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        Book Book = (Book) ModelNew.getValueAt(selectedRowIndex, 0);

        ServiceHotel ServiceHotel = null;
        for (Service service : Book.getServices()) {
            if (hotel.getName().equals(service.getEnterprise().getName())) {
                ServiceHotel = (ServiceHotel) service;
                break;
            }
        }

        if (ServiceHotel == null) {
            JOptionPane.showMessageDialog(this, "Cannot find hotel");
            return;
        }

        if (!ServiceHotel.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Book '%s' should be 'PENDING' state to be accepted.",
                Book.getId()));
        return;
        }

        LaundaryOrg laundary = (LaundaryOrg) laundaryOrg.getSelectedItem();
        TransportOrg transportation = (TransportOrg) TransportOrg.getSelectedItem();

        List<Org> Orgs = new ArrayList<>();
        for (ServiceHotel.ServiceHotelType type : ServiceHotel.getServiceHotels()) {
            switch (type) {
                case LAUNDARY:
                if (laundary == null) {
                    JOptionPane.showMessageDialog(this, "Please select laundary Org to be assinged for the Book.");
                    return;
                } else {
                    Orgs.add(laundary);
                }
                break;
                case TRANSPORTATION:
                if (transportation == null) {
                    JOptionPane.showMessageDialog(this, "Please select transportation Org to be assinged for the Book.");
                    return;
                } else {
                    Orgs.add(transportation);
                }
                break;
            }
        }

        for (Org Org : Orgs) {
            ServiceHotel.addOrg(Org);
        }
        ServiceHotel.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all hotel services to the Book: " + Book.getId());
        populateTable();
    }//GEN-LAST:event_viewTaskActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<LaundaryOrg> laundaryOrg;
    private javax.swing.JComboBox<TransportationOrg> transportationOrg;
    private javax.swing.JButton viewTask;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        laundaryOrg.addItem(null);
        TransportOrg.addItem(null);

        for (LaundaryOrg laundary : hotel.getLaundaryOrg()) {
            if (laundary != null) {
                laundaryOrg.addItem(laundary);
            }
        }
        for (TransportOrg transportation : hotel.gettransportOrgList()) {
            if (transportation != null) {
                TransportOrg.addItem(transportation);
            }
        }
    }
}