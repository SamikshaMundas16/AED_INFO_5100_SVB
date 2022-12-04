/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.EventManagerRole;

import ModelNew.systAdmin;


/**
 *
 * @author DELL
 */
public class EventManagerPanel extends javax.swing.JPanel {
    
     private systAdmin systAdmin;
    private Runnable callOnCreateMethod1;
    private Runnable callOnCreateMethod2;
    private Runnable callOnCreateMethod3;

    public EvtManagerPanel(systAdmin systAdmin, Runnable callOnCreateMethod1, Runnable callOnCreateMethod2, Runnable callOnCreateMethod3) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnCreateMethod2 = callOnCreateMethod2;
        this.callOnCreateMethod3 = callOnCreateMethod3;
        setBackground(new java.awt.Color(255, 204, 204));
        viewTask.setBackground(new java.awt.Color(244, 120, 140));
        viewTask.setOpaque(true);
        orgBtn.setBackground(new java.awt.Color(244, 120, 140));
        orgBtn.setOpaque(true);
        orgadmin.setBackground(new java.awt.Color(244, 120, 140));
        orgadmin.setOpaque(true);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Genecostd Code">                          
    private void initComponents() {

        orgBtn = new javax.swing.JButton();
        viewTask = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        orgadmin = new javax.swing.JButton();

        orgBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        orgBtn.setText("MANAGE ORGANISATION");
        orgBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgBtnActionPerformed(evt);
            }
        });

        viewTask.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewTask.setText("VIEW TASK");
        viewTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewTaskActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("EVENT MANAGER PANEL ");

        orgadmin.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orgadmin.setText("MANAGE ORGANISATION ADMIN");
        orgadmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orgadminActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(338, 338, 338)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(orgadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 313, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(orgBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(viewTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(270, 270, 270)
                        .addComponent(jLabel1)))
                .addContainerGap(330, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabel1)
                .addGap(75, 75, 75)
                .addComponent(viewTask, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(orgBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(orgadmin, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void orgBtnActionPerformed(java.awt.event.ActionEvent evt) {                                       
        callOnCreateMethod2.run();
    }                                      

    private void viewTaskActionPerformed(java.awt.event.ActionEvent evt) {                                         
        callOnCreateMethod1.run();
    }                                        

    private void orgadminActionPerformed(java.awt.event.ActionEvent evt) {                                         
        callOnCreateMethod3.run();
    }                                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orgBtn;
    private javax.swing.JButton orgadmin;
    private javax.swing.JButton viewTask;
    // End of variables declaration 
    
}
