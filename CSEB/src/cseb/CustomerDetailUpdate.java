/*
 * CustomerDetailUpdate.java
 * Author: Alok Pal
 * Created on Oct 2015, 5:23:55 PM
 * Description: This module will allow users to update/delete/modify the details for any existing customers.
 */

package cseb;
import java.sql.*;
import javax.swing.JOptionPane;
public class CustomerDetailUpdate extends javax.swing.JInternalFrame {

    /** Creates new form CustomerDetailUpdate */
    public CustomerDetailUpdate() {
        initComponents();
        SetCustomerId();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtregdate = new javax.swing.JFormattedTextField();
        jLabel20 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jtxtname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtfname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jtxtdob = new javax.swing.JFormattedTextField();
        jLabel21 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jcmbgender = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jtxtaddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtcity = new javax.swing.JTextField();
        jtxtdist = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jtxtstate = new javax.swing.JTextField();
        jtxtcontectno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jtxtcity1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtxtdist1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtxtstate1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtxtaddress1 = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        jcmbconnection = new javax.swing.JComboBox();
        jcmbusertype = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        jtxtcustomerid = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setTitle("CUSTOMER INFORMATION UPDATE AND DELETE");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Information Form ::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 51))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Reg. Date :");

        jtxtregdate.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("yyyy-dd-MM");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Name :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Father Name :");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Date Of Birth :");

        jtxtdob.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("yyyy-dd-MM");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Gender :");

        jcmbgender.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "MALE", "FEMALE" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Customer Address :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("City :");

        jtxtdist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtdistActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("District :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("State :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact NO. :");

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Billing Addresss", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 51))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Billing Address :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("City :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("District :");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("State :");

        jtxtaddress1.setColumns(20);
        jtxtaddress1.setRows(5);
        jScrollPane1.setViewportView(jtxtaddress1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel10)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel11)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtcity1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtdist1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtstate1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jtxtcity1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtdist1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(jtxtstate1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Connection Type :");

        jcmbconnection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE PHASE", "DOUBLE PHASE", "TRIPLE PHASE" }));

        jcmbusertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMMERCIAL", "NON COMMERCIAL" }));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("User Type :");

        jtxtcustomerid.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jtxtcustomeridItemStateChanged(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 0, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/13.png"))); // NOI18N
        jButton2.setText("DELETE");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton1.setForeground(new java.awt.Color(0, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/11.png"))); // NOI18N
        jButton1.setText("UPDATE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jButton3.setForeground(new java.awt.Color(0, 0, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/16.png"))); // NOI18N
        jButton3.setText("EXIT");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jtxtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jtxtregdate, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(jLabel20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4)
                .addGap(10, 10, 10)
                .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel5)
                .addGap(10, 10, 10)
                .addComponent(jtxtfname, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel16)
                .addGap(10, 10, 10)
                .addComponent(jtxtdob, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel21))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(jLabel14)
                .addGap(10, 10, 10)
                .addComponent(jcmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel17)))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtxtcity, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtxtdist, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtxtstate, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtxtcontectno, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jcmbconnection, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabel18)
                .addGap(2, 2, 2)
                .addComponent(jcmbusertype, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jtxtcustomerid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jtxtregdate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel20)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtxtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jtxtfname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel16)
                    .addComponent(jtxtdob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel21)))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(jLabel14))
                    .addComponent(jcmbgender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel15)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel7)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel8)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel9)
                        .addGap(19, 19, 19)
                        .addComponent(jLabel17))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jtxtaddress, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5)
                        .addComponent(jtxtcity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtxtdist, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtxtstate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(10, 10, 10)
                        .addComponent(jtxtcontectno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jcmbconnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(jcmbusertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButton2)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jtxtdistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtdistActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jtxtdistActionPerformed

    private void jtxtcustomeridItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jtxtcustomeridItemStateChanged
        // TODO add your handling code here:
           DataBaseConnect db=new DataBaseConnect();
        Connection con;
        Statement stmt;
        ResultSet rs;
        try{
            con=db.dbConnect();
            stmt=con.createStatement();
            rs=stmt.executeQuery("Select address1,address2,city1,city2,contectno,district1,district2,dob,fname,name,regdate,state1,connectiontype,gender,usertype from customermaster where customerid='"+jtxtcustomerid.getSelectedItem().toString()+"'");
           // int count=0;
            while(rs.next())
            {
                jtxtaddress.setText(rs.getString(1));
                jtxtaddress1.setText(rs.getString(2));
                jtxtcity.setText(rs.getString(3));
                jtxtcity1.setText(rs.getString(4));
                jtxtcontectno.setText(rs.getString(5));
                jtxtdist.setText(rs.getString(6));
                jtxtdist1.setText(rs.getString(7));
                jtxtdob.setText(rs.getString(8));
                jtxtfname.setText(rs.getString(9));
                jtxtname.setText(rs.getString(10));
                jtxtregdate.setText(rs.getString(11));
                jtxtstate.setText(rs.getString(12));
               jtxtstate1.setText(rs.getString(12));
                jcmbconnection.setSelectedItem(rs.getString(13));
                jcmbgender.setSelectedItem(rs.getString(14));
                jcmbusertype.setSelectedItem(rs.getString(15));
            }
              
                //count++;
            rs.close();
            stmt.close();
            con.close();
            //return (Integer.toString(++count));
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql);
          //  return "0";
        }

    }//GEN-LAST:event_jtxtcustomeridItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          DataBaseConnect db=new DataBaseConnect();
        Connection con;
        Statement stmt;
        try{
            con=db.dbConnect();
            stmt=con.createStatement();
          //  JOptionPane.showMessageDialog(null,"update customermaster set name='"+jtxtname.getText()+"',fname='"+jtxtfname.getText()+"',dob='"+jtxtdob.getText()+"',gender='"+jcmbgender.getSelectedItem().toString()+"',address1='"+jtxtaddress.getText()+"',city1='"+jtxtcity.getText()+"',district1='"+jtxtdist.getText()+"',state1='"+jtxtstate.getText()+"',address2='"+jtxtaddress1.getText()+"',city2='"+jtxtcity1.getText()+"',district2='"+jtxtdist1.getText()+"',contectno='"+jtxtcontectno.getText()+"',connectiontype='"+jcmbconnection.getSelectedItem().toString()+"',usertype='"+jcmbusertype.getSelectedItem().toString()+"' where customerid='"+jtxtcustomerid.getSelectedItem().toString()+"')");
           int i= stmt.executeUpdate("update customermaster set name='"+jtxtname.getText()+"',fname='"+jtxtfname.getText()+"',dob='"+jtxtdob.getText()+"',gender='"+jcmbgender.getSelectedItem().toString()+"',address1='"+jtxtaddress.getText()+"',city1='"+jtxtcity.getText()+"',district1='"+jtxtdist.getText()+"',state1='"+jtxtstate.getText()+"',address2='"+jtxtaddress1.getText()+"',city2='"+jtxtcity1.getText()+"',district2='"+jtxtdist1.getText()+"',contectno='"+jtxtcontectno.getText()+"',connectiontype='"+jcmbconnection.getSelectedItem().toString()+"',usertype='"+jcmbusertype.getSelectedItem().toString()+"' where customerid='"+jtxtcustomerid.getSelectedItem().toString()+"'");
           if(i==0)
               JOptionPane.showMessageDialog(null,"Data Not Saved");
           else
               JOptionPane.showMessageDialog(null,"Data updated");
           stmt.close();
           con.close();
          // formClear();
         //  jtxtcustomerid.setText(getCustomerId());
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql);

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
             DataBaseConnect db=new DataBaseConnect();
        Connection con;
        Statement stmt;
        try{
            con=db.dbConnect();
            stmt=con.createStatement();
           int i= stmt.executeUpdate("Delete from customermaster  where customerid='"+jtxtcustomerid.getSelectedItem().toString()+"'");
           if(i==0)
               JOptionPane.showMessageDialog(null,"Data Not Saved");
           else
               JOptionPane.showMessageDialog(null,"Data Deleted");
           stmt.close();
           con.close();
          // formClear();
         //  jtxtcustomerid.setText(getCustomerId());
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql);

        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox jcmbconnection;
    private javax.swing.JComboBox jcmbgender;
    private javax.swing.JComboBox jcmbusertype;
    private javax.swing.JTextField jtxtaddress;
    private javax.swing.JTextArea jtxtaddress1;
    private javax.swing.JTextField jtxtcity;
    private javax.swing.JTextField jtxtcity1;
    private javax.swing.JTextField jtxtcontectno;
    private javax.swing.JComboBox jtxtcustomerid;
    private javax.swing.JTextField jtxtdist;
    private javax.swing.JTextField jtxtdist1;
    private javax.swing.JFormattedTextField jtxtdob;
    private javax.swing.JTextField jtxtfname;
    private javax.swing.JTextField jtxtname;
    private javax.swing.JFormattedTextField jtxtregdate;
    private javax.swing.JTextField jtxtstate;
    private javax.swing.JTextField jtxtstate1;
    // End of variables declaration//GEN-END:variables
 private void SetCustomerId() {
          DataBaseConnect db=new DataBaseConnect();
        Connection con;
        Statement stmt;
        ResultSet rs;
        try{
            con=db.dbConnect();
            stmt=con.createStatement();
            rs=stmt.executeQuery("Select * from customermaster");
           // int count=0;
            while(rs.next())
                jtxtcustomerid.addItem(rs.getString(1));
                //count++;
            rs.close();
            stmt.close();
            con.close();
            //return (Integer.toString(++count));
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql);
          //  return "0";
        }
    }
}
