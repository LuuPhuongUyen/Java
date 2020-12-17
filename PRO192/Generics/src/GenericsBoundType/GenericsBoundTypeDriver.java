/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsBoundType;

/**
 *
 * @author PC
 */
public class GenericsBoundTypeDriver<T extends Number> {

    private T number;

    public GenericsBoundTypeDriver() {
    }

    public GenericsBoundTypeDriver(T number) {
        this.number = number;
    }

    public T getNumber() {
        return number;
    }

    public void setNumber(T number) {
        this.number = number;
    }

    double nghichDao() {
        return 1 / number.doubleValue();
    }

    double phanThapPhan() {
        return number.doubleValue() - number.intValue();
    }

    public static void main(String[] args) {
        GenericsBoundTypeDriver gl = new GenericsBoundTypeDriver();
        gl.setNumber(179.45);
        System.out.println((double) gl.nghichDao());
        System.out.printf("%.4f", gl.phanThapPhan());//(double)
    }
}
