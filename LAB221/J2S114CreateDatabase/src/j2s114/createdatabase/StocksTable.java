/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s114.createdatabase;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Luu Phuong Uyen
 */
public class StocksTable extends javax.swing.JFrame {

    DefaultTableModel dtm;
    HashSet hs;

    /**
     * Creates new form StocksTable
     */
    public StocksTable() {
        initComponents();
        dtm = new DefaultTableModel();
        hs = new HashSet();
    }

    public void createDB() {
        String sql = "if not exists (select 1 from sys.databases where name = N'FU_DB') create database FU_DB";
        try {
            DatabaseInfo db = new DatabaseInfo();
            Connection con = db.openConnection();
            Statement statement = con.createStatement();
            statement.executeUpdate(sql);
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void createTable() {
        String sql = "use[FU_DB];\n"
                + "if not exists (select * from sysobjects where name='Stocks' and xtype='U')\n"
                + "create table Stocks(\n"
                + "StockID int primary key,\n"
                + "StockName nvarchar(30),\n"
                + "[Address] nvarchar(45),\n"
                + "DateAvailable DATE,\n"
                + "Note nvarchar(45)\n"
                + ")";
        try {
            DatabaseInfo db = new DatabaseInfo();
            Connection con = db.openConnection();
            Statement statement = con.createStatement();
            statement.execute(sql);
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void insertData() {
        String sql = "use[FU_DB];\n"
                + "if not exists (select * from sysobjects where name='Stocks' and xtype='U')\n"
                + "BEGIN\n"
                + "INSERT dbo.Stocks(StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(1, N'Stock one', N'No1 - Wasington', GETDATE(), N'')\n"
                + "INSERT dbo.Stocks(StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(2, N'Stock two', N'372 Cave town', GETDATE(), N'')\n"
                + "INSERT dbo.Stocks(StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(3, N'Stock three', N'Nary angle - 890', GETDATE(), N'Store dangerous')\n"
                + "INSERT dbo.Stocks( StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(4, N'Stock four', N'Twin tower - 01', GETDATE(), N'')\n"
                + "INSERT dbo.Stocks(StockID, StockName, Address, DateAvailable, Note)\n"
                + "VALUES(5, N'Stock five', N'Victory anniversary', GETDATE(), N'')"
                + "\n end";
        try {
            DatabaseInfo db = new DatabaseInfo();
            Connection con = db.openConnection();
            Statement statement = con.createStatement();
            statement.execute(sql);
            statement.close();
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void displayData() {
        try {
            String sql = "use [FU_DB];\n"
                    + "SELECT * FROM dbo.Stocks";
            DatabaseInfo db = new DatabaseInfo();
            Connection con = db.openConnection();
            Statement statement = con.createStatement();
            statement.execute(sql);
            ResultSet rs = statement.getResultSet();
            Object[] title = {"StockID", "StockName", "Address", "DateAvailable", "Note"};
            dtm.setColumnIdentifiers(title);
            dtm.setRowCount(0);
            hs.clear();
            while (rs.next()) {
                Vector vector = new Vector();
                vector.add(rs.getString(1));
                hs.add(rs.getString(1));
                vector.add(rs.getString(2));
                vector.add(rs.getString(3));
                vector.add(rs.getString(4));
                vector.add(rs.getString(5));
                dtm.addRow(vector);
            }
            jTable1.setModel(dtm);
        } catch (Exception e) {
            e.printStackTrace();
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
        btnCreateDB = new javax.swing.JButton();
        btnCreateTB = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnDisplay = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(450, 350));
        setPreferredSize(new java.awt.Dimension(500, 350));

        jPanel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(15, 5, 15, 5));

        btnCreateDB.setText("Create DB");
        btnCreateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateDBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateDB);

        btnCreateTB.setText("Create table");
        btnCreateTB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateTBActionPerformed(evt);
            }
        });
        jPanel1.add(btnCreateTB);

        btnInsert.setText("Insert data");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });
        jPanel1.add(btnInsert);

        btnDisplay.setText("Display data");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        jPanel1.add(btnDisplay);

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel2.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCreateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateDBActionPerformed
        // TODO add your handling code here:
        createDB();
    }//GEN-LAST:event_btnCreateDBActionPerformed

    private void btnCreateTBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateTBActionPerformed
        // TODO add your handling code here:
        createTable();
    }//GEN-LAST:event_btnCreateTBActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        insertData();
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        displayData();
    }//GEN-LAST:event_btnDisplayActionPerformed

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
            java.util.logging.Logger.getLogger(StocksTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StocksTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StocksTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StocksTable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StocksTable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateDB;
    private javax.swing.JButton btnCreateTB;
    private javax.swing.JButton btnDisplay;
    private javax.swing.JButton btnInsert;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
