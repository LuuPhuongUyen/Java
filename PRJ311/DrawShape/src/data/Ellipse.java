/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Color;

/**
 *
 * @author PC
 */
public class Ellipse {
    public int left;
    public int top;
    public int width;
    public int height;
    public Color color;
    public boolean fill;

    public Ellipse(int left, int top, int width, int height, Color color, boolean fill) {
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
        this.color = color;
        this.fill = fill;
    }
}
