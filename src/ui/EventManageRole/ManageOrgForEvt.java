/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.EventManageRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModelNew;
import ModelNew.BussEvent;
import ModelNew.CaterService;
import ModelNew.DecorServices;
import ModelNew.entDir;
import ModelNew.Network;
import ModelNew.PhotoService;
import ModelNew.systAdmin;

/**
 *
 * @author Samikshan
 */
public class ManageOrgForEvt extends javax.swing.JPanel {

    private systAdmin systAdmin;
    private Runnable callOnCreateMethod;
    private String type;
    private String user;
    private Network network;
    
    /**
     * Creates new form ManageOrgForEvt
     */
    public ManageOrgForEvt(systAdmin systAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;

        cityNameTextField.setText(network.getName());
        cityNameTextField.setEditable(false);

        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));
        dltBtn.setBackground(new java.awt.Color(244, 120, 140));
        dltBtn.setOpaque(true);
        addBtn.setBackground(new java.awt.Color(244, 120, 140));
        addBtn.setOpaque(true);
        updateBtn.setBackground(new java.awt.Color(244, 120, 140));
        updateBtn.setOpaque(true);
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

        cityNameTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        deleteBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        contactField = new javax.swing.JTextField();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        orgCombo = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();

        cityNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityNameTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("ORGANISATION TYPE");

        deleteBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        deleteBtn.setText("DELETE");
        deleteBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteBtnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("CONTACT");

        backButton.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANISATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setText("NAME");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANISATION FOR EVENTS ");

        updateBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organisation", "Decor", "Catering", "Photography" }));

        addBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel5.setText("CITY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 822, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(backButton)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(updateBtn)))
                .addContainerGap(22, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(deleteBtn)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 591, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(117, 117, 117))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backButton)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(deleteBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(66, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void cityNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityNameTextFieldActionPerformed

    private void deleteBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteBtnActionPerformed
        // TODO add your handling code here:
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to dlt");
            return;
        }
        String OrgType = (String) ModelNew.getValueAt(selectedRowIndex, 0);
        String OrgName = (String) ModelNew.getValueAt(selectedRowIndex, 1);
        entDir enterpriseDirec = network.getentDir();
        for (BussEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (OrgType.equals("Catering") && event.getListOfCatering() != null) {
                    for (CaterService catering : event.getListOfCatering()) {
                        if (catering.getName().equals(OrgName)) {
                            event.dltCatering(catering);
                            JOptionPane.showMessageDialog(this, "dltd successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Photography") && event.getListOfPhotoServices() != null) {
                    for (PhotoService photo : event.getListOfPhotoServices()) {
                        if (photo.getName().equals(OrgName)) {
                            event.dltPhotography(photo);
                            JOptionPane.showMessageDialog(this, "dltd successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Decor") && event.getListOfDecors() != null) {
                    for (DecorServices decor : event.getListOfDecors()) {
                        if (decor.getName().equals(OrgName)) {
                            event.dltDecor(decor);
                            JOptionPane.showMessageDialog(this, "dltd successfully");
                            populateTable();
                        }
                    }
                } else {
                    return;
                }

            }
        }

                                         

    }//GEN-LAST:event_deleteBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        String orgType = ModelNew.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgName = ModelNew.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String orgphone = ModelNew.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String orgCity = ModelNew.getValueAt(jTable1.getSelectedRow(), 3).toString();

        nameField.setText(orgName);
        phoneField.setText(orgphone);
        cityNameTextField.setText(orgCity);
        orgCombo.setSelectedItem(orgType);
        cityNameTextField.setEnabled(false);
    }//GEN-LAST:event_jTable1MouseClicked

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed

        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();

        String orgType = orgCombo.getSelectedItem().toString();
        String orgname = ModelNew.getValueAt(jTable1.getSelectedRow(), 1).toString();

        entDir enterpriseDirec = network.getentDir();
        for (BussEvent event : enterpriseDirec.getListOfEvents()) {
            if (orgType.equals("Catering") && event.getListOfCatering() != null) {
                for (CaterService catering : event.getListOfCatering()) {
                    if (catering.getName().equals(orgname)) {
                        catering.setName(nameField.getText());
                        catering.setphone(phoneField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Decor") && event.getListOfDecors() != null) {
                for (DecorServices decor : event.getListOfDecors()) {
                    if (decor.getName().equals(orgname)) {
                        decor.setName(nameField.getText());
                        decor.setphone(phoneField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Photography") && event.getListOfPhotoServices() != null) {
                for (PhotoService photo : event.getListOfPhotoServices()) {
                    if (photo.getName().equals(orgname)) {
                        photo.setName(nameField.getText());
                        photo.setphone(phoneField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_updateBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        Object row[] = new Object[20];
        String networkName = network.getName();
        String name = nameField.getText();
        String phone = phoneField.getText();

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Org name should be at least 2 characters long.");
            return;
        }

        String orgType1 = orgCombo.getSelectedItem().toString();      // org-type (Phy org)
        entDir enterpriseDirc = network.getentDir();
        List<BussEvent> events = enterpriseDirc.getListOfEvents();
        for (int i = 0; i < events.size(); i++) {
            events.get(i).findManager(user);      //find HClub for which manager is working for
            if (orgType1.equals("Catering")) {
                events.get(i).addCaterService(name, phone, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = phone;
                row[3] = networkName;
                ModelNew.addRow(row);
                JOptionPane.showMessageDialog(this, "Catering Organisation added successfully");
                return;
            } else if (orgType1.equals("Decor")) {
                events.get(i).addDecorService(name, phone, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = phone;
                row[3] = networkName;
                ModelNew.addRow(row);
                JOptionPane.showMessageDialog(this, "Decor Organisation successfully");
                return;
            } else {
                events.get(i).addPhotoService(name, phone, networkName);
                row[0] = orgType1;
                row[1] = name;
                row[2] = phone;
                row[3] = networkName;
                ModelNew.addRow(row);
                JOptionPane.showMessageDialog(this, "Photography Organisation added successfully");
                return;
            }
        }
    }//GEN-LAST:event_addBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton deleteBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        ModelNew.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        Network network1 = systAdmin.findNetwork(network.getName());
        entDir enterpriseDirec = network1.getentDir();
        if (enterpriseDirec == null) {
            return;
        }
        for (BussEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (event.getListOfCatering() != null) {
                    row[0] = "Catering";
                    for (CaterService catering : event.getListOfCatering()) {
                        row[0] = "Catering";
                        row[1] = catering.getName();
                        row[2] = catering.getphone();
                        row[3] = network1.getName();
                        ModelNew.addRow(row);
                    }
                }
                if (event.getListOfDecors() != null) {
                    row[0] = "Decor";
                    for (DecorServices decor : event.getListOfDecors()) {
                        row[0] = "Decor";
                        row[1] = decor.getName();
                        row[2] = decor.getphone();
                        row[3] = network.getName();
                        ModelNew.addRow(row);
                    }
                }
                if (event.getListOfPhotoServices() != null) {
                    row[0] = "Photography";
                    for (PhotoService photo : event.getListOfPhotoServices()) {
                        row[0] = "Photography";
                        row[1] = photo.getName();
                        row[2] = photo.getphone();
                        row[3] = network.getName();
                        ModelNew.addRow(row);
                    }
                }

            }
        }
    }
}