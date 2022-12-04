/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.CustomerRole;

import ModelNew.systAdmin;

/**
 *
 * @author DELL
 */
public class CustomerStartingJpanel extends javax.swing.JPanel {
    
     private systAdmin systAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private String user;

    public CustStartingPanel(systAdmin systAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        roombookButton.setBackground(new java.awt.Color(244, 120, 140));
        roombookButton.setOpaque(true);
        manageBook.setBackground(new java.awt.Color(244, 120, 140));
        manageBook.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Genecostd Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        roombookButton = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        manageBook = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Cust PANEL ");

        roombookButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        roombookButton.setText("BOOK ROOMS & SERVICES");
        roombookButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roombookButtonActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");

        manageBook.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        manageBook.setText("MANAGE Book");
        manageBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageBookActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(370, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(manageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(roombookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(332, 332, 332))
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(backBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addComponent(roombookButton, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(manageBook, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(458, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void manageBookActionPerformed(java.awt.event.ActionEvent evt) {                                           
        callOnCreateMethod2.run();
    }                                          

    private void roombookButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
        callOnCreateMethod1.run();
    }                                              


    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageBook;
    private javax.swing.JButton roombookButton;
    // End of variables declaration   
    
}
