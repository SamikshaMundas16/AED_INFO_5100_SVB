/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.EventManagerRole;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModelNew;
import ModelNew.BussEvent;
import ModelNew.CaterService;
import ModelNew.DecorServices;
import ModelNew.entDir;
import ModelNew.Manager;
import ModelNew.Network;
import ModelNew.PhotoService;
import ModelNew.systAdmin;
import ui.main.Validator;

/**
 *
 * @author DELL
 */
public class ManageOrganisationAdminForEvent extends javax.swing.JPanel {
    
     private systAdmin systAdmin;
    private Runnable callOnCreateMethod;
    private String user;
    private String type;
    private Network network;

    public ManageOrgAdminForEvt(systAdmin systAdmin, Runnable callOnCreateMethod, String user, String type, Network network) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod = callOnCreateMethod;
        this.user = user;
        this.type = type;
        this.network = network;
        networkName.setText(network.getName());
        networkName.setEditable(false);
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

    public boolean validateName() {
        if (nameField.getText().matches("[a-zA-Z]{2,19}") && nameField.getText() != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : name should contain only alphabets");
            return false;
        }
    }

    public boolean pwdName() {
        if (pwdField.getText().matches("[a-zA-Z]{3,}") && pwdField.getText() != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Invalid input : pwd should contain more than 3 or more letters");
            return false;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Genecostd Code">                          
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        uNameField = new javax.swing.JTextField();
        nameField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        pwdField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        dltBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        backButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        orgCombo = new javax.swing.JComboBox<>();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        orgName = new javax.swing.JComboBox<>();
        networkName = new javax.swing.JTextField();

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("NAME");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Org TYPE ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("NETWORK");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("uName");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("pwd");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Org NAME");

        dltBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        dltBtn.setText("dlt");
        dltBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dltBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("MANAGE ORGANISATION ADMIN FOR EVENTS");

        backButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backButton.setText("BACK");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModelNew(new javax.swing.table.DefaultTableModelNew(
            new Object [][] {

            },
            new String [] {
                "NETWORK", "Org TYPE", "Org NAME", "NAME", "uName", "pwd"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        orgCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgCombo.setModelNew(new javax.swing.DefaultComboBoxModelNew<>(new String[] { "Decor", "Photography", "Catering" }));
        orgCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgComboActionPerformed(evt);
            }
        });

        addBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        updateBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });

        orgName.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        orgName.setModelNew(new javax.swing.DefaultComboBoxModelNew<>(new String[] { "Select organisation Name" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(orgCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(orgName, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(networkName, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(uNameField, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(nameField)
                    .addComponent(pwdField))
                .addGap(99, 99, 99))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dltBtn)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backButton))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(352, 352, 352)
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(85, 85, 85)
                        .addComponent(updateBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 974, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(216, 216, 216)
                        .addComponent(jLabel1)))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(backButton)
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(dltBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(nameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(networkName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(orgCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uNameField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(pwdField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(orgName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 83, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
    }// </editor-fold>                        

    private void dltBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to dlt");
            return;
        }
        String orgType = (String) ModelNew.getValueAt(selectedRowIndex, 1);
        String OrgName = (String) ModelNew.getValueAt(selectedRowIndex, 2);
        String selecteduser = (String) ModelNew.getValueAt(selectedRowIndex, 4);
        entDir enterpriseDirec = network.getentDir();
        for (BussEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (orgType.equals("Catering") && event.getListOfCatering() != null) {
                    for (CaterService catering : event.getListOfCatering()) {
                        if (catering.getName().equals(OrgName)) {
                            for (Manager man : catering.getListOfManager()) {
                                if (man.getuName().equals(selecteduser)) {
                                    catering.dltManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else if (orgType.equals("Decor") && event.getListOfDecors() != null) {
                    for (DecorServices decor : event.getListOfDecors()) {
                        if (decor.getName().equals(OrgName)) {
                            for (Manager man : decor.getListOfManager()) {
                                if (man.getuName().equals(selecteduser)) {
                                    decor.dltManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                } else {
                    for (PhotoService photo : event.getListOfPhotoServices()) {
                        if (photo.getName().equals(OrgName)) {
                            for (Manager man : photo.getListOfManager()) {
                                if (man.getuName().equals(selecteduser)) {
                                    photo.dltManager(man);
                                    JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                    populateTable();
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
    }                                      

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        Object row[] = new Object[20];
        String orgType = orgCombo.getSelectedItem().toString();
        String orgName1 = orgName.getSelectedItem().toString();
        String name = nameField.getText();
        String uName = uNameField.getText();
        String pwd = pwdField.getText();

        if (!Validator.validateName(this, name) || !Validator.validateuName(this, uName)
                || !Validator.validatepwd(this, pwd)) {
            return;
        }
        
        entDir enterpriseDirec = network.getentDir();
        List<BussEvent> list = enterpriseDirec.getListOfEvents();
        if (!systAdmin.userExistsInSystem(uName)) {
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).findManager(user) != null) {    //if enterpirse manager found 
                    if (orgType.equals("Catering")) {
                        List<CaterService> org1 = list.get(i).getListOfCatering();    // add organisation managers for each org
                        for (int j = 0; j < org1.size(); j++) {
                            if (org1.get(j).getName().equals(orgName1)) {
                                org1.get(j).addManager(name, network.getName(), uName, pwd);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = uName;
                                row[5] = pwd;
                                ModelNew.addRow(row);
                                systAdmin.adduser(uName, pwd, "Catering");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else if (orgType.equals("Decor")) {
                        List<DecorServices> org2 = list.get(i).getListOfDecors();

                        for (int j = 0; j < org2.size(); j++) {
                            System.out.println(org2.get(i).getName() + "name of decor org");
                            if (org2.get(j).getName().equals(orgName1)) {
                                org2.get(j).addManager(name, network.getName(), uName, pwd);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = uName;
                                row[5] = pwd;
                                ModelNew.addRow(row);
                                systAdmin.adduser(uName, pwd, "Decor");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    } else {
                        List<PhotoService> org3 = list.get(i).getListOfPhotoServices();
                        for (int j = 0; j < org3.size(); j++) {
                            if (org3.get(j).getName().equals(orgName1)) {
                                org3.get(j).addManager(name, network.getName(), uName, pwd);
                                row[0] = network.getName();
                                row[1] = orgType;
                                row[2] = orgName1;
                                row[3] = name;
                                row[4] = uName;
                                row[5] = pwd;
                                ModelNew.addRow(row);
                                systAdmin.adduser(uName, pwd, "Photography");
                                JOptionPane.showMessageDialog(this, " Organisation Manager added successfully");
                                return;
                            }
                        }
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "uName already exists");
        }
    }                                      

    private void orgComboActionPerformed(java.awt.event.ActionEvent evt) {                                         
        orgName.removeAllItems();

        String orgType = orgCombo.getSelectedItem().toString();
        entDir enterpriseDirec = network.getentDir();
        List<BussEvent> list = enterpriseDirec.getListOfEvents();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).findManager(user) != null) {
                if (orgType.equals("Catering")) {
                    List<CaterService> org1 = list.get(i).getListOfCatering();
                    for (int j = 0; j < org1.size(); j++) {
                        orgName.addItem(org1.get(j).getName());
                    }
                } else if (orgType.equals("Decor")) {
                    List<DecorServices> org2 = list.get(i).getListOfDecors();
                    for (int j = 0; j < org2.size(); j++) {
                        orgName.addItem(org2.get(j).getName());
                    }
                } else {
                    List<PhotoService> org3 = list.get(i).getListOfPhotoServices();
                    for (int j = 0; j < org3.size(); j++) {
                        orgName.addItem(org3.get(j).getName());
                    }
                }
                return;
            }
        }
    }                                        

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        callOnCreateMethod.run();
    }                                          

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {                                     
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        String city = ModelNew.getValueAt(jTable1.getSelectedRow(), 0).toString();
        String orgType = ModelNew.getValueAt(jTable1.getSelectedRow(), 1).toString();
        String oName = ModelNew.getValueAt(jTable1.getSelectedRow(), 2).toString();
        String managerName = ModelNew.getValueAt(jTable1.getSelectedRow(), 3).toString();
        String manageruName = ModelNew.getValueAt(jTable1.getSelectedRow(), 4).toString();
        String managerpwd = ModelNew.getValueAt(jTable1.getSelectedRow(), 5).toString();

        nameField.setText(managerName);
        uNameField.setText(manageruName);
        pwdField.setText(managerpwd);
        uNameField.setEnabled(false);
        orgCombo.setSelectedItem(orgType);
        orgName.setSelectedItem(oName);

    }                                    

    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {                                          
        if (jTable1.getSelectedRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "Please select a row to update");
            return;
        }

        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        if (jTable1.getSelectedRowCount() == 1) {

            String orgType = orgCombo.getSelectedItem().toString();
            String orgname = orgName.getSelectedItem().toString();
            String uName = uNameField.getText();
            String pwd = pwdField.getText();

            entDir enterpriseDirec = network.getentDir();
            for (BussEvent event : enterpriseDirec.getListOfEvents()) {
                if (orgType.equals("Catering") && event.getListOfCatering() != null) {
                    for (CaterService catering : event.getListOfCatering()) {
                        for (Manager man : catering.getListOfManager()) {
                            if (man.getuName().equals(uNameField.getText())) {
                                man.setName(nameField.getText());
                                man.setpwd(pwdField.getText());
                                systAdmin.updateuser(uName, pwd);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Decor") && event.getListOfDecors() != null) {
                    for (DecorServices decor : event.getListOfDecors()) {
                        for (Manager man : decor.getListOfManager()) {
                            if (man.getuName().equals(uNameField.getText())) {
                                man.setName(nameField.getText());
                                man.setpwd(pwdField.getText());
                                systAdmin.updateuser(uName, pwd);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else if (orgType.equals("Photography") && event.getListOfPhotoServices() != null) {
                    for (PhotoService photo : event.getListOfPhotoServices()) {
                        for (Manager man : photo.getListOfManager()) {
                            if (man.getuName().equals(uNameField.getText())) {
                                man.setName(nameField.getText());
                                man.setpwd(pwdField.getText());
                                systAdmin.updateuser(uName, pwd);
                                JOptionPane.showMessageDialog(this, "Updated successfully");
                                populateTable();
                                return;
                            }
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Invalid Org");
                }
            }
        }
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JButton addBtn;
    private javax.swing.JButton backButton;
    private javax.swing.JButton dltBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField networkName;
    private javax.swing.JComboBox<String> orgCombo;
    private javax.swing.JComboBox<String> orgName;
    private javax.swing.JTextField pwdField;
    private javax.swing.JButton updateBtn;
    private javax.swing.JTextField uNameField;
    // End of variables declaration                   

    private void populateTable() {
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        ModelNew.setRowCount(0);
        Object row[] = new Object[10];
        String orgType1 = orgCombo.getSelectedItem().toString();
        Network network1 = systAdmin.findNetwork(network.getName());
        entDir enterpriseDirec = network.getentDir();
        if (enterpriseDirec == null) {
            return;
        }
        for (BussEvent event : enterpriseDirec.getListOfEvents()) {
            if (event.findManager(user) != null) {
                if (event.getListOfCatering() != null) {
                    row[0] = "Catering";
                    for (CaterService catering : event.getListOfCatering()) {
                        for (Manager manager : catering.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Catering";
                            row[2] = catering.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getuName();
                            row[5] = manager.getpwd();
                            ModelNew.addRow(row);
                        }
                    }
                }
                if (event.getListOfDecors() != null) {
                    row[0] = "Decor";
                    for (DecorServices decor : event.getListOfDecors()) {
                        for (Manager manager : decor.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Decor";
                            row[2] = decor.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getuName();
                            row[5] = manager.getpwd();
                            ModelNew.addRow(row);
                        }
                    }
                }
                if (event.getListOfPhotoServices() != null) {
                    row[0] = "Photography";
                    for (PhotoService photo : event.getListOfPhotoServices()) {
                        for (Manager manager : photo.getListOfManager()) {       //add manager 
                            row[0] = network1.getName();
                            row[1] = "Photography";
                            row[2] = photo.getName();
                            row[3] = manager.getName();
                            row[4] = manager.getuName();
                            row[5] = manager.getpwd();
                            ModelNew.addRow(row);
                        }
                    }
                }
            }
        }
    }
}
