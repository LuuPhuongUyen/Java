/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js57user;

import java.io.*;

/**
 *
 * @author PC
 */
public class UserManagement {

    Validation v = new Validation();

    public int menu() {
        System.out.println("1. Create a new account.");
        System.out.println("2. Login system.");
        System.out.println("3. Exit.");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 3);
        return choice;
    }

    public void createNewAccount() {
        if (!v.checkFileExist()) {
            return;
        }
        String username = v.checkInputName();
        String password = v.checkInputPassword();
        if (!v.checkUsernameExist(username)) {
            System.err.println("Username exist.");
            return;
        }
        addAccount(username, password);
    }

    public void login() {
        if (!v.checkFileExist()) {
            return;
        }
        String username = v.checkInputName();
        String password = v.checkInputPassword();
        if (!v.checkUsernameExist(username)) {
            if (!password.equalsIgnoreCase(passwordByUsername(username))) {
                System.err.println("Password incorrect.");
            }
            System.err.println("Login success.");
        }
    }

    public void addAccount(String username, String password) {
        File file = new File("D:/user.dat");
        try {
            FileWriter fileWriter = new FileWriter(file, true);
            fileWriter.write(username + ";" + password + "\n");
            fileWriter.close();
            System.err.println("Create successly.");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static String passwordByUsername(String username) {
        File file = new File("D:/user.dat");
        try {
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] account = line.split(";");
                if (username.equalsIgnoreCase(account[0])) {
                    return account[1];
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return null;
    }
}
