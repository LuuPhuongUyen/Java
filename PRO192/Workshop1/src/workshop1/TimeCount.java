package workshop1;

import java.util.Scanner;

/**
 *
 * @author Luu Phuong Uyen SE1401
 */
public class TimeCount {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int hours, minutes;
        System.out.println("Enter seconds: ");
        int seconds = sc.nextInt();
        hours = seconds / 3600;
        minutes = (seconds % 3600) / 60;
        seconds = (seconds % 3600) % 60;
        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds ");
    }
}
