/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swttesttriangle;

/**
 *
 * @author PC
 */
public class SWTTestTriangle {

    private double a;
    private double b;
    private double c;

    public SWTTestTriangle(double a, double b, double c) throws Exception {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new Exception("Invalid!");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String CheckTriangle() {
        if (a + b <= c || b + c <= a || a + c <= b || a < 0 || b < 0 || c < 0) {
            return "NotATriangle"; //Khong la tam giac
        } else {
            if ((a * a + b * b == c * c) || (b * b + c * c == a * a) || (a * a + c * c == b * b)) {
                return "RightTriangle"; //Tam giac vuong
            } else if ((a == b) && (b == c)) {
                return "Equilateral"; //Tam giac deu
            } else if ((a == b) || (b == c) || (c == a)) {
                if ((a * a + b * b == Math.round(c*c)) || (b * b + c * c == Math.round(a*a)) || (a * a + c * c == Math.round(b * b))) {
                    return "Right-Angled"; //Tam giac vuong can
                } else {
                    return "Isosceles"; //Tam giac can
                }
            } else if ((a != b) || (b != c)) {
                System.out.println("Triangle");
            }
        }
        return "Triangle";
    }
}
