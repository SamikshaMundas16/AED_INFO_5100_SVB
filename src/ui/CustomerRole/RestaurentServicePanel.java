/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ModelNew.Book;
import ModelNew.MenuContents;
import ModelNew.rest;
import ModelNew.systAdmin;
import ModelNew.services.restService;
import ui.main.DateUtils;

/**
 *
 * @author DELL
 */
public class RestaurentServicePanel javax.swing.JPanel {
    
    private systAdmin systems;
    private Consumer<Book> callOnCreateMethod1;
    private String uName;
    private Book Book;

    public RestServPanel(systAdmin systems, Consumer<Book> callOnCreateMethod1, String uName, Book Book) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.uName = uName;
        this.Book = Book;

        for (rest res : Book.getNetwork().getentDir().getListOfrests()) {
            restCombo.addItem(res);
        }
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        placeOrder.setBackground(new java.awt.Color(244, 120, 140));
        placeOrder.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Genecostd Code">                          
    private void initComponents() {

        MenuContents = new javax.swing.JComboBox<>();
        backBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        placeOrder = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        restCombo = new javax.swing.JComboBox<>();

        MenuContents.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        MenuContents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuContentsActionPerformed(evt);
            }
        });

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 36)); // NOI18N
        jLabel1.setText(" MENU ITEMS FOR rest");

        placeOrder.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        placeOrder.setText("PLACE ORDER");
        placeOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                placeOrderActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("SELECT ITEM FROM LIST ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("SELECT A rest NAME ");

        restCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        restCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                restComboActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(restCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(MenuContents, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 603, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(backBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(61, 61, 61))
            .addGroup(layout.createSequentialGroup()
                .addGap(286, 286, 286)
                .addComponent(placeOrder)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(backBtn)
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addGap(99, 99, 99)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(restCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(66, 66, 66)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(MenuContents, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(placeOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>                        

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        callOnCreateMethod1.accept(Book);
    }                                       

    private void restComboActionPerformed(java.awt.event.ActionEvent evt) {                                          
        MenuContents.removeAllItems();
        rest rest = (rest) restCombo.getSelectedItem();
        if (rest != null) {
            for (MenuContents item : rest.getListOfItem()) {
                MenuContents.addItem(item);
            }
        }
    }                                         

    private void MenuContentsActionPerformed(java.awt.event.ActionEvent evt) {                                             

    }                                            

    private void placeOrderActionPerformed(java.awt.event.ActionEvent evt) {                                           
        Date date = DateUtils.formatDate(new Date());
        MenuContents item = (MenuContents) MenuContents.getSelectedItem();
        rest rest = (rest) restCombo.getSelectedItem();

        restService service = new restService(rest, date, item.getdtls(), item.getPrice());
        Book.addService(service);
        JOptionPane.showMessageDialog(this, "Order placed successfully");

        callOnCreateMethod1.accept(Book);
    }                                          

    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JComboBox<MenuContents> MenuContents;
    private javax.swing.JButton placeOrder;
    private javax.swing.JComboBox<rest> restCombo;
    // End of variables declaration           
}
