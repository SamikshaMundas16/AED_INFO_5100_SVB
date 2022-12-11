package ui.confirm;

import javax.swing.table.DefaultTableModel;
import ModelNew.Book;
import ModelNew.Cust;
import ModelNew.CustDirectory;
import ModelNew.Manager;
import ModelNew.Org;
import ModelNew.systAdmin;
import ModelNew.services.Service;

public class ConfirmEventWorkReq extends javax.swing.JPanel {

    private systAdmin systAdmin;
    private String user;
    private String type;

    public ConfirmEventWorkReq(systAdmin systAdmin, String user, String type) {
        initComponents();
        this.systAdmin = systAdmin;
        this.user = user;
        this.type = type;
        lblbookservices.setText(lblbookservices.getText() + type.toUpperCase() + " Org");
        populateTable();
        setBackground(new java.awt.Color(255, 204, 204));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Genecostd Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblbookservices = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lblbookservices.setText("ASSIGNED WORK REQUESTS FOR ");

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModelNew(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cust ID", "Book ID", "HOTEL NAME", "DATE", "STATUS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(lblbookservices)))
                .addContainerGap(442, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblbookservices)
                .addGap(56, 56, 56)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(352, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel lblbookservices;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel Model = (DefaultTableModel) jTable1.getModel();
        Model.setRowCount(0);

        CustDirectory CustDirec = systAdmin.getCustDirec();
        for (Cust Cust : CustDirec.getListOfCust()) {
            for (Book Book : Cust.getBkList()) {
                for (Service service : Book.getServices()) {
                    for (Org org : service.getListOfOrg()) {
                        for (Manager man : org.getListOfManager()) {
                            if (man.getuName().equals(user)) {
                                Object row[] = new Object[5];
                                row[0] = Cust.getuName();
                                row[1] = Book.getId();
                                row[2] = Book.getServiceHotel().getEnterprise().getName();
                                row[3] = service.getDate();
                                row[4] = service.getStatus();

                                Model.addRow(row);
                            }

                            System.out.println();
                        }
                    }
                }
            }
        }

    }
}
