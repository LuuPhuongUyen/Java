/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js59handlefiles;

import java.io.*;
import java.util.*;

/**
 *
 * @author PC
 */
public class TextFile {

    Validation vd = new Validation();

    public int menu() {
        System.out.println("========= File Processing ========");
        System.out.println(" 1. Find person info.             ");
        System.out.println(" 2. Copy Text to new file.        ");
        System.out.println(" 3. EXIT.                         ");
        System.out.print("Enter your choice: ");
        int choice = vd.checkInputIntLimit(1, 3);
        return choice;
    }

    public void findPersonInfo() {
        ArrayList<Person> lp = new ArrayList<>();
        if (lp == null) {
            return;
        }
        System.out.println("--------- Person info ---------");
        System.out.print("Enter Path: ");
        String pathFile = vd.checkInputPathFile();
        lp = getListPerson(pathFile);
        System.out.print("Enter Money: ");
        double money = vd.checkInputDouble();
        printPerson(lp, money);
    }

    public ArrayList<Person> getListPerson(String pathFile) {
        ArrayList<Person> lp = new ArrayList<>();
        File file = new File(pathFile);
        if (!file.exists() || !file.isFile()) {
            System.err.println("Path doesn't exist");
            return null;
        }
        try {
            FileReader fReader = new FileReader(file);
            BufferedReader bReader = new BufferedReader(fReader);
            String line;
            while ((line = bReader.readLine()) != null) {
                String[] infoPerson = line.split(";");
                lp.add(new Person(infoPerson[0], infoPerson[1],
                        getSalary(infoPerson[2])));
            }
        } catch (IOException e) {
            System.err.println("Can't read file.");
        }
        return lp;
    }

    public double getSalary(String salary) {
        double salaryResult = 0;
        try {
            salaryResult = Double.parseDouble(salary);
        } catch (NumberFormatException e) {
            salaryResult = 0;
        } finally {
            return salaryResult;
        }
    }

    public void printPerson(ArrayList<Person> lp, double money) {
        System.out.println("----------- Result -----------");
        System.out.printf("%-20s%-20s%-20s\n", "Name", "Address", "Money");
        for (Person person : lp) {
            if (person.getMoney() >= money) {
                System.out.printf("%-20s%-20s%-20.1f\n", person.getName(),
                        person.getAddress(), person.getMoney());
            }
        }
        Collections.sort(lp);
        System.out.println("\nMax: " + lp.get(0).getName());
        System.out.println("Min: " + lp.get(lp.size() - 1).getName());
    }

    public void coppyNewFile() {
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            File source = new File("test.txt");
            File newFile = new File("test2.txt");
            in = new FileInputStream(source);
            out = new FileOutputStream(newFile);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = in.read(buffer)) > 0) {
                out.write(buffer, 0, length);
            }
            in.close();
            out.close();
            System.out.println("Copy done...");
        } catch (IOException ex) {
        }
    }
}
