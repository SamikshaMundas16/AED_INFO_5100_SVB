/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EventManageRole;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ModelNew.Book;
import ModelNew.BussEvent;
import ModelNew.CaterService;
import ModelNew.Cust;
import ModelNew.CustDirectory;
import ModelNew.DecorServices;
import ModelNew.Org;
import ModelNew.PhotoService;
import ModelNew.systAdmin;
import ModelNew.services.BussEventService;
import ModelNew.services.Service;

/**
 *
 * @author Samikshan
 */
public class ViewTaskForEvt extends javax.swing.JPanel {

    private systAdmin systAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private BussEvent BussEvent;

    public ViewTaskForEvt(systAdmin systAdmin, Runnable callOnCreateMethod, String user, String type, BussEvent BussEvent) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.BussEvent = BussEvent;
        populateComboBox();
        populateTable();
        setBackground(new java.awt.Color(153,255,255));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
       confirmBtn.setBackground(new java.awt.Color(244, 120, 140));
       confirmBtn.setOpaque(true);
       denyButton.setBackground(new java.awt.Color(244, 120, 140));
       confirmBtn.setOpaque(true);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        confirmBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        decorOrg = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        cateringOrg = new javax.swing.JComboBox();
        backBtn = new javax.swing.JButton();
        photographyOrg = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        denyButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(153, 255, 255));

        jLabel4.setText("SELECT A PHOTOGRAPHY ORG");

        jTable1.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "BOOKING ID", "NAME", "STATUS", "CATERING", "DECOR", "PHOTOGRAPHY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        confirmBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        confirmBtn.setText("CONFIRM REQUEST");
        confirmBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("SELECT A CATERING ORG");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("VIEW ORDER DETAILS FOR EVENTS");

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("SELECT A DECOR ORG");

        denyButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        denyButton.setText("DENY REQUEST");
        denyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                denyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 830, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(80, 80, 80)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(cateringOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(72, 72, 72)
                                        .addComponent(decorOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(photographyOrg, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(146, 146, 146)
                                .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(denyButton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(199, 199, 199)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(backBtn)
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(71, 71, 71)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(117, 117, 117)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(decorOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(photographyOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cateringOrg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 198, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(denyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(180, 180, 180))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmBtnActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Book to assign tasks.");
            return;
        }

        DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();
        Book Book = (Book) Model.getValueAt(selectedRowIndex, 0);

        BussEventService eventService = null;
        for (Service service : Book.getServices()) {
            if (BussEvent.getName().equals(service.getEnterprise().getName())) {
                eventService = (BussEventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Book '%s' should be 'PENDING' state to be accepted.",
                Book.getId()));
        return;
        }

        CaterService CaterService = (CaterService) cateringOrg.getSelectedItem();
        PhotoService PhotoService = (PhotoService) photographyOrg.getSelectedItem();
        DecorServices decorService = (DecorServices) decorOrg.getSelectedItem();

        List<Org> Orgs = new ArrayList<>();
        for (BussEventService.BussEventServiceType type : eventService.getBussEventServiceTypes().keySet()) {
            switch (type) {
                case CATERING:
                if (CaterService == null) {
                    JOptionPane.showMessageDialog(this, "Please select catering Org to be assinged for the Book.");
                    return;
                } else {
                    Orgs.add(CaterService);
                }
                break;
                case DECOR:
                if (decorService == null) {
                    JOptionPane.showMessageDialog(this, "Please decor catering Org to be assinged for the Book.");
                    return;
                } else {
                    Orgs.add(decorService);
                }
                break;
                case PHOTOGRAPHY:
                if (PhotoService == null) {
                    JOptionPane.showMessageDialog(this, "Please select photography Org to be assinged for the Book.");
                    return;
                } else {
                    Orgs.add(PhotoService);
                }
                break;
            }
        }

        for (Org Org : Orgs) {
            eventService.addOrg(Org);
        }
        eventService.setStatus(Service.Status.CONFIRMED);
        JOptionPane.showMessageDialog(this, "Assigned all event services to the Book: " + Book.getId());
        populateTable();
    }//GEN-LAST:event_confirmBtnActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void denyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_denyButtonActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Book to deny request.");
            return;
        }

        DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();
        Book Book = (Book) Model.getValueAt(selectedRowIndex, 0);

        BussEventService eventService = null;
        for (Service service : Book.getServices()) {
            if (BussEvent.getName().equals(service.getEnterprise().getName())) {
                eventService = (BussEventService) service;
                break;
            }
        }

        if (eventService == null) {
            JOptionPane.showMessageDialog(this, "Cannot find business event");
            return;
        }

        if (!eventService.getStatus().equals(Service.Status.PENDING)) {
            JOptionPane.showMessageDialog(this, String.format("Book '%s' should be 'PENDING' state to be denied.",
                Book.getId()));
        return;
        }

        eventService.setStatus(Service.Status.REJECTED);
        JOptionPane.showMessageDialog(this, "Denied Book request with id: " + Book.getId());
        populateTable();
    }//GEN-LAST:event_denyButtonActionPerformed


    private void populateTable() {

        DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();
        Model.setRowCount(0);

        CustDirectory CustDirec = systAdmin.getCustDirec(); //get all Custs
        for (Cust Cust : CustDirec.getListOfCust()) {
            for (Book Book : Cust.getBkList()) {      //get Book dtls each Cust
                for (Service service : Book.getServices()) {       //get services under Book

                    if (service.getEnterprise().getName().equals(BussEvent.getName())) {

                        BussEventService BussEventService = (BussEventService) service;
                        Object row[] = new Object[10];
                        row[0] = Book;
                        row[1] = Cust;
                        row[2] = BussEventService.getStatus();
                        row[3] = "NO";
                        row[4] = "NO";
                        row[5] = "NO";

                        for (BussEventService.BussEventServiceType type : BussEventService.getBussEventServiceTypes().keySet()) {
                            switch (type) {
                                case CATERING:
                                    row[3] = "YES";
                                    break;
                                case DECOR:
                                    row[4] = "YES";
                                    break;
                                case PHOTOGRAPHY:
                                    row[5] = "YES";
                                    break;
                            }
                        }
                        Model.addRow(row);
                    }
                }
            }
        }

    }

    private void populateComboBox() {
        cateringOrg.removeAllItems();
        decorOrg.removeAllItems();
        photographyOrg.removeAllItems();

        cateringOrg.addItem(null);
        decorOrg.addItem(null);
        photographyOrg.addItem(null);

        for (CaterService catering : BussEvent.getListOfCatering()) {
            if (catering != null) {
                cateringOrg.addItem(catering);
            }
        }
        for (DecorServices decor : BussEvent.getListOfDecors()) {
            if (decor != null) {
                decorOrg.addItem(decor);
            }
        }
        for (PhotoService photography : BussEvent.getListOfPhotoServices()) {
            if (photography != null) {
                photographyOrg.addItem(photography);
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JComboBox cateringOrg;
    private javax.swing.JButton confirmBtn;
    private javax.swing.JComboBox decorOrg;
    private javax.swing.JButton denyButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox photographyOrg;
    // End of variables declaration//GEN-END:variables
}
