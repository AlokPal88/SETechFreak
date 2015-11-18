/*
 * CEB.java
 * Author: Yeshwanth Akarapu
 * Created on Nov 2015, 5:49:39 PM
 */

package cseb;

import java.awt.Dimension;
import java.awt.Toolkit;

public class CEB extends javax.swing.JFrame {

    /** Creates new form CEB */
    public CEB() {
        initComponents();
           Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    this.setSize(screenSize);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenu8 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ELECTRICAL BILL SYSTEM");

        jDesktopPane1.setAutoscrolls(true);

        jMenu5.setText("BILL MANAGEMENT");
        jMenu5.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CallBillsettings(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        jMenu1.setText("NEW CUSTOMERS");
        jMenu1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                NewCustomerCall(evt);
            }
        });
        jMenuBar1.add(jMenu1);

        jMenu2.setText("BILL GENERATE");
        jMenu2.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillgenrateCall(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setText("BILL RECIEVED");
        jMenu3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BillRecivedCall(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setText("UPDATE CUSTOMERS");
        jMenu4.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customerUpdate(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu6.setText("CHANGE PASSWORD");
        jMenu6.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu6);

        jMenu8.setText("REPORT");
        jMenu8.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jMenu8.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jMenu8ItemStateChanged(evt);
            }
        });

        jMenuItem1.setText("Bill Print");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem1);

        jMenuBar1.add(jMenu8);

        jMenu7.setText("EXIT");
        jMenu7.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jMenu7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu7MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 958, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jDesktopPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 301, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CallBillsettings(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CallBillsettings
        // TODO add your handling code here:
        RateSettingForm rate=new RateSettingForm();
        jDesktopPane1.add(rate);
        rate.setVisible(true);
    }//GEN-LAST:event_CallBillsettings

    private void NewCustomerCall(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_NewCustomerCall
        // TODO add your handling code here:
        CustomerDetailForm cust=new CustomerDetailForm();
        jDesktopPane1.add(cust);
        cust.setVisible(true);
    }//GEN-LAST:event_NewCustomerCall

    private void BillgenrateCall(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillgenrateCall
        // TODO add your handling code here:
        BillGenerationForm bill=new BillGenerationForm();
        jDesktopPane1.add(bill);
        bill.setVisible(true);
    }//GEN-LAST:event_BillgenrateCall

    private void BillRecivedCall(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BillRecivedCall
        // TODO add your handling code here:
        BillPaymentForm billpay=new BillPaymentForm();
        jDesktopPane1.add(billpay);
        billpay.setVisible(true);
    }//GEN-LAST:event_BillRecivedCall

    private void customerUpdate(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customerUpdate
        // TODO add your handling code here:
         CustomerDetailUpdate cust=new  CustomerDetailUpdate();
        jDesktopPane1.add(cust);
        cust.setVisible(true);
    }//GEN-LAST:event_customerUpdate

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        // TODO add your handling code here:
        ChangePassword cpass=new ChangePassword(this,true);
        cpass.setVisible(true);
    }//GEN-LAST:event_jMenu6MouseClicked

    private void jMenu7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu7MouseClicked
        // TODO add your handling code here:
        System.exit(1);
    }//GEN-LAST:event_jMenu7MouseClicked

    private void jMenu8ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jMenu8ItemStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jMenu8ItemStateChanged

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        BillPrinting BILL=new BillPrinting();
        BILL.setVisible(true);
        jDesktopPane1.add(BILL);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
    * @param args the command line arguments
    */
//    public static void main(String args[]) {
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new CEB().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    // End of variables declaration//GEN-END:variables

}
