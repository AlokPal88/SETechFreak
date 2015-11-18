/*
 * RateSettingForm.java
 * Author: Karanveer Singh
 * Created on Oct, 2015, 5:31:31 PM
 * Description: This module will allow user to set up billing rates for customers based on their usage and connection types.
 */

package cseb;
import java.sql.*;
import javax.swing.JOptionPane;

public class RateSettingForm extends javax.swing.JInternalFrame {

    /** Creates new form RateSettingForm */
    public RateSettingForm() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jcmbconnection = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        jcmbusertype = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jtxtunitrate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtxtmaxunit = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jtxtmaxunitrate = new javax.swing.JTextField();
        jbtnsave = new javax.swing.JButton();
        jbtncancel = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setTitle("RATE SETTING");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Connection Type :");

        jcmbconnection.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SINGLE PHASE", "DOUBLE PHASE", "TRIPLE PHASE" }));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User Type :");

        jcmbusertype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "COMMERCIAL", "NON COMMERCIAL" }));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Unit Rate :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Max Unit :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Max Unit Rate :");

        jbtnsave.setBackground(new java.awt.Color(255, 255, 255));
        jbtnsave.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnsave.setForeground(new java.awt.Color(0, 0, 204));
        jbtnsave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/15.png"))); // NOI18N
        jbtnsave.setText("SAVE");
        jbtnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsaveActionPerformed(evt);
            }
        });

        jbtncancel.setBackground(new java.awt.Color(255, 255, 255));
        jbtncancel.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jbtncancel.setForeground(new java.awt.Color(0, 0, 204));
        jbtncancel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/16.png"))); // NOI18N
        jbtncancel.setText("CANCEL");
        jbtncancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtncancelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcmbconnection, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcmbusertype, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtunitrate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtmaxunit, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtmaxunitrate, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbtnsave, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtncancel)))
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel2))
                    .addComponent(jcmbconnection, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jcmbusertype, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtxtunitrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel5))
                    .addComponent(jtxtmaxunit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(jLabel6))
                    .addComponent(jtxtmaxunitrate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtncancel)
                    .addComponent(jbtnsave))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Rate Setting Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtncancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtncancelActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtncancelActionPerformed

    private void jbtnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsaveActionPerformed
        // TODO add your handling code here:
           DataBaseConnect db=new DataBaseConnect();
        Connection con;
        Statement stmt;
        try{
            con=db.dbConnect();
            stmt=con.createStatement();
            String id=getConnectionId();
           int i= stmt.executeUpdate("insert into connectionrates(connectionid,connectiontype,unitrate,maxunit,maxunitrate) values ( '"+id+"','"+jcmbconnection.getSelectedItem().toString()+"','"+jtxtunitrate.getText()+"','"+jtxtmaxunit.getText()+"','"+jtxtmaxunitrate.getText()+"')");
           if(i==0)
               JOptionPane.showMessageDialog(null,"Data Not Saved");
           else
               JOptionPane.showMessageDialog(null,"Data Saved");
           stmt.close();
           con.close();
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql);

        }
    }//GEN-LAST:event_jbtnsaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtncancel;
    private javax.swing.JButton jbtnsave;
    private javax.swing.JComboBox jcmbconnection;
    private javax.swing.JComboBox jcmbusertype;
    private javax.swing.JTextField jtxtmaxunit;
    private javax.swing.JTextField jtxtmaxunitrate;
    private javax.swing.JTextField jtxtunitrate;
    // End of variables declaration//GEN-END:variables

    private String getConnectionId() {
          DataBaseConnect db=new DataBaseConnect();
        Connection con;
        Statement stmt;
        ResultSet rs;
        try{
            con=db.dbConnect();
            stmt=con.createStatement();
            rs=stmt.executeQuery("Select * from connectionrates");
            int count=0;
            while(rs.next())
                count++;
            rs.close();
            stmt.close();
            con.close();
            return (Integer.toString(++count));
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql);
            return "0";
        }
    }

}
