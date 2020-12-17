/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persondriver;

/**
 *
 * @author PC
 */
public class PersonDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student st1 = new Student("Software", 2000, 7000, "Conan", "DN");
        System.out.println(st1);
        st1.gotoWork();
        //st1.showGrade();
        Person[] perArr = new Person[3];
        perArr[0] = new Student("SE", 2000, 9, "AB", "DN");
        perArr[1] = new Staff("SE", 2001, "CD", "QB");
        perArr[2] = new Student("SE", 2000, 9, "EF", "QN");
        for (int i = 0; i < perArr.length; i++) {
            perArr[i].gotoWork();
        }
    }

}
