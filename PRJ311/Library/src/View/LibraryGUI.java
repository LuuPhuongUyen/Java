/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import javax.swing.JOptionPane;
import model.*;

/**
 *
 * @author PC
 */
public class LibraryGUI extends javax.swing.JFrame {

    public static User curUser;
    private Book curBook;

    public void setUser(User s) {
        curUser = s;
    }

    public User getUser() {
        return curUser;
    }

    public void setBook(Book b) {
        curBook = b;
    }

    public Book getBook() {
        return curBook;
    }

    public void turnOnTask() {
        task.setVisible(true);
    }

    private void turnOffTask() {
        task.setVisible(false);
    }

    public void turnOnAdminTask() {
        admin.setVisible(true);
    }

    private void turnOffAdminTask() {
        admin.setVisible(false);
    }
    private LoginPane lp = new LoginPane();

    public LibraryGUI() {
        initComponents();
        this.setTitle("Luu Phuong Uyen");
        this.turnOffTask();
        this.turnOffAdminTask();
        jSplitPane1.setBottomComponent(lp);
        //this.setContentPane(lp);
        pack();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        system = new javax.swing.JMenu();
        login = new javax.swing.JMenuItem();
        changePass = new javax.swing.JMenuItem();
        register = new javax.swing.JMenuItem();
        update = new javax.swing.JMenuItem();
        logOut = new javax.swing.JMenuItem();
        task = new javax.swing.JMenu();
        order = new javax.swing.JMenuItem();
        myLogs = new javax.swing.JMenuItem();
        admin = new javax.swing.JMenu();
        updateUser = new javax.swing.JMenuItem();
        addBook = new javax.swing.JMenuItem();
        searchBook = new javax.swing.JMenuItem();
        viewLogs = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\PC\\Downloads\\LogoFPT.png")); // NOI18N
        jSplitPane1.setTopComponent(jLabel1);

        system.setText("System");
        system.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                systemActionPerformed(evt);
            }
        });

        login.setText("Login");
        login.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginActionPerformed(evt);
            }
        });
        system.add(login);

        changePass.setText("Change password");
        changePass.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                changePassActionPerformed(evt);
            }
        });
        system.add(changePass);

        register.setText("Register");
        register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerActionPerformed(evt);
            }
        });
        system.add(register);

        update.setText("Update info");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        system.add(update);

        logOut.setText("Log out");
        logOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logOutActionPerformed(evt);
            }
        });
        system.add(logOut);

        jMenuBar1.add(system);

        task.setText("Task");
        task.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                taskActionPerformed(evt);
            }
        });

        order.setText("Order book");
        order.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderActionPerformed(evt);
            }
        });
        task.add(order);

        myLogs.setText("My logLibs");
        myLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myLogsActionPerformed(evt);
            }
        });
        task.add(myLogs);

        jMenuBar1.add(task);

        admin.setText("Admin");

        updateUser.setText("Add/Update user");
        updateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateUserActionPerformed(evt);
            }
        });
        admin.add(updateUser);

        addBook.setText("Add new book");
        addBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBookActionPerformed(evt);
            }
        });
        admin.add(addBook);

        searchBook.setText("Search/Delete book");
        searchBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookActionPerformed(evt);
            }
        });
        admin.add(searchBook);

        viewLogs.setText("View logs");
        viewLogs.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewLogsActionPerformed(evt);
            }
        });
        admin.add(viewLogs);

        jMenuBar1.add(admin);

        jMenu3.setText("Help");
        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 662, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 693, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
        // TODO add your handling code here:
        LoginPane lp = new LoginPane();
        jSplitPane1.setBottomComponent(lp);
        pack();
    }//GEN-LAST:event_loginActionPerformed

    private void orderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderActionPerformed
        // TODO add your handling code here:
        SearchOrderPane sp = new SearchOrderPane();
        jSplitPane1.setBottomComponent(sp);
        pack();
    }//GEN-LAST:event_orderActionPerformed

    private void taskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_taskActionPerformed
        // TODO add your handling code here:
        if (getUser() == null) {
            JOptionPane.showMessageDialog(this, "Please login..");
        }
        Password lp = new Password(curUser);
        jSplitPane1.setBottomComponent(lp);
        pack();
    }//GEN-LAST:event_taskActionPerformed

    private void changePassActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_changePassActionPerformed
        // TODO add your handling code here:
        if (getUser() == null) {
            JOptionPane.showMessageDialog(this, "Please login..");
        } else {
            Password lp = new Password(curUser);
            jSplitPane1.setBottomComponent(lp);
        }
    }//GEN-LAST:event_changePassActionPerformed

    private void systemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_systemActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_systemActionPerformed

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
        // TODO add your handling code here:
        Register lp = new Register(curUser);
        jSplitPane1.setBottomComponent(lp);
        pack();
    }//GEN-LAST:event_registerActionPerformed

    private void logOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logOutActionPerformed
        // TODO add your handling code here:
        this.curUser = null;
        LoginPane lp = new LoginPane();
        jSplitPane1.setBottomComponent(lp);
        this.turnOffAdminTask();
        this.turnOffTask();
        pack();
    }//GEN-LAST:event_logOutActionPerformed

    private void addBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBookActionPerformed
        // TODO add your handling code here:
        AddNewBook ab = new AddNewBook(curBook);
        jSplitPane1.setBottomComponent(ab);
        pack();
    }//GEN-LAST:event_addBookActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        // TODO add your handling code here:
        if (getUser() == null) {
            JOptionPane.showMessageDialog(this, "Please login..");
        } else {
            UserUpdate up = new UserUpdate();
            jSplitPane1.setBottomComponent(up);
            pack();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void searchBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookActionPerformed
        // TODO add your handling code here:     
        SearchBook sb = new SearchBook();
        jSplitPane1.setBottomComponent(sb);
        pack();
    }//GEN-LAST:event_searchBookActionPerformed

    private void updateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateUserActionPerformed
        // TODO add your handling code here:
        AddUpdateUser rp = new AddUpdateUser();
        jSplitPane1.setBottomComponent(rp);
        pack();
    }//GEN-LAST:event_updateUserActionPerformed

    private void viewLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewLogsActionPerformed
        // TODO add your handling code here:
        ViewLogs v = new ViewLogs();
        jSplitPane1.setBottomComponent(v);
        pack();
    }//GEN-LAST:event_viewLogsActionPerformed

    private void myLogsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myLogsActionPerformed
        // TODO add your handling code here:
        UserLogs ul = new UserLogs();
        jSplitPane1.setBottomComponent(ul);
        pack();
    }//GEN-LAST:event_myLogsActionPerformed

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
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LibraryGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LibraryGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem addBook;
    private javax.swing.JMenu admin;
    private javax.swing.JMenuItem changePass;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JMenuItem logOut;
    private javax.swing.JMenuItem login;
    private javax.swing.JMenuItem myLogs;
    private javax.swing.JMenuItem order;
    private javax.swing.JMenuItem register;
    private javax.swing.JMenuItem searchBook;
    private javax.swing.JMenu system;
    private javax.swing.JMenu task;
    private javax.swing.JMenuItem update;
    private javax.swing.JMenuItem updateUser;
    private javax.swing.JMenuItem viewLogs;
    // End of variables declaration//GEN-END:variables

}