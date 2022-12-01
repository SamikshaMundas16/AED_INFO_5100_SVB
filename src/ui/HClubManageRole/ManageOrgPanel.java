/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HClubManageRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModelNew;
import ModelNew.entDir;
import ModelNew.HClub;
import ModelNew.Network;
import ModelNew.PhyOrg;
import ModelNew.systAdmin;
import ModelNew.TherapyOrg;
import ModelNew.TrainerOrg;

/**
 *
 * @author Samikshan
 */
public class ManageOrgPanel extends javax.swing.JPanel {

    private systAdmin systAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private Network network;

    public ManageOrgPanel(systAdmin systAdmin, Runnable callOnCreateMethod, String user, Network network) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.network = network;
        cityNameTextField.setText(network.getName());
        cityNameTextField.setEditable(false);
        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));

        dltBtn.setBackground(new java.awt.Color(244, 120, 140));
        dltBtn.setOpaque(true);
        addButton.setBackground(new java.awt.Color(244, 120, 140));
        addButton.setOpaque(true);
        updateButton.setBackground(new java.awt.Color(244, 120, 140));
        updateButton.setOpaque(true);
        backButton.setBackground(new java.awt.Color(244, 120, 140));
        backButton.setOpaque(true);
    }

    /**
     * Creates new form ManageOrgPanel
     */
    public ManageOrgPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        updateButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dltBtn = new javax.swing.JButton();
        cityNameTextField = new javax.swing.JTextField();
        contactField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        orgCombo = new javax.swing.JComboBox<>();

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        addButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addButton.setText("ADD");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ORGANIZATION TYPE ");

        updateButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        updateButton.setText("UPDATE");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("CONTACT");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("NAME ");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANIZATION FOR HEALTH CLUB");

        dltBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dltBtn.setText("DELETE");
        dltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBtnActionPerformed(evt);
            }
        });

        contactField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        contactField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contactFieldActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ORGANIZATION TYPE", "NAME", "CONTACT", "CITY"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true
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

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("CITY");

        nameField.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        orgCombo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        orgCombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select a organization", "Physician", "Trainer", "Therapist" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(dltBtn)
                .addGap(118, 118, 118))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(336, 336, 336)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118)
                        .addComponent(updateButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orgCombo, 0, 218, Short.MAX_VALUE)
                            .addComponent(nameField)
                            .addComponent(contactField)
                            .addComponent(cityNameTextField)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backButton)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 998, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(198, 198, 198)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 561, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(backButton)
                .addGap(7, 7, 7)
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dltBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(orgCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contactField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cityNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(83, 83, 83))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        callOnCreateMethod.run();
    }//GEN-LAST:event_backButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        String networkName = network.getName();  //find the network
        String name = nameField.getText();

        if (name == null || name.length() < 2) {
            JOptionPane.showMessageDialog(this, "Org name should be at least 2 characters long.");
            return;
        }

        String phone = phoneField.getText();
        String orgType1 = orgCombo.getSelectedItem().toString();
        entDir enterpriseDirc = network.getentDir();
        List<HClub> HClub = enterpriseDirc.getListOfHClub();
        for (int i = 0; i < HClub.size(); i++) {
            HClub.get(i).findManager(user);      //find HClub for which manager is working for
            if (orgType1.equals("Phy")) {
                HClub.get(i).addPhyOrg(name, phone, networkName);
                JOptionPane.showMessageDialog(this, "Phy Organisation added successfully");
            } else if (orgType1.equals("Trainer")) {
                HClub.get(i).addTraineOrg(name, phone, networkName);
                JOptionPane.showMessageDialog(this, "Trainer Organisation successfully");
            } else {
                HClub.get(i).addTherapyOrg(name, phone, networkName);
                JOptionPane.showMessageDialog(this, "Therapy Organisation added successfully");
            }
        }
        populateTable();
    }//GEN-LAST:event_addButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        if (jTable1.getSelectedRowCount() != 1) {
            JOptionPane.showMessageDialog(this, "Please select a row to update.");
        }

        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();

        String orgType = orgCombo.getSelectedItem().toString();
        String orgname = ModelNew.getValueAt(jTable1.getSelectedRow(), 1).toString();

        entDir enterpriseDirec = network.getentDir();
        for (HClub club : enterpriseDirec.getListOfHClub()) {
            if (orgType.equals("Phy") && club.getListOfPhyOrg() != null) {
                for (PhyOrg phy : club.getListOfPhyOrg()) {
                    if (phy.getName().equals(orgname)) {
                        phy.setName(nameField.getText());
                        phy.setphone(phoneField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Therapy") && club.getListOfTherapyOrg() != null) {
                for (TherapyOrg Therapy : club.getListOfTherapyOrg()) {
                    if (Therapy.getName().equals(orgname)) {
                        Therapy.setName(nameField.getText());
                        Therapy.setphone(phoneField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            } else if (orgType.equals("Trainer") && club.getListOfTrainerOrg() != null) {
                for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                    if (trainer.getName().equals(orgname)) {
                        trainer.setName(nameField.getText());
                        trainer.setphone(phoneField.getText());
                        JOptionPane.showMessageDialog(this, "Updated successfully");
                        populateTable();
                        return;
                    }
                }
            }

        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void dltBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dltBtnActionPerformed
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
        for (HClub club : enterpriseDirec.getListOfHClub()) {
            if (club.findManager(user) != null) {
                if (OrgType.equals("Phy") && club.getListOfPhyOrg() != null) {
                    for (PhyOrg Phy : club.getListOfPhyOrg()) {
                        if (Phy.getName().equals(OrgName)) {
                            club.dltPhy(Phy);
                            JOptionPane.showMessageDialog(this, "dltd successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Trainer") && club.getListOfTrainerOrg() != null) {
                    for (TrainerOrg trainer : club.getListOfTrainerOrg()) {
                        if (trainer.getName().equals(OrgName)) {
                            club.dltTrainer(trainer);
                            JOptionPane.showMessageDialog(this, "dltd successfully");
                            populateTable();
                        }
                    }
                } else if (OrgType.equals("Therapy") && club.getListOfTherapyOrg() != null) {
                    for (TherapyOrg Therapy : club.getListOfTherapyOrg()) {
                        if (Therapy.getName().equals(OrgName)) {
                            club.dltTherapy(Therapy);
                            JOptionPane.showMessageDialog(this, "dltd successfully");
                            populateTable();
                        }
                    }
                } else {
                    return;
                }

            }
        }

    }//GEN-LAST:event_dltBtnActionPerformed

    private void contactFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contactFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contactFieldActionPerformed

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

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orgComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_orgComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton backButton;
    private javax.swing.JTextField cityNameTextField;
    private javax.swing.JTextField contactField;
    private javax.swing.JButton dltBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables


    private void populateTable() {
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        ModelNew.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        Network network1 = systAdmin.findNetwork(network.getName());
        entDir enterpriseDirec = network1.getentDir();
        for (HClub health : enterpriseDirec.getListOfHClub()) {
            if (health.findManager(user) != null) {
                if (health.getListOfPhyOrg() != null) {
                    row[0] = "Phy";
                    for (PhyOrg Phy : health.getListOfPhyOrg()) {
                        row[0] = "Phy";
                        row[1] = Phy.getName();
                        row[2] = Phy.getphone();
                        row[3] = network1.getName();
                        ModelNew.addRow(row);
                    }
                }
                if (health.getListOfTherapyOrg() != null) {
                    row[0] = "Therapy";
                    for (TherapyOrg Therapy : health.getListOfTherapyOrg()) {
                        row[0] = "Therapy";
                        row[1] = Therapy.getName();
                        row[2] = Therapy.getphone();
                        row[3] = network.getName();
                        ModelNew.addRow(row);
                    }
                }
                if (health.getListOfTrainerOrg() != null) {
                    row[0] = "Trainer";
                    for (TrainerOrg trainer : health.getListOfTrainerOrg()) {
                        row[0] = "Trainer";
                        row[1] = trainer.getName();
                        row[2] = trainer.getphone();
                        row[3] = network.getName();
                        ModelNew.addRow(row);
                    }
                }

            }
        }
    }

}
