/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GenericsClass;

/**
 *
 * @author PC
 */
class GenericsClass<T> {

    private T obj;

    public GenericsClass() {
    }

    public GenericsClass(T obj) {
        this.obj = obj;
    }

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}

public class GenericsClassDriver {

    public static void main(String[] args) {
        GenericsClass<String> gl = new GenericsClass<>();
        gl.setObj("Apple");
        System.out.println(gl.getObj());
        Customer<String> c1 = new Customer();
        c1.setName("An");
        System.out.println(c1.getName());
        Customer<Integer> c2 = new Customer();
        c2.setAddress(123);
        System.out.println(c2.getAddress());
    }
}
