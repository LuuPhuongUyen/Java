/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction;

/**
 *
 * @author PC
 */
public class HonSo extends Fraction {

    private int pNguyen;

    public HonSo() {
    }

    public HonSo(int pNguyen, int a, int b) {
        super(a, b);
        this.pNguyen = pNguyen;
    }

    public HonSo(Fraction f, int p) {
        super(f);
        this.pNguyen = p;
    }

    @Override
    public String toString() {
        return pNguyen + "(" + super.toString() + ")";
    }

}
