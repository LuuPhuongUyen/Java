/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photoviewerws8;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author PC
 */
public class PhotoViewer extends javax.swing.JFrame {

    boolean autoSlide = false;
    int rate = 0;
    BufferedImage curImage = null;
    JFileChooser fc = new JFileChooser();
    Vector<String> list = new Vector<String>();
    int x = 10, y = 20;
    int imgIndex = -1;
    Graphics g = null;
    TimeThread timeCounter;
    ResourceBundle resource;

    public PhotoViewer() {
        initComponents();
        this.setTitle("Luu Phuong Uyen");
        this.setSize(1000, 600);
        resource = ResourceBundle.getBundle("View.Resources/Resources", new Locale("en", "US"));
        setUpGUI(resource);
        FileNameExtensionFilter filter = new FileNameExtensionFilter("Image File", "GIF", "JPG", "JPEG", "PNG");
        fc.setFileFilter(filter);
        fc.setMultiSelectionEnabled(true);
        g = lbView.getGraphics();
        sRate.setEnabled(false);
        sRate.setValue(1);
        pack();

    }

    private void loadImg() {
        int n = jList.getModel().getSize();
        if (n == 0) {
            lbView.setIcon(null);
            curImage = null;
        } else {
            String fName = list.elementAt(imgIndex);
            try {
                curImage = ImageIO.read(new File(fName));
            } catch (IOException ex) {
                curImage = null;
                JOptionPane.showMessageDialog(this, ex);
            }
        }
    }

    private void showImg() {
        if (curImage != null) {
            g.clearRect(x, y, lbView.getWidth() - x, lbView.getHeight() - y);
            int imgWidth = curImage.getWidth();
            int imgHeight = curImage.getHeight();
            double ratio = 1.0 * imgWidth / imgHeight;
            int areaWidth = lbView.getWidth() - 2 * x;
            int areaHeight = lbView.getHeight() - 2 * y;
            if (imgWidth <= areaWidth && imgHeight <= areaHeight) {
                areaWidth = imgWidth;
                areaHeight = imgHeight;
            } else if (imgWidth > imgHeight) {
                if (imgWidth < areaWidth) {
                    areaWidth = imgWidth;
                }
                areaHeight = (int) (areaWidth / ratio);
            } else {
                if (imgHeight < areaHeight) {
                    areaHeight = imgHeight;
                }
                areaWidth = (int) (areaHeight * ratio);
            }
            g.drawImage(curImage, x, y, areaWidth, areaHeight, lbView);
        }
    }

    class TimeThread extends Thread {

        public void run() {
            imgIndex = jList.getSelectedIndex();
            int n = jList.getModel().getSize();
            if (n > 0 && autoSlide) {
                while (imgIndex < n) {
                    try {
                        loadImg();
                        showImg();
                        imgIndex++;
                        sleep(1000 * rate);
                    } catch (InterruptedException ex) {
                        JOptionPane.showMessageDialog(null, ex);
                    }
                }
            }
        }
    }

    private void slidingImage() {
        timeCounter = new TimeThread();
        timeCounter.start();
    }

    private void setUpGUI(ResourceBundle rb) {
        btnAdd.setText(rb.getString("btnAdd"));
        lbFiles.setText(rb.getString("lbFiles"));
        btnRemove.setText(rb.getString("btnRemove"));
        btnClear.setText(rb.getString("btnClear"));
        lbOnOff.setText(rb.getString("lbOnOff"));
        TitledBorder con = BorderFactory.createTitledBorder(rb.getString("con"));
        pControl.setBorder(con);
        con.setTitlePosition(TitledBorder.TOP);
        con.setTitleJustification(TitledBorder.LEFT);
        con.setTitleColor(new Color(0, 51, 255));
        con.setTitleFont(new Font("Tahoma", Font.PLAIN, 13));
        TitledBorder view = BorderFactory.createTitledBorder(rb.getString("view"));
        lbView.setBorder(view);
        view.setTitlePosition(TitledBorder.TOP);
        view.setTitleJustification(TitledBorder.LEFT);
        view.setTitleColor(new Color(0, 51, 255));
        view.setTitleFont(new Font("Tahoma", Font.PLAIN, 13));
        TitledBorder slide = BorderFactory.createTitledBorder(rb.getString("slide"));
        pSliding.setBorder(slide);
        slide.setTitlePosition(TitledBorder.TOP);
        slide.setTitleJustification(TitledBorder.LEFT);
        slide.setTitleColor(new Color(0, 51, 255));
        slide.setTitleFont(new Font("Tahoma", Font.PLAIN, 13));
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
        pControl = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        lbFiles = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList = new javax.swing.JList(list);
        btnRemove = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        pSliding = new javax.swing.JPanel();
        lbOnOff = new javax.swing.JLabel();
        jCheck = new javax.swing.JCheckBox();
        sRate = new javax.swing.JSlider();
        chooseLg = new javax.swing.JComboBox<>();
        lbView = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 1, 1, 1));
        jSplitPane1.setDividerSize(2);
        jSplitPane1.setMinimumSize(new java.awt.Dimension(207, 102));
        jSplitPane1.setPreferredSize(new java.awt.Dimension(888, 782));

        pControl.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.BELOW_TOP), "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 51, 255))); // NOI18N
        pControl.setPreferredSize(new java.awt.Dimension(250, 630));
        pControl.setLayout(null);

        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        pControl.add(btnAdd);
        btnAdd.setBounds(50, 40, 150, 30);

        lbFiles.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pControl.add(lbFiles);
        lbFiles.setBounds(20, 100, 110, 20);

        jList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList);

        pControl.add(jScrollPane1);
        jScrollPane1.setBounds(10, 130, 230, 310);

        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });
        pControl.add(btnRemove);
        btnRemove.setBounds(30, 450, 80, 30);

        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });
        pControl.add(btnClear);
        btnClear.setBounds(130, 450, 90, 30);

        pSliding.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 51, 255))); // NOI18N
        pSliding.setLayout(null);

        lbOnOff.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        pSliding.add(lbOnOff);
        lbOnOff.setBounds(20, 30, 60, 20);

        jCheck.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCheckMouseClicked(evt);
            }
        });
        pSliding.add(jCheck);
        jCheck.setBounds(80, 25, 25, 30);

        sRate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                sRateMouseReleased(evt);
            }
        });
        pSliding.add(sRate);
        sRate.setBounds(20, 70, 190, 26);

        pControl.add(pSliding);
        pSliding.setBounds(10, 540, 230, 110);

        chooseLg.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Vietnamese" }));
        chooseLg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseLgActionPerformed(evt);
            }
        });
        pControl.add(chooseLg);
        chooseLg.setBounds(70, 690, 110, 30);

        jSplitPane1.setLeftComponent(pControl);

        lbView.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(0, 51, 255))); // NOI18N
        jSplitPane1.setRightComponent(lbView);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseLgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseLgActionPerformed
        // TODO add your handling code here:
        String lg = chooseLg.getSelectedItem().toString();
        if (lg.equalsIgnoreCase("Vietnamese")) {
            resource = ResourceBundle.getBundle("View.Resources/Resources", new Locale("vi", "VN"));
        }
        if (lg.equalsIgnoreCase("English")) {
            resource = ResourceBundle.getBundle("View.Resources/Resources", new Locale("en", "US"));
        }
        setUpGUI(resource);
    }//GEN-LAST:event_chooseLgActionPerformed

    private void sRateMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_sRateMouseReleased
        // TODO add your handling code here:
        rate = sRate.getValue();
    }//GEN-LAST:event_sRateMouseReleased

    private void jCheckMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCheckMouseClicked
        // TODO add your handling code here:
        if (jCheck.isSelected() && jList.getSelectedIndex() >= 0) {
            autoSlide = true;
            sRate.setEnabled(true);
            rate = sRate.getValue();
            slidingImage();
        } else {
            if (timeCounter != null) {
                timeCounter = null;
            }
            autoSlide = false;
            sRate.setEnabled(false);
        }
    }//GEN-LAST:event_jCheckMouseClicked

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        // TODO add your handling code here:
        String title = resource.getString("msgTitle");
        String er = resource.getString("error");
        int n = jList.getModel().getSize();
        if (n == 0) {
            JOptionPane.showMessageDialog(this, er, title, JOptionPane.INFORMATION_MESSAGE);
        } else {
            lbView.setIcon(null);
            list.removeAllElements();
            jList.updateUI();
            jCheck.setSelected(false);
            sRate.setEnabled(false);
        }
    }//GEN-LAST:event_btnClearActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        String title = resource.getString("msgTitle");
        String er = resource.getString("error");
        int n = jList.getModel().getSize();
        if (n == 0) {
            JOptionPane.showMessageDialog(this, er, title, JOptionPane.INFORMATION_MESSAGE);
        } else {
            list.remove(jList.getSelectedIndex());
            lbView.repaint();
            jList.updateUI();
        }
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void jListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jListMouseClicked
        // TODO add your handling code here:
        String title = resource.getString("msgTitle");
        String er = resource.getString("error");
        int n = jList.getModel().getSize();
        if (n == 0) {
            JOptionPane.showMessageDialog(this, er, title, JOptionPane.INFORMATION_MESSAGE);
        } else {
            imgIndex = jList.getSelectedIndex();
            loadImg();
            showImg();
        }
    }//GEN-LAST:event_jListMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File[] files = fc.getSelectedFiles();
            for (File f : files) {
                list.add(f.getAbsolutePath());
            }
            jList.setSelectedIndex(0);
            jList.updateUI();
            lbView.setIcon(new ImageIcon(Arrays.toString(files)));
            lbView.setHorizontalAlignment(JLabel.CENTER);
        }
    }//GEN-LAST:event_btnAddActionPerformed

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
            java.util.logging.Logger.getLogger(PhotoViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhotoViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhotoViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhotoViewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PhotoViewer(language, country).setVisible(true);
                new PhotoViewer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnRemove;
    private javax.swing.JComboBox<String> chooseLg;
    private javax.swing.JCheckBox jCheck;
    private javax.swing.JList<String> jList;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lbFiles;
    private javax.swing.JLabel lbOnOff;
    private javax.swing.JLabel lbView;
    private javax.swing.JPanel pControl;
    private javax.swing.JPanel pSliding;
    private javax.swing.JSlider sRate;
    // End of variables declaration//GEN-END:variables
}
