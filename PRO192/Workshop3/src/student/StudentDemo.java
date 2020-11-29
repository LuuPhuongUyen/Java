package student;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author PC
 */
public class StudentDemo {

    public static void main(String[] args) {
        Date dob = new Date();
        Student st1 = new Student("John Smith", "123-45-678", dob, "123 Nguyen Van Linh street", "Computer Science", 3.8);
        st1.setBirthDate(1984, Calendar.OCTOBER, 07);
        st1.printAllAttributes();
    }
}
