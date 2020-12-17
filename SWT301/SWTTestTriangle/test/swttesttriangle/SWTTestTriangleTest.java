/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swttesttriangle;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author PC
 */
public class SWTTestTriangleTest {

    @Test
    public void testcase1() throws Exception {
        SWTTestTriangle t = new SWTTestTriangle(200, 1, 100);
        String expected = "NotATriangle";
        String actual = t.CheckTriangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase2() throws Exception {
        SWTTestTriangle t = new SWTTestTriangle(100, 100, 100);
        String expected = "Equilateral";
        String actual = t.CheckTriangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase3() throws Exception {
        SWTTestTriangle t = new SWTTestTriangle(100, 1, 100);
        String expected = "Isosceles";
        String actual = t.CheckTriangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase4() throws Exception {
        SWTTestTriangle t = new SWTTestTriangle(100, 2, 101);
        String expected = "Triangle";
        String actual = t.CheckTriangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase5() throws Exception {
        SWTTestTriangle t = new SWTTestTriangle(3, 4, 5);
        String expected = "RightTriangle";
        String actual = t.CheckTriangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase6() throws Exception {
        SWTTestTriangle t = new SWTTestTriangle(1, 1, 1.0 * Math.sqrt(2));
        String expected = "Right-Angled";
        String actual = t.CheckTriangle();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testcase7() throws Exception {
        SWTTestTriangle t = new SWTTestTriangle(1, 12, -10);
        String expected = "Invalid";
        String actual = t.CheckTriangle();
        Assert.assertEquals(expected, actual);
    }
}
