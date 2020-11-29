/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JColorChooser;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class Draw extends javax.swing.JFrame {

    Graphics g = null;
    Point p1 = null;
    Point p2 = null;
    Color color = Color.BLACK;

    int left, top, height, width;

    Vector<Line> lines = new Vector<Line>();
    Vector<Ellipse> ellipses = new Vector<Ellipse>();
    Vector<Rectangle> rectangles = new Vector<Rectangle>();

    public Draw() {
        initComponents();
        this.setTitle("Luu Phuong Uyen");
        ButtonGroup br = new ButtonGroup();
        br.add(rbtFill);
        br.add(rbtDraw);
        rbtDraw.setSelected(true);
        g = this.pLines.getGraphics();
        this.rbtFill.setEnabled(false);

        Thread t = new Thread() {
            @Override
            public void run() {
                super.run();
                while (true) {
                    int index = Tabbed.getSelectedIndex();
                    switch (index) {
                        case 0:
                            g = pLines.getGraphics();

                            drawLines();
                            break;
                        case 1:
                            g = pEllipses.getGraphics();

                            drawEllipses();
                            break;
                        case 2:
                            g = pRectangles.getGraphics();

                            drawRectangles();
                            break;
                        default:
                            throw new AssertionError();
                    }

                }

            }
        };
        t.start();

    }

    public void drawLines() {
        Line tmp;
        g = pLines.getGraphics();
        for (int i = 0; i < lines.size(); i++) {
            Point p1 = lines.get(i).p1;
            Point p2 = lines.get(i).p2;
            Color color = lines.get(i).color;
            g.setColor(color);
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
        }

    }

    public void drawEllipses() {
        Ellipse tmp;
        g = pEllipses.getGraphics();
        for (int i = 0; i < ellipses.size(); i++) {
            int top = ellipses.get(i).top;
            int left = ellipses.get(i).left;
            int height = ellipses.get(i).height;
            int width = ellipses.get(i).width;
            Color color = ellipses.get(i).color;
            g.setColor(color);
            if (ellipses.get(i).fill) {

                g.fillOval(left, top, width, height);

            } else {
                g.drawOval(left, top, width, height);
            }

        }
    }

    public void drawRectangles() {
        Rectangle tmp;
        g = pRectangles.getGraphics();
        for (int i = 0; i < rectangles.size(); i++) {
            int top = rectangles.get(i).top;
            int left = rectangles.get(i).left;
            int height = rectangles.get(i).height;
            int width = rectangles.get(i).width;
            Color color = rectangles.get(i).color;
            g.setColor(color);
            if (rectangles.get(i).fill) {

                g.fillRect(left, top, width, height);

            } else {
                g.drawRect(left, top, width, height);
            }

        }
    }

    @Override
    public synchronized void paint(Graphics g) {
        super.paint(g);

        int index = this.Tabbed.getSelectedIndex();
        switch (index) {
            case 0:
                g = pLines.getGraphics();
                g.setColor(color);
                if (p1 != null) {
                    g.drawLine(p1.x, p1.y, p2.x, p2.y);
                }

                drawLines();
                break;
            case 1:
                g = pEllipses.getGraphics();
                g.setColor(color);
                if (p1 == null) {
                    break;
                }
                left = p1.x < p2.x ? p1.x : p2.x;
                top = p1.y < p2.y ? p1.y : p2.y;
                width = p1.x - p2.x;
                if (width < 0) {
                    width = -width;
                }
                height = p1.y - p2.y;
                if (height < 0) {
                    height = -height;
                }

                if (rbtDraw.isSelected()) {
                    g.drawOval(left, top, width, height);
                } else {
                    g.fillOval(left, top, width, height);
                }

                drawEllipses();
                break;
            case 2:
                g = pRectangles.getGraphics();
                g.setColor(color);
                if (p1 == null) {
                    break;
                }
                left = p1.x < p2.x ? p1.x : p2.x;
                top = p1.y < p2.y ? p1.y : p2.y;
                width = p1.x - p2.x;
                if (width < 0) {
                    width = -width;
                }
                height = p1.y - p2.y;
                if (height < 0) {
                    height = -height;
                }

                if (rbtDraw.isSelected()) {
                    g.drawRect(left, top, width, height);
                } else {
                    g.fillRect(left, top, width, height);
                }

                drawRectangles();
                break;
            default:
                throw new AssertionError();
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
        rbtDraw = new javax.swing.JRadioButton();
        rbtFill = new javax.swing.JRadioButton();
        Tabbed = new javax.swing.JTabbedPane();
        pLines = new javax.swing.JPanel();
        pEllipses = new javax.swing.JPanel();
        pRectangles = new javax.swing.JPanel();
        btnSeclectColor = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Draw with mouse");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        rbtDraw.setText("Draw Only");

        rbtFill.setText("Draw and Fill");

        Tabbed.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabbedMouseClicked(evt);
            }
        });
        Tabbed.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                TabbedFocusGained(evt);
            }
        });
        Tabbed.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TabbedKeyPressed(evt);
            }
        });

        pLines.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pLinesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pLinesMouseReleased(evt);
            }
        });
        pLines.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pLinesMouseDragged(evt);
            }
        });
        pLines.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pLinesFocusGained(evt);
            }
        });

        javax.swing.GroupLayout pLinesLayout = new javax.swing.GroupLayout(pLines);
        pLines.setLayout(pLinesLayout);
        pLinesLayout.setHorizontalGroup(
            pLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        pLinesLayout.setVerticalGroup(
            pLinesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        Tabbed.addTab("Lines", pLines);

        pEllipses.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pEllipsesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pEllipsesMouseReleased(evt);
            }
        });
        pEllipses.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pEllipsesMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout pEllipsesLayout = new javax.swing.GroupLayout(pEllipses);
        pEllipses.setLayout(pEllipsesLayout);
        pEllipsesLayout.setHorizontalGroup(
            pEllipsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        pEllipsesLayout.setVerticalGroup(
            pEllipsesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        Tabbed.addTab("Ellipses", pEllipses);

        pRectangles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pRectanglesMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                pRectanglesMouseReleased(evt);
            }
        });
        pRectangles.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                pRectanglesMouseDragged(evt);
            }
        });

        javax.swing.GroupLayout pRectanglesLayout = new javax.swing.GroupLayout(pRectangles);
        pRectangles.setLayout(pRectanglesLayout);
        pRectanglesLayout.setHorizontalGroup(
            pRectanglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        pRectanglesLayout.setVerticalGroup(
            pRectanglesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 309, Short.MAX_VALUE)
        );

        Tabbed.addTab("Rectangles", pRectangles);

        btnSeclectColor.setText("Select Color");
        btnSeclectColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeclectColorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addComponent(btnSeclectColor)
                .addGap(68, 68, 68)
                .addComponent(rbtDraw)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(rbtFill)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Tabbed)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(347, 347, 347))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtDraw)
                    .addComponent(rbtFill)
                    .addComponent(btnSeclectColor))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tabbed, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSeclectColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeclectColorActionPerformed
        color = JColorChooser.showDialog(this, "Choose a color", Color.BLACK);
        g.setColor(color);
        repaint();
    }//GEN-LAST:event_btnSeclectColorActionPerformed

    private void pLinesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pLinesMousePressed
        p1 = evt.getPoint();
        p2 = p1;
        //lines.add(new Line(p1, p2, color));
        repaint();
    }//GEN-LAST:event_pLinesMousePressed

    private void pLinesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pLinesMouseReleased
        p2 = evt.getPoint();
        //  lines.lastElement().p2 = p2;
        lines.add(new Line(p1, p2, color));
        p1 = p2 = null;

        repaint();

    }//GEN-LAST:event_pLinesMouseReleased

    private void pLinesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pLinesMouseDragged
        p2 = evt.getPoint();
        repaint();

    }//GEN-LAST:event_pLinesMouseDragged

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        repaint();
    }//GEN-LAST:event_formWindowGainedFocus

    private void TabbedKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabbedKeyPressed

    }//GEN-LAST:event_TabbedKeyPressed

    private void TabbedMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabbedMouseClicked
        int index = this.Tabbed.getSelectedIndex();
        switch (index) {
            case 0:
                g = pLines.getGraphics();
                this.rbtDraw.setSelected(true);
                this.rbtFill.setEnabled(false);
                repaint();
                break;
            case 1:
                g = pEllipses.getGraphics();
                this.rbtFill.setEnabled(true);
                repaint();
                break;
            case 2:
                g = pRectangles.getGraphics();
                this.rbtFill.setEnabled(true);
                repaint();
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_TabbedMouseClicked

    private void TabbedFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TabbedFocusGained

    }//GEN-LAST:event_TabbedFocusGained

    private void pLinesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pLinesFocusGained

    }//GEN-LAST:event_pLinesFocusGained

    private void pEllipsesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEllipsesMousePressed
        p1 = evt.getPoint();
        p2 = p1;
    }//GEN-LAST:event_pEllipsesMousePressed

    private void pEllipsesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEllipsesMouseDragged
        p2 = evt.getPoint();
        repaint();
    }//GEN-LAST:event_pEllipsesMouseDragged

    private void pEllipsesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pEllipsesMouseReleased
        p2 = evt.getPoint();

        if (rbtFill.isSelected()) {
            ellipses.add(new Ellipse(left, top, width, height, color, true));
        } else {
            ellipses.add(new Ellipse(left, top, width, height, color, false));
        }

        repaint();
        p1 = p2 = null;
    }//GEN-LAST:event_pEllipsesMouseReleased

    private void pRectanglesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRectanglesMousePressed
        p1 = evt.getPoint();
        p2 = p1;
    }//GEN-LAST:event_pRectanglesMousePressed

    private void pRectanglesMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRectanglesMouseDragged
        p2 = evt.getPoint();
        repaint();
    }//GEN-LAST:event_pRectanglesMouseDragged

    private void pRectanglesMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pRectanglesMouseReleased
        p2 = evt.getPoint();

        if (rbtFill.isSelected()) {
            rectangles.add(new Rectangle(left, top, width, height, color, true));
        } else {
            rectangles.add(new Rectangle(left, top, width, height, color, false));
        }

        repaint();
        p1 = p2 = null;
    }//GEN-LAST:event_pRectanglesMouseReleased

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
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Draw.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Draw().setVisible(true);

            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane Tabbed;
    private javax.swing.JButton btnSeclectColor;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pEllipses;
    private javax.swing.JPanel pLines;
    private javax.swing.JPanel pRectangles;
    private javax.swing.JRadioButton rbtDraw;
    private javax.swing.JRadioButton rbtFill;
    // End of variables declaration//GEN-END:variables
}
