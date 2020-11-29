/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js57user;

/**
 *
 * @author LuuPhuongUyen SE1401
 */
public class JS57User {

    public static void main(String[] args) {
        UserManagement m = new UserManagement();
        while (true) {
            int choice = m.menu();
            switch (choice) {
                case 1:
                    m.createNewAccount();
                    break;
                case 2:
                    m.login();
                    break;
                case 3:
                    return;
            }
        }
    }
}
