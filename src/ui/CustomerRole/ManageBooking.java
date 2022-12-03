/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.CustomerRole;

import java.util.List;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModelNew;
import ModelNew.Book;
import ModelNew.Cust;
import ModelNew.CustDirectory;
import ModelNew.systAdmin;

/**
 *
 * @author DELL
 */
public class ManageBooking extends javax.swing.JPanel {
     private systAdmin systAdmin;
    private Runnable callOnCreateMethod1;
    private Consumer<Book> callOnAddServiceMethod;
    private Consumer<Book> callOnViewServiceMethod;
    private String uName;

    public ManageBook(systAdmin systAdmin, Runnable callOnCreateMethod1, Consumer<Book> callOnCreateMethod2, Consumer<Book> callOnViewServiceMethod, String uName) {
        initComponents();
        this.systAdmin = systAdmin;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.callOnAddServiceMethod = callOnCreateMethod2;
        this.callOnViewServiceMethod = callOnViewServiceMethod;
        this.uName = uName;

        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        addServiceBtn.setBackground(new java.awt.Color(244, 120, 140));
        addServiceBtn.setOpaque(true);
        viewOrder.setBackground(new java.awt.Color(244, 120, 140));
        viewOrder.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Genecostd Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        addServiceBtn = new javax.swing.JButton();
        viewOrder = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setText("Book dtls");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModelNew(new javax.swing.table.DefaultTableModelNew(
            new Object [][] {

            },
            new String [] {
                "HOTEL NAME", "Book ID", "PRICE", "STATUS", "CHECK_IN", "CHECK OUT"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        addServiceBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        addServiceBtn.setText("ADD SERVICES");
        addServiceBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addServiceBtnActionPerformed(evt);
            }
        });

        viewOrder.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        viewOrder.setText("VIEW SERVICE dtls");
        viewOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewOrderActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 877, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(173, 173, 173)
                        .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67)
                        .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewOrder, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addServiceBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(347, 347, 347))
        );
    }// </editor-fold>                        

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        callOnCreateMethod1.run();
    }                                       

    private void addServiceBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        int selectedRowIndex = jTable1.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Book to add services.");
            return;
        }

        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        String BookId = (String) ModelNew.getValueAt(selectedRowIndex, 1);

        System.out.println(BookId + " is selected");

        CustDirectory customDirec = systAdmin.getCustDirec();
        Cust Cust = customDirec.findCustuName(uName);

        List<Book> list = Cust.getBkList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(BookId)) {
                callOnAddServiceMethod.accept(list.get(i));
                return;
            }
        }
    }                                             

    private void viewOrderActionPerformed(java.awt.event.ActionEvent evt) {                                          
        int selectedRowIndex = jTable1.getSelectedRow();
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Book to view its dtls.");
            return;
        }
        String BookId = (String) ModelNew.getValueAt(selectedRowIndex, 1);

        System.out.println(BookId + " is selected");

        CustDirectory customDirec = systAdmin.getCustDirec();
        Cust Cust = customDirec.findCustuName(uName);

        List<Book> list = Cust.getBkList();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(BookId)) {
                callOnViewServiceMethod.accept(list.get(i));
                return;
            }
        }
    }                                         


    // Variables declaration - do not modify                     
    private javax.swing.JButton addServiceBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton viewOrder;
    // End of variables declaration                   

    private void populateTable() {
        DefaultTableModelNew ModelNew = (DefaultTableModelNew) jTable1.getModelNew();
        ModelNew.setRowCount(0);
        Object row[] = new Object[10];
        CustDirectory customDirec = systAdmin.getCustDirec();
        Cust Cust = customDirec.findCustuName(uName);
        System.out.println("Cust found is " + Cust.getName() + " uName is " + uName);
        for (Book BkList : Cust.getBkList()) {
            row[0] = BkList.getServiceHotel().getEnterprise();
            row[1] = BkList.getId();
            row[2] = BkList.getTotalprice();
            row[3] = BkList.getStatus();
            row[4] = BkList.getintime();
            row[5] = BkList.getouttime();
            ModelNew.addRow(row);
        }

    }
    
}
