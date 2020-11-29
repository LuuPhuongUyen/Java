/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.Country;
import Model.CountryDB;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class NewCountry extends javax.swing.JPanel {

    public NewCountry() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        countryID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        countryName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        infected = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        dead = new javax.swing.JTextField();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("NEW INFECTED COUNTRY");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        btnNew.setText("Add");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 200));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("Country ID");
        jPanel2.add(jLabel7);

        countryID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryIDFocusLost(evt);
            }
        });
        countryID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                countryIDKeyTyped(evt);
            }
        });
        jPanel2.add(countryID);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Country Name");
        jPanel2.add(jLabel2);

        countryName.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                countryNameFocusLost(evt);
            }
        });
        countryName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                countryNameActionPerformed(evt);
            }
        });
        jPanel2.add(countryName);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Number of Infected Patient");
        jPanel2.add(jLabel3);

        infected.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                infectedFocusLost(evt);
            }
        });
        jPanel2.add(infected);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Number of Dead");
        jPanel2.add(jLabel4);
        jPanel2.add(dead);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        String cID = countryID.getText().trim();
        String cName = countryName.getText().trim();
        int in = Integer.parseInt(infected.getText());
        int de = Integer.parseInt(dead.getText());
        if (de > in) {
            JOptionPane.showMessageDialog(this, "Number of Dead < Number of Infected Patient");
        } else if (CountryDB.getCountry(cID) != null) {
            JOptionPane.showMessageDialog(this, "Country ID existed!");
        } else if (String.valueOf(cID).equals("") || String.valueOf(cName).equals("") || String.valueOf(infected).equals("")
                || String.valueOf(dead).equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all required fields!");
        } else {
            Country country = new Country(cID, cName, in, de);
            if (CountryDB.newCountry(country)) {
                JOptionPane.showMessageDialog(this, "New infected country added!");
            } else {
                JOptionPane.showMessageDialog(this, "Failed!");
            }
        }
    }//GEN-LAST:event_btnNewActionPerformed

    private void countryIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_countryIDKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_countryIDKeyTyped

    private void countryIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryIDFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_countryIDFocusLost

    private void infectedFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infectedFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_infectedFocusLost

    private void countryNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_countryNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_countryNameActionPerformed

    private void countryNameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_countryNameFocusLost
        // TODO add your handling code here:      
    }//GEN-LAST:event_countryNameFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNew;
    private javax.swing.JTextField countryID;
    private javax.swing.JTextField countryName;
    private javax.swing.JTextField dead;
    private javax.swing.JTextField infected;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}