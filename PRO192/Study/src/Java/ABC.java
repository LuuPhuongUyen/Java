//package Java;
//
//public class ABC {
//public static void main(String[] args) {
//       //int a=1;
//       //String b = "Chao";
//       //System.out.println(b+a);
//        Animal Animal1 = new Animal();
//        System.out.println(Animal1.name);
//        System.out.println(Animal1.age);
//        Animal Animal2 = new Animal("Nhan",18);
//        System.out.println(Animal2.name);
//        Animal1.setName("Meo");
//        Animal2.hello();
//        Animal2.Info();
//        Bank bank =  new Bank();
//    }
//}
//class Animal{
//    String name;
//    int age;
//    Animal(){
//        name = "Dong vat";
//        age = 0;
//    }
//    Animal(String n, int a){
//        name = n;
//        age = a;
//    }
//    void hello(){
//        System.out.println(name + " hello");
//    }
//    void Info(){
//        System.out.println("Ten: "+ name + ", tuoi: "+ age);
//    }
//    public void setName(String n) {
//        name = n;
//}
//class Bank{
//private int budget = 100;
//Bank(){
//    System.out.println("");
//}
//}}

import java.util.Scanner;

public class ABC {

    public static void main(String[] args) {

    }
}

abstract class Animal {

    protected String name;
    protected int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Animal(String name) {
        this.name = name;
        this.age = 10;
    }

    Animal() {
        this.name = "Animal";
        this.age = 10;
    }

    void hello() {
        System.out.println("Toi la " + this.name + " chao cac ban.");
    }

    public void showInfo() {
        System.out.println("Ten: " + name + ", tuoi: " + age);
    }

    public String getName() {
        return name;
    }

    public void setName(String n) {
        name = n;
    }

    abstract public void abc();
}

class Dog extends Animal {

    private String chu;

    Dog(String chu) {
        super();
        this.chu = chu;
    }

    Dog(String name, int age, String chu) {
        this.name = name;
        this.age = age;
        this.chu = chu;

    }

    @Override
    public void hello() {
        System.out.println("Toi la " + this.name + " cua " + this.chu + " chao cac ban.");
    }

    @Override
    public void abc() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

abstract class Hinh {

    abstract double getSize();

    abstract double getArea();
}

class HCN extends Hinh {

    public double height;
    public double width;

    @Override
    double getSize() {
        return height * width;
    }

    @Override
    double getArea() {
        return 2 * (height + width);
    }

}

class HinhTron extends Hinh {

    public double radius;

    @Override
    double getSize() {
        return 3.14 * radius * radius;
    }

    @Override
    double getArea() {
        return 2 * 3.14 * radius;
    }

}
