/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j2s120edittreenodeusingcombobox;

import java.awt.BorderLayout;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTree;
import javax.swing.tree.DefaultTreeCellEditor;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeCellEditor;

/**
 *
 * @author Luu Phuong Uyen
 */
public class ComboTree {
     public static void main(String args[]) {
    JFrame frame = new JFrame("Editable Tree");
    JTree tree = new JTree();
    tree.setEditable(true);
    DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree
        .getCellRenderer();
    String elements[] = { "Swing", "Java", "neat", "funky","life","awesome","cool!" };
    JComboBox comboBox = new JComboBox(elements);
    comboBox.setEditable(true);
    TreeCellEditor comboEditor = new DefaultCellEditor(comboBox);
    TreeCellEditor editor = new DefaultTreeCellEditor(tree, renderer,
        comboEditor);
    tree.setCellEditor(editor);
    JScrollPane scrollPane = new JScrollPane(tree);
    frame.getContentPane().add(scrollPane, BorderLayout.CENTER);
    frame.setSize(300, 150);
    frame.setVisible(true);
  }  
}
