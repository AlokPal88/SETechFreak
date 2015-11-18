
/*
 * BillPrinting.java
 * Author: Yeshwanth Akarapu
 * Created on Nov, 2015, 11:50:55 AM
 * Description: This module generates the printable pdf file of bill report.
 */

package cseb;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.io.InputStream;
import java.sql.*;
import java.util.HashMap;
import javax.swing.JOptionPane;

import net.sf.jasperreports.engine.JRExporterParameter;

import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

import net.sf.jasperreports.engine.export.JRXlsExporter;

import net.sf.jasperreports.swing.JRViewer;

public class BillPrinting extends javax.swing.JInternalFrame {
 private static JasperPrint jasperPrint;
    private JasperReport jasperReport;
    /** Creates new form BillPrinting */
    public BillPrinting() {
        initComponents();
           Toolkit tk = Toolkit.getDefaultToolkit();
    Dimension screenSize = tk.getScreenSize();
    this.setSize(screenSize);
          reportsPrint();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();

        setClosable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Bill Printing");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
 public void reportsPrint() {
        /* JasperPrint is the object contains
        report after result filling process */
      
// connection is the data source we used to fetch the data from
        Connection connection = establishConnection();
// jasperParameter is a Hashmap contains the parameters
// passed from application to the jrxml layout
        HashMap jasperParameter = new HashMap();
// JOptionPane.showMessageDialog(null,""+("scr/Reports/SalesReport.jrxml").toString());
        try {
// jrxml compiling process
//            InputStream input = this.getClass().getResourceAsStream("c://BillReport.jrxml");
//JasperDesign jasperDesign = JRXmlLoader.load(input);
//            jasperReport = JasperCompileManager.compileReport("c://BillReport.jrxml");

// filling report with data from data source

            jasperPrint = JasperFillManager.fillReport("c://BillReport.jasper", jasperParameter, connection);

// exporting process
// 1- export to PDF
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C://BillReport.pdf");

// 2- export to HTML
         //   JasperExportManager.exportReportToHtmlFile(jasperPrint, "sample_report.html");

// 3- export to Excel sheet
            JRXlsExporter exporter = new JRXlsExporter();
            exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperPrint);
          //  exporter.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, "C://simple_report.xls");

            //  exporter.exportReport();
            JRViewer jr = new JRViewer(jasperPrint);
//            this.add(jr);
         //  jScrollPane1.add(jr);
            jr.setOpaque(true);
            jr.setVisible(true);

            jScrollPane1.add(jr);
            jScrollPane1.setViewportView(jr);



        } catch (Exception exp) {

            JOptionPane.showMessageDialog(null,exp);
        }
    }

    public static Connection establishConnection() {
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cseb", "root", "root");
            /* JasperReport is the object
            that holds our compiled jrxml file */




        } catch (SQLException exception) {
            System.err.print(exception);
        } catch (ClassNotFoundException exception) {
            System.err.print(exception);
        }
        return connection;

    }
}
