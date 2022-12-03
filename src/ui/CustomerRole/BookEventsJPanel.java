/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ui.CustomerRole;

import java.util.Date;
import java.util.function.Consumer;
import javax.swing.JOptionPane;
import ModelNew.Book;
import ModelNew.BussEvent;
import ModelNew.CaterService.CateringType;
import ModelNew.DecorServices.DecorType;
import ModelNew.PhotoService.PhotoType;
import ModelNew.systAdmin;
import ModelNew.services.BussEventService;
import ui.main.DateUtils;

/**
 *
 * @author DELL
 */
public class BookEventsJPanel extends javax.swing.JPanel {
     private systAdmin systems;
    private Consumer<Book> callOnCreateMethod1;
    private String uName;
    private Book Book;

    public BookEventsPanel(systAdmin systems, Consumer<Book> callOnCreateMethod1, String uName, Book Book) {
        initComponents();
        this.systems = systems;
        this.callOnCreateMethod1 = callOnCreateMethod1;
        this.uName = uName;
        this.Book = Book;

        orgComboBox.addItem(null);
        for (BussEvent eventOrg : Book.getNetwork().getentDir().getListOfEvents()) {
            orgComboBox.addItem(eventOrg);
        }
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        totalPrice.setBackground(new java.awt.Color(244, 120, 140));
        totalPrice.setOpaque(true);
        bookEventBtn.setBackground(new java.awt.Color(244, 120, 140));
        bookEventBtn.setOpaque(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Genecostd Code">                          
    private void initComponents() {

        jRadioButtonMenuContents1 = new javax.swing.JRadioButtonMenuContents();
        backBtn = new javax.swing.JButton();
        lblbookservices = new javax.swing.JLabel();
        photoRadioBtn = new javax.swing.JRadioButton();
        cateringRadioBtn = new javax.swing.JRadioButton();
        bookEventBtn = new javax.swing.JButton();
        decorCombo = new javax.swing.JComboBox<>();
        photgraphyCombo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cateringCombo = new javax.swing.JComboBox<>();
        decorRadioBtn = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        priceField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        dateField = new com.toedter.calendar.JDateChooser();
        orgComboBox = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        totalPrice = new javax.swing.JButton();

        jRadioButtonMenuContents1.setSelected(true);
        jRadioButtonMenuContents1.setText("jRadioButtonMenuContents1");

        backBtn.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        lblbookservices.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblbookservices.setText("BOOK EVENTS");

        photoRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        photoRadioBtn.setText("PHOTOGRAPHY");
        photoRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                photoRadioBtnActionPerformed(evt);
            }
        });

        cateringRadioBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cateringRadioBtn.setText("CATERING");
        cateringRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringRadioBtnActionPerformed(evt);
            }
        });

        bookEventBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        bookEventBtn.setText("BOOK EVENT");
        bookEventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookEventBtnActionPerformed(evt);
            }
        });

        decorCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        photgraphyCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("TYPE OF PACKAGE ");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel1.setText("TYPE OF PACKAGE");

        cateringCombo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        cateringCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cateringComboActionPerformed(evt);
            }
        });

        decorRadioBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        decorRadioBtn.setText("DECOR SERVICE ");
        decorRadioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decorRadioBtnActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel6.setText("TYPE OF PACKAGE");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setText("DATE ");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel4.setText("BUSINESS EVENTS ");

        totalPrice.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        totalPrice.setText("TOTAL PRICE");
        totalPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalPriceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(decorRadioBtn)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel5)
                            .addComponent(cateringRadioBtn)
                            .addComponent(photoRadioBtn)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(totalPrice)
                                .addGap(110, 110, 110))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(200, 200, 200)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(81, 81, 81)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(photgraphyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cateringCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(decorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 431, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(backBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(344, 344, 344)
                        .addComponent(bookEventBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(241, 241, 241)
                        .addComponent(lblbookservices)))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(backBtn)
                .addGap(18, 18, 18)
                .addComponent(lblbookservices)
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(dateField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(orgComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(photoRadioBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(photgraphyCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(cateringRadioBtn)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cateringCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addComponent(decorRadioBtn)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(decorCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(totalPrice))
                .addGap(45, 45, 45)
                .addComponent(bookEventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
    }// </editor-fold>                        

    private void photoRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (photoRadioBtn.isSelected()) {
            photgraphyCombo.removeAllItems();
            for (PhotoType photo : PhotoType.values()) {
                photgraphyCombo.addItem(photo);
            }
        }
    }                                             

    private void bookEventBtnActionPerformed(java.awt.event.ActionEvent evt) {                                             

        BussEvent BussEvent = (BussEvent) orgComboBox.getSelectedItem();

        if (BussEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event Org from the dropdown.");
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

        boolean photoRadioBtnSelected = photoRadioBtn.isSelected();
        boolean decorRadioBtnSelected = decorRadioBtn.isSelected();
        boolean cateringRadioBtnSelected = cateringRadioBtn.isSelected();

        if (!photoRadioBtnSelected && !decorRadioBtnSelected && !cateringRadioBtnSelected) {
            JOptionPane.showMessageDialog(this, "Please select at least one service for Business Event.");
            return;
        }

        int price = 0;
        BussEventService service = new BussEventService(BussEvent, date);
        if (photoRadioBtnSelected) {
            PhotoType photography = (PhotoType) photgraphyCombo.getSelectedItem();
            service.addService(BussEventService.BussEventServiceType.PHOTOGRAPHY, photography.getcost());
            price += photography.getcost();
        }

        if (decorRadioBtnSelected) {
            DecorType decor = (DecorType) decorCombo.getSelectedItem();
            service.addService(BussEventService.BussEventServiceType.DECOR, decor.getcost());
            price += decor.getcost();
        }

        if (cateringRadioBtnSelected) {
            CateringType catering = (CateringType) cateringCombo.getSelectedItem();
            service.addService(BussEventService.BussEventServiceType.CATERING, catering.getcost());
            price += catering.getcost();
        }

        priceField.setText(String.valueOf(price));
        Book.addService(service);

        JOptionPane.showMessageDialog(this, "Business event service added successfully.");
        callOnCreateMethod1.accept(Book);
    }                                            

    private void cateringComboActionPerformed(java.awt.event.ActionEvent evt) {                                              

    }                                             

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {                                        
        callOnCreateMethod1.accept(Book);
    }                                       

    private void cateringRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                 
        if (cateringRadioBtn.isSelected()) {
            cateringCombo.removeAllItems();
            for (CateringType catering : CateringType.values()) {
                cateringCombo.addItem(catering);
            }

        }
    }                                                

    private void decorRadioBtnActionPerformed(java.awt.event.ActionEvent evt) {                                              
        if (decorRadioBtn.isSelected()) {
            decorCombo.removeAllItems();
            for (DecorType decor : DecorType.values()) {
                decorCombo.addItem(decor);
            }
        }
    }                                             

    private void totalPriceActionPerformed(java.awt.event.ActionEvent evt) {                                           

        BussEvent BussEvent = (BussEvent) orgComboBox.getSelectedItem();

        if (BussEvent == null) {
            JOptionPane.showMessageDialog(this, "Please select a Business Event Org from the dropdown.");
            return;
        }
        boolean photoRadioBtnSelected = photoRadioBtn.isSelected();
        boolean decorRadioBtnSelected = decorRadioBtn.isSelected();
        boolean cateringRadioBtnSelected = cateringRadioBtn.isSelected();
        Date date = DateUtils.formatDate(dateField.getDate());

        int price = 0;
        BussEventService service = new BussEventService(BussEvent, date);
        if (photoRadioBtnSelected) {
            PhotoType photography = (PhotoType) photgraphyCombo.getSelectedItem();
            service.addService(BussEventService.BussEventServiceType.PHOTOGRAPHY, photography.getcost());
            price += photography.getcost();
        }

        if (decorRadioBtnSelected) {
            DecorType decor = (DecorType) decorCombo.getSelectedItem();
            service.addService(BussEventService.BussEventServiceType.DECOR, decor.getcost());
            price += decor.getcost();
        }

        if (cateringRadioBtnSelected) {
            CateringType catering = (CateringType) cateringCombo.getSelectedItem();
            service.addService(BussEventService.BussEventServiceType.CATERING, catering.getcost());
            price += catering.getcost();
        }

        priceField.setText(String.valueOf(price));
    }                                          


    // Variables declaration - do not modify                     
    private javax.swing.JButton backBtn;
    private javax.swing.JButton bookEventBtn;
    private javax.swing.JComboBox<CateringType> cateringCombo;
    private javax.swing.JRadioButton cateringRadioBtn;
    private com.toedter.calendar.JDateChooser dateField;
    private javax.swing.JComboBox<DecorType> decorCombo;
    private javax.swing.JRadioButton decorRadioBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButtonMenuContents jRadioButtonMenuContents1;
    private javax.swing.JLabel lblbookservices;
    private javax.swing.JComboBox<BussEvent> orgComboBox;
    private javax.swing.JComboBox<PhotoType> photgraphyCombo;
    private javax.swing.JRadioButton photoRadioBtn;
    private javax.swing.JTextField priceField;
    private javax.swing.JButton totalPrice;
    // End of variables declaration 
}
