/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ModelNew.Book;
import ModelNew.HClub;
import ModelNew.systAdmin;
import ModelNew.services.HClubService;
import ui.main.DateUtils;

/**
 *
 * @author DELL
 */
public class HealthClubServicesJpanel extends javax.swing.JPanel {
    
     private systAdmin systems;
    private Consumer<Book> callOnCreateMethod1;
    private String uName;
    private Book Book;

    public HClubServicesJPanel(systAdmin systems, Consumer<Book> callOnCreateMethod1, String uName, Book Book) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.uName = uName;
        this.Book = Book;

        for (HClub HClub : Book.getNetwork().getentDir().getListOfHClub()) {
            HClubCombo.addItem(HClub);
        }
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        addServiceBtn.setBackground(new java.awt.Color(244, 120, 140));
        addServiceBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Genecostd Code">                          
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        yogaBtn = new javax.swing.JCheckBox();
        massageBtn = new javax.swing.JCheckBox();
        medicalServiceBtn = new javax.swing.JCheckBox();
        addServiceBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        HClubCombo = new javax.swing.JComboBox<>();

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setText("HEALTH CLUB SERVICES");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        yogaBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yogaBtn.setText("YOGA ($20)");
        yogaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yogaBtnActionPerformed(evt);
            }
        });

        massageBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        massageBtn.setText("MASSAGE AND SPA ($20)");
        massageBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                massageBtnActionPerformed(evt);
            }
        });

        medicalServiceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        medicalServiceBtn.setText("MEDICAL SERVICE  ($60)");
        medicalServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalServiceBtnActionPerformed(evt);
            }
        });

        addServiceBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICE");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel3.setText("(MONDAY-SUNDAY) 7A.M - 9A.M");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel5.setText("(MONDAY-SUNDAY) 4P.M-5:30P.M ");

        jLabel6.setText("(MONDAY - SUNDAY) 12P.M-4P.M ");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel7.setText("SELECT A DATE ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("Health Club");

        HClubCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(backBtn)
                        .addGap(155, 155, 155)
                        .addComponent(lblbookservices))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(213, 213, 213)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(massageBtn)
                            .addComponent(medicalServiceBtn)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(yogaBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel7)))
                        .addGap(86, 86, 86)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5)
                            .addComponent(HClubCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(380, 380, 380)
                        .addComponent(addServiceBtn)))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblbookservices)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(HClubCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yogaBtn)
                    .addComponent(jLabel3))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(massageBtn))
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medicalServiceBtn)
                    .addComponent(jLabel6))
                .addGap(101, 101, 101)
                .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void medicalServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              

        HClub HClub = (HClub) HClubCombo.getSelectedItem();
        if (HClub == null) {
            JOptionPane.showMessageDialog(this, "Please select a health club from the dropdown.");
            return;
        }
        Date date = DateUtils.formatDate(dateField.getDate());
        Date intime = Book.getintime();
        Date outtime = Book.getouttime();

        if (date.compareTo(intime) < 0 || date.compareTo(outtime) > 0) {
            JOptionPane.showMessageDialog(this, "Selected date should be within check-in date (" + intime
                    + ") and outtime date (" + outtime + ")");
            return;
        }

        boolean yogaBtnSelected = yogaBtn.isSelected();
        boolean massageRadioBtnSelected = massageBtn.isSelected();
        boolean medicalRadioBtnSelected = medicalServiceBtn.isSelected();

        if (!yogaBtnSelected && !massageRadioBtnSelected && !medicalRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Health Club.");
            return;
        }

        HClubService HClubService = new HClubService(HClub, date);
        if (yogaBtnSelected) {
            HClubService.addService(HClubService.HClubServiceType.TRAINER);
        }

        if (massageRadioBtnSelected) {
            HClubService.addService(HClubService.HClubServiceType.Therapy);
        }

        if (medicalRadioBtnSelected) {
            HClubService.addService(HClubService.HClubServiceType.Phy);
        }

        Book.addService(HClubService);
        JOptionPane.showMessageDialog(this, "Your health club appointment is booked for " + date);
        callOnCreateMethod1.accept(Book);
    }                                             

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        callOnCreateMethod1.accept(Book);
    }                                       

    private void yogaBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        

    }                                       

    private void massageBtnActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JComboBox<HClub> HClubCombo;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JCheckBox massageBtn;
    private javax.swing.JCheckBox medicalServiceBtn;
    private javax.swing.JCheckBox yogaBtn;
    // End of variables declaration  
    
}
