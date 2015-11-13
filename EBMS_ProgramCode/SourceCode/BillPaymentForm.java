/*
 * BillPaymentForm.java
 *
 * Created on Nov, 2015, 5:59:04 PM
 */

package cseb;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
/**
 *
 * @author AlokPal
 */
public class BillPaymentForm extends javax.swing.JInternalFrame {

    /** Creates new form BillPaymentForm */
    public BillPaymentForm() {
        initComponents();
         getBillId();
           Calendar currentDate = Calendar.getInstance();
  SimpleDateFormat formatter=   new SimpleDateFormat("yyyy-MM-dd");
  String dateNow = formatter.format(currentDate.getTime());
  jtxtbilldate.setText(dateNow);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jtxtbillto = new javax.swing.JFormattedTextField();
        jLabel4 = new javax.swing.JLabel();
        jtxtcustname = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jtxtbillamt = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtxtpaidamt = new javax.swing.JTextField();
        jbtnbillpaid = new javax.swing.JButton();
        jbtnexit = new javax.swing.JButton();
        jcmbbillno = new javax.swing.JComboBox();
        jtxtbilldate = new javax.swing.JFormattedTextField();
        jtxtbillfrom = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jtxtcustid = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(102, 102, 102));
        setClosable(true);
        setTitle("BILL PAYEMENT");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Customer Information Form ::", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 102))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Customer ID :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bill Date :");

        jtxtbillto.setEditable(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Customer Name :");

        jtxtcustname.setEditable(false);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Date From :");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Date To :");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bill Amount :");

        jtxtbillamt.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Paid Amount :");

        jtxtpaidamt.setEditable(false);

        jbtnbillpaid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jbtnbillpaid.setForeground(new java.awt.Color(51, 0, 255));
        jbtnbillpaid.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/15.png"))); // NOI18N
        jbtnbillpaid.setText("BILL PAID");
        jbtnbillpaid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbillpaidActionPerformed(evt);
            }
        });

        jbtnexit.setFont(new java.awt.Font("Times New Roman", 1, 14));
        jbtnexit.setForeground(new java.awt.Color(51, 0, 255));
        jbtnexit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cseb/images/16.png"))); // NOI18N
        jbtnexit.setText("CLOSE");
        jbtnexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnexitActionPerformed(evt);
            }
        });

        jcmbbillno.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcmbbillnoItemStateChanged(evt);
            }
        });

        jtxtbilldate.setEditable(false);

        jtxtbillfrom.setEditable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bill ID :");

        jtxtcustid.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel1)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel10))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtxtbillfrom, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtbillto, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtbillamt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtpaidamt, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jcmbbillno, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(60, 60, 60)
                                        .addComponent(jtxtbilldate, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jtxtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtxtcustname, javax.swing.GroupLayout.PREFERRED_SIZE, 290, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jbtnbillpaid)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbtnexit, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jcmbbillno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addComponent(jLabel3)
                    .addComponent(jtxtbilldate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jtxtcustid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtxtcustname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtbillfrom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtbillto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtbillamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxtpaidamt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnbillpaid)
                    .addComponent(jbtnexit))
                .addContainerGap())
        );

        jLabel19.setFont(new java.awt.Font("Lucida Bright", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Bill Payment Form");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(180, 180, 180)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnexitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jbtnexitActionPerformed

    private void jbtnbillpaidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbillpaidActionPerformed
        // TODO add your handling code here:
          DataBaseConnect db=new DataBaseConnect();
        Connection con;
        Statement stmt;
       
        try{
            con=db.dbConnect();
            stmt=con.createStatement();
           // String id=getConnectionId();
          
           int i= stmt.executeUpdate("insert into bills_pays values('"+jcmbbillno.getSelectedItem().toString()+"','"+jtxtcustid.getText()+"','"+jtxtbillfrom.getText()+"','"+jtxtbillto.getText()+"','"+jtxtbilldate.getText()+"',"+jtxtbillamt.getText()+")");
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
    }//GEN-LAST:event_jbtnbillpaidActionPerformed

    private void jcmbbillnoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcmbbillnoItemStateChanged
        // TODO add your handling code here:
            DataBaseConnect db=new DataBaseConnect();
        Connection con;
        Statement stmt;
       ResultSet rs;
        try{
            con=db.dbConnect();
            stmt=con.createStatement();
           // String id=getConnectionId();

           rs= stmt.executeQuery("SElect customerid,name from customermaster where customerid=(Select customerid from bills where billid='"+jcmbbillno.getSelectedItem().toString()+"') ");
          while(rs.next())
          {
              jtxtcustid.setText(rs.getString(1));
              jtxtcustname.setText(rs.getString(2));
          }
           rs.close();
           rs=stmt.executeQuery("Select datefrom,dateto,maxcharge+mincharge as total from bills where billid='"+jcmbbillno.getSelectedItem().toString()+"'");
            while(rs.next())
          {
              jtxtbillfrom.setText(rs.getString(1));
              jtxtbillto.setText(rs.getString(2));
              jtxtbillamt.setText(rs.getString(3));
              jtxtpaidamt.setText(rs.getString(3));
          }
           rs.close();
           stmt.close();
           con.close();
        }
        catch(SQLException sql)
        {
            JOptionPane.showMessageDialog(null,sql);

        }
    }//GEN-LAST:event_jcmbbillnoItemStateChanged

private void getBillId() {
        DataBaseConnect db = new DataBaseConnect();
        Connection con;
        Statement stmt;
        ResultSet rs;
        try {
            con = db.dbConnect();
            stmt = con.createStatement();
            rs = stmt.executeQuery("Select * from bills where status=0");
           // int count = 0;
            while (rs.next()) {
             //  count++;
                jcmbbillno.addItem(rs.getString(1));
            }
            rs.close();
            stmt.close();
            con.close();
           // return (Integer.toString(++count));
        } catch (SQLException sql) {
            JOptionPane.showMessageDialog(null, sql);
            //return "0";
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnbillpaid;
    private javax.swing.JButton jbtnexit;
    private javax.swing.JComboBox jcmbbillno;
    private javax.swing.JTextField jtxtbillamt;
    private javax.swing.JFormattedTextField jtxtbilldate;
    private javax.swing.JFormattedTextField jtxtbillfrom;
    private javax.swing.JFormattedTextField jtxtbillto;
    private javax.swing.JTextField jtxtcustid;
    private javax.swing.JTextField jtxtcustname;
    private javax.swing.JTextField jtxtpaidamt;
    // End of variables declaration//GEN-END:variables

}
