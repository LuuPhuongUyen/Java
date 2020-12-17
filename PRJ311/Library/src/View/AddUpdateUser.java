/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.*;
import model.User;
import model.UserDB;

/**
 *
 * @author PC
 */
public class AddUpdateUser extends javax.swing.JPanel {

    private User curUser;
    private UserDB ud;

    public AddUpdateUser() {
        initComponents();
        ButtonGroup bg = new ButtonGroup();
        bg.add(rdUser);
        bg.add(rdManager);
        bg.add(rdAdmin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        userID = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        fullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        password = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        cbStatus = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        uRight = new javax.swing.JPanel();
        rdUser = new javax.swing.JRadioButton();
        rdManager = new javax.swing.JRadioButton();
        rdAdmin = new javax.swing.JRadioButton();

        setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Update information for users");
        jLabel1.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 10));
        add(jLabel1, java.awt.BorderLayout.PAGE_START);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        jPanel1.add(btnAdd);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnUpdate);

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);

        add(jPanel1, java.awt.BorderLayout.PAGE_END);

        jPanel2.setBorder(javax.swing.BorderFactory.createEmptyBorder(10, 10, 10, 180));
        jPanel2.setLayout(new java.awt.GridLayout(0, 2, 10, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("UserID");
        jPanel2.add(jLabel7);

        userID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                userIDFocusLost(evt);
            }
        });
        userID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                userIDKeyTyped(evt);
            }
        });
        jPanel2.add(userID);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Fullname");
        jPanel2.add(jLabel2);

        fullname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                fullnameFocusLost(evt);
            }
        });
        fullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullnameActionPerformed(evt);
            }
        });
        jPanel2.add(fullname);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Email");
        jPanel2.add(jLabel3);

        email.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailFocusLost(evt);
            }
        });
        jPanel2.add(email);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Password");
        jPanel2.add(jLabel4);
        jPanel2.add(password);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Status");
        jPanel2.add(jLabel5);

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "BT", "LT", "KT", "SP" }));
        cbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbStatusActionPerformed(evt);
            }
        });
        jPanel2.add(cbStatus);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("User right");
        jPanel2.add(jLabel6);

        uRight.setBorder(javax.swing.BorderFactory.createEmptyBorder(4, 1, 1, 1));

        rdUser.setText("User ");
        uRight.add(rdUser);

        rdManager.setText("Manager");
        uRight.add(rdManager);

        rdAdmin.setText("Admin");
        uRight.add(rdAdmin);

        jPanel2.add(uRight);

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        String uID = userID.getText().trim();
        String fName = fullname.getText().trim();
        String e = email.getText().trim();
        String pw = new String(password.getPassword()).trim();
        String st = cbStatus.getSelectedItem().toString();
        int ur;
        if (rdUser.isSelected()) {
            ur = 1;
        } else if (rdManager.isSelected()) {
            ur = 2;
        } else {
            ur = 3;
        }
        if (UserDB.getUser(uID) == null) {
            JOptionPane.showMessageDialog(this, "UserID not found!");
        } else if (String.valueOf(fName).equals("") || String.valueOf(e).equals("")
                || String.valueOf(pw).equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all required fields!");
        } else {
            User user = new User(uID, fName, e, pw, st, ur);
            if (ud.updateUser(user)) {
                JOptionPane.showMessageDialog(this, "Update successfully!");
                LibraryGUI lg = ((LibraryGUI) (this.getParent().getParent().getParent().getParent().getParent()));
                ((LibraryGUI) (this.getParent().getParent().getParent().getParent().getParent())).turnOnTask();
            } else {
                JOptionPane.showMessageDialog(this, "Failed!");
            }
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void userIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_userIDFocusLost
        // TODO add your handling code here:
//        String uid = userID.getText();
//        if (!uid.matches("U[0-9][0-9][0-9][0-9]")) {
//            JOptionPane.showMessageDialog(this, "Wrong format of UserID!");
//            userID.setText("");
//            userID.requestFocus();
//        }
    }//GEN-LAST:event_userIDFocusLost

    private void userIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_userIDKeyTyped

    }//GEN-LAST:event_userIDKeyTyped

    private void fullnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fullnameFocusLost
        // TODO add your handling code here:
        String fname = fullname.getText();
        if (!fname.matches("^[a-zA-Z\\s]*$")) {
            JOptionPane.showMessageDialog(this, "Wrong name!");
            fullname.setText("");
            fullname.requestFocus();
        }
    }//GEN-LAST:event_fullnameFocusLost

    private void fullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fullnameActionPerformed

    private void emailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailFocusLost
        // TODO add your handling code here:
        String e = email.getText();
        if (!e.matches("\\w+([-+.']\\w+)*@\\w+([-.]\\w+)*\\.\\w+([-.]\\w+)*")) {
            JOptionPane.showMessageDialog(this, "Wrong format of email!");
            email.setText("");
            email.requestFocus();
        }
    }//GEN-LAST:event_emailFocusLost

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        String uID = userID.getText().trim();
        String fName = fullname.getText().trim();
        String e = email.getText().trim();
        String pw = new String(password.getPassword()).trim();
        String st = cbStatus.getSelectedItem().toString();
        int ur;
        if (rdUser.isSelected()) {
            ur = 1;
        } else if (rdManager.isSelected()) {
            ur = 2;
        } else {
            ur = 3;
        }
        if (UserDB.getUser(uID) != null) {
            JOptionPane.showMessageDialog(this, "UserID existed!");
        } else if (String.valueOf(uID).equals("") || String.valueOf(fName).equals("") || String.valueOf(e).equals("")
                || String.valueOf(pw).equals("") || String.valueOf(st).equals("") || String.valueOf(ur).equals("")) {
            JOptionPane.showMessageDialog(this, "Please enter all required fields!");
        } else if (!uID.matches("U[0-9][0-9][0-9][0-9]")) {
            JOptionPane.showMessageDialog(this, "Wrong format of UserID: U0000");
            userID.setText("");
            password.setText("");
        } else {
            User user = new User(uID, fName, e, pw, st, ur);
            if (ud.addNewUser(user)) {
                JOptionPane.showMessageDialog(this, "Add new user successfully!");
                LibraryGUI lg = ((LibraryGUI) (this.getParent().getParent().getParent().getParent().getParent()));
                lg.setUser(curUser);
                lg.turnOnTask();
            } else {
                JOptionPane.showMessageDialog(this, "Failed!");
            }
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userID.setText("");
        fullname.setText("");
        email.setText("");
        password.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbStatusActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JTextField email;
    private javax.swing.JTextField fullname;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField password;
    private javax.swing.JRadioButton rdAdmin;
    private javax.swing.JRadioButton rdManager;
    private javax.swing.JRadioButton rdUser;
    private javax.swing.JPanel uRight;
    private javax.swing.JTextField userID;
    // End of variables declaration//GEN-END:variables
}
