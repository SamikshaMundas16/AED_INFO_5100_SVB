/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.systAdm;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import ModelNew.BussEvent;
import ModelNew.Enterprise;
import ModelNew.entDir;
import ModelNew.HClub;
import ModelNew.Hotel;
import ModelNew.Network;
import ModelNew.rest;
import ModelNew.systAdmin;

/**
 *
 * @author doshi
 */
public class ManageEntPanel extends javax.swing.JPanel {

    private systAdmin systAdmin;
    private Runnable callOnCreateMethod;
    
    /**
     * Creates new form ManageEntPanel
     */
    public ManageEntPanel(systAdmin systAdmin, Runnable callOnCreateMethod) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        for (Network network : systAdmin.getListOfNetwork()) {      //populate items in network combobox
            networkType.addItem(network.getName());
        }
        for (Network network : systAdmin.getListOfNetwork()) {
            networkCombo.addItem(network.getName());
        }
        setBackground(new java.awt.Color(255, 204, 204));
        dltBtn.setBackground(new java.awt.Color(244, 120, 140));
        dltBtn.setOpaque(true);
        addBtn.setBackground(new java.awt.Color(244, 120, 140));
        addBtn.setOpaque(true);
        updateBtn.setBackground(new java.awt.Color(244, 120, 140));
        updateBtn.setOpaque(true);
        backButton.setBackground(new java.awt.Color(244, 120, 140));
        backButton.setOpaque(true);
        viewBtn.setBackground(new java.awt.Color(244, 120, 140));
        viewBtn.setOpaque(true);
    }

    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean validatephoneNum() {
        if (phoneField.getText().matches("[0-9]{10}")) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid contcat: phone should contain only 10 digits");
            return false;
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblsysadmin = new javax.swing.JLabel();
        updateBtn = new javax.swing.JButton();
        dltBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        nameField = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        networkType = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        enterpriseType = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        phoneField = new javax.swing.JTextField();
        networkCombo = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        viewBtn = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        lblsysadmin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblsysadmin.setText("MANAGE ENTERPRISES");

        updateBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        dltBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dltBtn.setText("DELETE");
        dltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBtnActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NETWORK NAME", "ENTERPRISE ", "ENTERPRISE TYPE", "CONTACT"
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

        addBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        nameField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("ENTERPRISE TYPE");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NETWORK");

        networkType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        networkType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one" }));
        networkType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkTypeActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ENTERPRISE NAME");

        enterpriseType.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        enterpriseType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one", "Business Event", "Hotel", "Restaurant", "Health Club" }));
        enterpriseType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CONTACT");

        phoneField.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        networkCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        networkCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select any one " }));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel7.setText("SELECT A NETWORK");

        viewBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1002, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(317, 317, 317)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33)
                            .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(28, 28, 28)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(50, 50, 50)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(enterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(networkType, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(nameField, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(phoneField, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(12, 12, 12)
                                    .addComponent(networkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(viewBtn))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 935, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(301, 301, 301)
                            .addComponent(lblsysadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 319, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGap(763, 763, 763)
                            .addComponent(dltBtn)
                            .addGap(79, 79, 79)))
                    .addContainerGap(34, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 795, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(32, 32, 32)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(lblsysadmin)
                    .addGap(34, 34, 34)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(networkCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(viewBtn))
                    .addGap(33, 33, 33)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(dltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(networkType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(19, 19, 19)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1)
                        .addComponent(enterpriseType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(25, 25, 25)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(29, 29, 29)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel6)
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(phoneField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(33, 33, 33)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select 1 row to update");
            return;
        }
        DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();

        String networkName = networkType.getSelectedItem().toString();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();
        String enterpriseName = Model.getValueAt(jTable1.getSelectedRow(), 1).toString();

        Network network = systAdmin.findNetwork(networkName);
        entDir enterpriseDirec = network.getentDir();

        Enterprise enterpriseToUpdate = null;
        if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {

            for (HClub list : enterpriseDirec.getListOfHClub()) {
                if (list.getName().equals(enterpriseName)) {  //if enterprise name matches
                    enterpriseToUpdate = list;
                }
            }
            JOptionPane.showMessageDialog(this, "Enterprise updated successfully");
            return;
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            for (BussEvent list : enterpriseDirec.getListOfEvents()) {
                if (list.getName().equals(enterpriseName)) {
                    enterpriseToUpdate = list;
                }
            }
        } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
            for (Hotel list : enterpriseDirec.getListOfHotel()) {
                if (list.getName().equals(enterpriseName)) {           //if enterprise name matches
                    enterpriseToUpdate = list;
                }
            }
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            for (rest list : enterpriseDirec.getListOfrests()) {
                if (list.getName().equals(enterpriseName)) {           //if enterprise name matches
                    enterpriseToUpdate = list;
                }
            }
        }

        if (enterpriseToUpdate == null) {
            JOptionPane.showMessageDialog(this, "Unknown enterprise.");
            return;
        }

        enterpriseToUpdate.setName(nameField.getText());
        enterpriseToUpdate.setphone(phoneField.getText());
        populateTable();
    }//GEN-LAST:event_updateBtnActionPerformed

    private void dltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltBtnActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to dlt");
            return;
        }
        DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();
        String networkName = (String) Model.getValueAt(selectedRowIndex, 0);
        String enterpriseType = (String) Model.getValueAt(selectedRowIndex, 2);
        String enterpriseName = (String) Model.getValueAt(selectedRowIndex, 1);
        Network network = systAdmin.findNetwork(networkName);
        entDir enterpriseDirec = network.getentDir();
        if (enterpriseType.equals("Business Event") && enterpriseDirec.getListOfEvents() != null) {
            for (BussEvent event : enterpriseDirec.getListOfEvents()) {
                if (event.getName().equals(enterpriseName)) {
                    enterpriseDirec.dltEnterpriseEvent(event);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("Hotel") && enterpriseDirec.getListOfHotel() != null) {
            for (Hotel hotel : enterpriseDirec.getListOfHotel()) {
                if (hotel.getName().equals(enterpriseName)) {
                    enterpriseDirec.dltEnterpriseHotel(hotel);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("rest") && enterpriseDirec.getListOfrests() != null) {
            for (rest res : enterpriseDirec.getListOfrests()) {
                if (res.getName().equals(enterpriseName)) {
                    enterpriseDirec.dltEnterpriserest(res);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else if (enterpriseType.equals("Health Club") && enterpriseDirec.getListOfHClub() != null) {
            for (HClub club : enterpriseDirec.getListOfHClub()) {
                if (club.getName().equals(enterpriseName)) {
                    enterpriseDirec.dltEnterpriseHClub(club);
                    JOptionPane.showMessageDialog(this, "Enterprise deleted successfully");
                    populateTable();
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "not found");
        }
    }//GEN-LAST:event_dltBtnActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked

        if (jTable1.getSelectedRowCount() != 1) {
            return;
        }

        DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();

        String networkName = Model.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String enterpriseName = Model.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String enterpriseType1 = Model.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String enterprisephone = Model.getValueAt(jTable1.getSelectedRow(), 3).toString();

        networkType.setSelectedItem(networkName);
        enterpriseType.setSelectedItem(enterpriseType1);
        nameField.setText(enterpriseName);
        phoneField.setText(enterprisephone);
    }//GEN-LAST:event_jTable1MouseClicked

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        String phone = phoneField.getText();
        String name = nameField.getText();
        String networkName = networkType.getSelectedItem().toString();
        String enterpriseType1 = enterpriseType.getSelectedItem().toString();
        Network network = systAdmin.findNetwork(networkName);

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Invalid input: Enterprise name should be atleast 2 characters long.");
            return;
        }
        
        if(contact.length()!=10){
            JOptionPane.showMessageDialog(this, "Enter Valid 10 digit Phone Number");
            return;
        }

        entDir enterpriseDirec = network.getentDir();
        if (enterpriseType1.equals("Health Club") && enterpriseDirec != null) {
            enterpriseDirec.addHClub(name, phone);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        } else if (enterpriseType1.equals("rest") && enterpriseDirec != null) {
            enterpriseDirec.addrest(name, phone);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (enterpriseType1.equals("Business Event") && enterpriseDirec != null) {
            enterpriseDirec.addBussEvent(name, phone);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");

            return;
        } else if (enterpriseType1.equals("Hotel") && enterpriseDirec != null) {
            enterpriseDirec.addHotel(name, phone);
            JOptionPane.showMessageDialog(this, "Enterprise added successfully");
            return;
        }
        nameField.setText("");
        phoneField.setText("");
    }//GEN-LAST:event_addBtnActionPerformed

    private void networkTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkTypeActionPerformed

    }//GEN-LAST:event_networkTypeActionPerformed

    private void enterpriseTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeActionPerformed

    }//GEN-LAST:event_enterpriseTypeActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        populateTable();
    }//GEN-LAST:event_viewBtnActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JButton dltBtn;
    private javax.swing.JComboBox<String> enterpriseType;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblsysadmin;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> networkCombo;
    private javax.swing.JComboBox<String> networkType;
    private javax.swing.JTextField phoneField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();
        Model.setRowCount(0);
        Object row[] = new Object[10];
        String networkItem = networkCombo.getSelectedItem().toString();
        Network network = systAdmin.findNetwork(networkItem);

        List<BussEvent> eventList = network.getentDir().getListOfEvents();
        if (eventList != null) {
            for (int i = 0; i < eventList.size(); i++) {
                row[0] = networkItem;
                row[1] = eventList.get(i).getName();
                row[2] = "Business Event";
                row[3] = eventList.get(i).getphone();
                Model.addRow(row);
            }
        }

        List<rest> restList = network.getentDir().getListOfrests();
        if (restList != null) {
            for (int i = 0; i < restList.size(); i++) {
                row[0] = networkItem;
                row[1] = restList.get(i).getName();
                row[2] = "rest";
                row[3] = restList.get(i).getphone();
                Model.addRow(row);
            }
        }

        List<HClub> HClubList = network.getentDir().getListOfHClub();
        if (HClubList != null) {
            for (int i = 0; i < HClubList.size(); i++) {
                row[0] = networkItem;
                row[1] = HClubList.get(i).getName();
                row[2] = "Health Club";
                row[3] = HClubList.get(i).getphone();
                Model.addRow(row);
            }
        }

        List<Hotel> hotelList = network.getentDir().getListOfHotel();
        if (hotelList != null) {
            for (int i = 0; i < hotelList.size(); i++) {
                row[0] = networkItem;
                row[1] = hotelList.get(i).getName();
                row[2] = "Hotel";
                row[3] = hotelList.get(i).getphone();
                Model.addRow(row);
            }
        }

    }


}
