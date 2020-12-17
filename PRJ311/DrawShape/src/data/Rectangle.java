/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.awt.Color;

/**
 *
 * @author huynh
 */
public class Rectangle {

public int left;
public int top;
public int width;
public int height;
public Color color;
public boolean fill;

public Rectangle(int left, int top, int width, int height, Color color, boolean fill) {
    this.left = left;
    this.top = top;
    this.width = width;
    this.height = height;
    this.color = color;
    this.fill = fill;
}
}
