/*
 * BillGenerationForm.java
 *
 * Created on Oct, 2015, 5:43:38 PM
 */
package cseb;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Yeshwanth
 */
public class BillGenerationForm extends javax.swing.JInternalFrame {

    /** Creates new form BillGenerationForm */
    public BillGenerationForm() {
        initComponents();
      

    setLocation(200, 20);
        jtxtbillid.setText(getBillId());
        setCustomerId();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtbillto = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtcustomername = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtfname = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtaddress = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jtxtcity = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtxtdistrict = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtxtstate = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtunits = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtmaxunit = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jtxtcontectno = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtxtminunit = new javax.swing.JTextField();
        jbtnbillgenerate = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();
        jcmbcustomerid = new javax.swing.JComboBox();
        jtxtbilldate = new javax.swing.JFormattedTextField();
        jtxtbillfrom = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtbillid = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jtxtconnection = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setTitle("BILL GENERATE");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Information Form ::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(255, 255, 102))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bill Date :");

        jtxtbillto.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Father Name :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City :");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("District :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("State :");

        jtxtdistrict.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdistrictActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact NO. :");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date From :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date To :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Total Unit Used :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Max Unit :");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Customer Address :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Min Unit :");

        jbtnbillgenerate.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jbtnbillgenerate.setForeground(new java.awt.Color(0, 0, 255));
        jbtnbillgenerate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/15.png"))); // NOI18N
        jbtnbillgenerate.setText("GENERATE");
        jbtnbillgenerate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbillgenerateActionPerformed(evt);
            }
        });

        jbtnexit.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jbtnexit.setForeground(new java.awt.Color(0, 0, 255));
        jbtnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/16.png"))); // NOI18N
        jbtnexit.setText("EXIT");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        jcmbcustomerid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbcustomeridItemStateChanged(evt);
            }
        });

        jtxtbillfrom.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bill ID :");

        jtxtbillid.setEditable(false);
        jtxtbillid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtbillidActionPerformed(evt);
            }
        });

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("yyyy-MM-dd");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("yyyy-MM-dd");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Connection Type");

        jtxtconnection.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxtbillid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(60, 60, 60)
                                                .addComponent(jtxtbilldate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(jcmbcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtcontectno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxtbillfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel15))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jtxtbillto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jLabel17))
                                    .addComponent(jtxtunits, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtmaxunit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jtxtminunit, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jtxtconnection, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnbillgenerate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25)))
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbtnbillgenerate, jbtnexit});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel1))
                    .addComponent(jtxtbillid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxtbilldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jcmbcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtxtcustomername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtxtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14)
                    .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtxtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtxtdistrict, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jtxtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9)
                    .addComponent(jtxtcontectno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtbillfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel15)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jtxtbillto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel17)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12)
                    .addComponent(jtxtunits, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addComponent(jtxtmaxunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jtxtminunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jtxtconnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnbillgenerate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtnexit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Lucida Bright", 0, 18));
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Bill Generation Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(165, Short.MAX_VALUE)
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(143, 143, 143))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxtdistrictActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdistrictActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtxtdistrictActionPerformed

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnbillgenerateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbillgenerateActionPerformed
        // TODO add your handling code here:
        DataBaseConnect db = new DataBaseConnect();
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            con = db.dbConnect();
            stmt = con.createStatement();
            // String id=getConnectionId();
          //  JOptionPane.showMessageDialog(null, "customermaster select unitrate,maxunitrate from connectionrates where connectiontype='" + jtxtconnection.getText() + "'");
            rs = stmt.executeQuery(" select unitrate,maxunitrate from connectionrates where connectiontype='" + jtxtconnection.getText() + "'");
            double unitrate = 0;
            double maxunitrate = 0;
            while (rs.next()) {
                unitrate = rs.getDouble(1);
                maxunitrate = rs.getDouble(2);
            }
            rs.close();
            int i = stmt.executeUpdate("insert into bills(billid,customerid,datefrom,dateto,units,maxunit,minunit,maxcharge,mincharge,status,total) values ( '" + jtxtbillid.getText() + "','" + jcmbcustomerid.getSelectedItem().toString() + "','" + jtxtbillfrom.getText() + "','" + jtxtbillto.getText() + "','" + jtxtunits.getText() + "','" + jtxtmaxunit.getText() + "','" + jtxtminunit.getText() + "','" + Double.parseDouble(jtxtmaxunit.getText()) * maxunitrate + "','" + Double.parseDouble(jtxtmaxunit.getText()) * unitrate + "','0','"+(Double.parseDouble(jtxtmaxunit.getText()) * unitrate+Double.parseDouble(jtxtmaxunit.getText()) * maxunitrate )+"')");
            if (i == 0) {
                JOptionPane.showMessageDialog(null, "Data Not Saved");
                
            } else {
                JOptionPane.showMessageDialog(null, "Data Saved");
                 jtxtbillid.setText(getBillId());
            }
            stmt.close();
            con.close();
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, sql);

        }
    }//GEN-LAST:event_jbtnbillgenerateActionPerformed

    private void jcmbcustomeridItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbcustomeridItemStateChanged
        // TODO add your handling code here:
        DataBaseConnect db = new DataBaseConnect();
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            con = db.dbConnect();
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select name,fname,address1,city1,district1,state1,contectno,connectiontype from customermaster WHERE CUSTOMERID='" + jcmbcustomerid.getSelectedItem().toString() + "'");
            // int count=0;
            // while(rs.next())
            //   count++;
            while (rs.next()) {
                jtxtcustomername.setText(rs.getString(1));
                jtxtfname.setText(rs.getString(2));
                jtxtaddress.setText(rs.getString(3));
                jtxtcity.setText(rs.getString(4));
                jtxtdistrict.setText(rs.getString(5));
                jtxtstate.setText(rs.getString(6));
                jtxtcontectno.setText(rs.getString(7));
                jtxtconnection.setText(rs.getString(8));
            }
            rs.close();
            stmt.close();
            con.close();
            //return (Integer.toString(++count));
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, sql);
            // return "0";
        }

    }//GEN-LAST:event_jcmbcustomeridItemStateChanged

    private void jtxtbillidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtbillidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtbillidActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnbillgenerate;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JComboBox jcmbcustomerid;
    private javax.swing.JTextField jtxtaddress;
    private javax.swing.JFormattedTextField jtxtbilldate;
    private javax.swing.JFormattedTextField jtxtbillfrom;
    private javax.swing.JTextField jtxtbillid;
    private javax.swing.JFormattedTextField jtxtbillto;
    private javax.swing.JTextField jtxtcity;
    private javax.swing.JTextField jtxtconnection;
    private javax.swing.JTextField jtxtcontectno;
    private javax.swing.JTextField jtxtcustomername;
    private javax.swing.JTextField jtxtdistrict;
    private javax.swing.JTextField jtxtfname;
    private javax.swing.JTextField jtxtmaxunit;
    private javax.swing.JTextField jtxtminunit;
    private javax.swing.JTextField jtxtstate;
    private javax.swing.JTextField jtxtunits;
    // End of variables declaration//GEN-END:variables
private String getBillId() {
        DataBaseConnect db = new DataBaseConnect();
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            con = db.dbConnect();
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select * from bills");
            int count = 0;
            while (rs.next()) {
                count++;
                
            }
            rs.close();
            stmt.close();
            con.close();
            return (Integer.toString(++count));
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, sql);
            return "0";
        }
    }

    private void setCustomerId() {
        DataBaseConnect db = new DataBaseConnect();
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            con = db.dbConnect();
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select * from customermaster");
            // int count=0;
            // while(rs.next())
            //   count++;
            while (rs.next()) {
                jcmbcustomerid.addItem(rs.getString(1));
                
            }
            rs.close();
            stmt.close();
            con.close();
            //return (Integer.toString(++count));
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, sql);
            // return "0";
        }
    }
}
