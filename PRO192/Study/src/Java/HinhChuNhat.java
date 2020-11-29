/*
Uyen
 */
package Java;

/**
 *
 * @author PC
 */
public class HinhChuNhat {

    private double height, width;

    HinhChuNhat(double height) {
        this.height = height;
    }

    HinhChuNhat(double height, double width) {
        this.height = height;
        this.width = width;
    }

    boolean isSquare() {
        if (height == width) //boolean isSquare = true;
        {
            return true;
        } else {
            return false;
        }
    }

    double getSize() {
        return (height + width) * 2;
    }

    double getArea() {
        return height * width;
    }

    String String() {
//        System.out.println("Height = " + height);
//        System.out.println("Width = " + width);
//        System.out.println(isSquare());
//        System.out.println("Perimeter = " + getSize());
//        System.out.println("Area = " + getArea());
        return "Height = " + height + " Width = " + width + isSquare() + " Perimeter = " + getSize() + " Area = " + getArea();
    }

    public static void main(String[] args) {
        HinhChuNhat h1 = new HinhChuNhat(7, 10);
        HinhChuNhat h2 = new HinhChuNhat(10, 10);
        System.out.println(h1.String());
        System.out.println(h2.String());
    }
}
