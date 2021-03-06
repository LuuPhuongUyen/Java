/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s118.createdatabase;

import static j2s118.createdatabase.DatabaseInfo.dbURL;
import static j2s118.createdatabase.DatabaseInfo.passDB;
import static j2s118.createdatabase.DatabaseInfo.userDB;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Luu Phuong Uyen
 */
public class Metadata extends javax.swing.JFrame {

    String catalog = null;
    String schema = null;
    String tableName = null;
    String[] types = null;
    ResultSet rs = null;
    String tbname = "";

    /**
     * Creates new form Metadata
     */
    public Metadata() {
        initComponents();
        display();
    }

    private void display() {
        try (Connection con = DriverManager.getConnection(dbURL, userDB, passDB);) {
            DatabaseMetaData dbmb = con.getMetaData();
            name.setText("" + dbmb.getDatabaseProductName());
            version.setText("" + dbmb.getDatabaseProductVersion());
            driver.setText("" + dbmb.getDriverVersion());
            rs = dbmb.getTables(catalog, schema, tableName, types);
            while (rs.next()) {
                String newtbname = rs.getString("TABLE_NAME");
                tbname = tbname.concat(newtbname)+" ";
            }
            table.setText(tbname);           
            con.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        version = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        driver = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        table = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(472, 300));
        setPreferredSize(new java.awt.Dimension(472, 300));

        jPanel1.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Display metadata");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 1, 10, 1));
        jPanel1.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 10, 1, 10));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Database product name:");
        jPanel2.add(jLabel3);

        name.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(name);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Database product version: ");
        jPanel2.add(jLabel2);

        version.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(version);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Database driver version:");
        jPanel2.add(jLabel4);

        driver.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(driver);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Listing tables in the database:");
        jPanel2.add(jLabel5);

        table.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(table);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Metadata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Metadata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Metadata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Metadata.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Metadata().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel driver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel name;
    private javax.swing.JLabel table;
    private javax.swing.JLabel version;
    // End of variables declaration//GEN-END:variables
}
