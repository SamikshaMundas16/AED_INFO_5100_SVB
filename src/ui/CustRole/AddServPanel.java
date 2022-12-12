/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.CustRole;
import java.util.function.Consumer;
import ModelNew.Book;
import ModelNew.systAdmin;
/**
 *
 * @author DELL
 */
public class AddServPanel extends javax.swing.JPanel {

    private systAdmin systems;
    private Consumer<Book> callOnEventBook;
    private Consumer<Book> callOnOrderBook;
    private Consumer<Book> callOnHClubBook;
    private Consumer<Book> callOnServiceHotelBook;
    private Runnable backButton4;
    private String uName;
    private String hotelName;
    private Book Book;

    public AddServPanel(systAdmin systems, Consumer<Book> callOnEventBook, Consumer<Book> callOnOrderBook,
            Consumer<Book> callOnHClubBook, Consumer<Book> callOnServiceHotelBook, Runnable backButton, String uName, Book Book) {
        initComponents();
        this.systems = systems;
        this.callOnEventBook = callOnEventBook;
        this.callOnOrderBook = callOnOrderBook;
        this.callOnHClubBook = callOnHClubBook;
        this.callOnServiceHotelBook = callOnServiceHotelBook;
        this.backButton4 = backButton;
        this.uName = uName;
        this.Book = Book;
        setBackground(new java.awt.Color(255, 204, 204));
        backBtn.setBackground(new java.awt.Color(244, 120, 140));
        backBtn.setOpaque(true);
        eventBtn.setBackground(new java.awt.Color(244, 120, 140));
        eventBtn.setOpaque(true);
        orderBtn.setBackground(new java.awt.Color(244, 120, 140));
        orderBtn.setOpaque(true);
        HClubBtn.setBackground(new java.awt.Color(244, 120, 140));
        HClubBtn.setOpaque(true);
        otherService.setBackground(new java.awt.Color(244, 120, 140));
        otherService.setOpaque(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        backBtn = new javax.swing.JButton();
        eventBtn = new javax.swing.JButton();
        orderBtn = new javax.swing.JButton();
        HClubBtn = new javax.swing.JButton();
        otherService = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setText("ADD SERVICES ");

        backBtn.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        backBtn.setText("BACK");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        eventBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        eventBtn.setText("BUSINESS EVENTS ");
        eventBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eventBtnActionPerformed(evt);
            }
        });

        orderBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        orderBtn.setText("PLACE ORDER ");
        orderBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderBtnActionPerformed(evt);
            }
        });

        HClubBtn.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        HClubBtn.setText("HEALTH CLUB ");
        HClubBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HClubBtnActionPerformed(evt);
            }
        });

        otherService.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        otherService.setText("OTHER SERVICES");
        otherService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                otherServiceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 820, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(109, 109, 109)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(backBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 518, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(eventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(79, 79, 79)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(otherService, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(HClubBtn, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addContainerGap(109, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 753, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(147, 147, 147)
                    .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(13, 13, 13)
                    .addComponent(jLabel1)
                    .addGap(55, 55, 55)
                    .addComponent(eventBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(53, 53, 53)
                    .addComponent(orderBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(51, 51, 51)
                    .addComponent(HClubBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(59, 59, 59)
                    .addComponent(otherService, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(147, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        backButton4.run();
    }//GEN-LAST:event_backBtnActionPerformed

    private void eventBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eventBtnActionPerformed
        callOnEventBook.accept(Book);
    }//GEN-LAST:event_eventBtnActionPerformed

    private void orderBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderBtnActionPerformed
        callOnOrderBook.accept(Book);
    }//GEN-LAST:event_orderBtnActionPerformed

    private void HClubBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HClubBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HClubBtnActionPerformed

    private void otherServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_otherServiceActionPerformed
        callOnServiceHotelBook.accept(Book);
    }//GEN-LAST:event_otherServiceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton HClubBtn;
    private javax.swing.JButton backBtn;
    private javax.swing.JButton eventBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton orderBtn;
    private javax.swing.JButton otherService;
    // End of variables declaration//GEN-END:variables
}