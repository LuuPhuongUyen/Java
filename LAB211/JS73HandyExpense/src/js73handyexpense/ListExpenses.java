/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js73handyexpense;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ListExpenses {

    private ArrayList<Expenses> le = new ArrayList<>();
    private int id = 1;
    Validation v = new Validation();

    public void addExpense() {
        System.out.print("Enter Date: ");
        String date = v.checkInputDate();
        System.out.print("Enter Amount: ");
        double amount = v.checkInputDouble();
        System.out.print("Enter Content: ");
        String content = v.checkString();
        le.add(new Expenses(id, date, amount, content));
        id++;
    }

    public void print() {
        if (le.isEmpty()) {
            System.err.println("List Expenses empty");
            return;
        }
        double total = 0;
        System.out.printf("%-7s%-20s%-20s%-20s\n", "ID", "Date", "Amount of money", "Content");
        for (int i = 0; i < le.size(); i++) {
            System.out.printf("%-7d%-20s%-20.0f%-20s\n", le.get(i).getId(), le.get(i).getDate(),
                    le.get(i).getAmount(), le.get(i).getContent());
            total += le.get(i).getAmount();
        }
        System.out.printf("Total: %-20.0f\n", total);
    }

    private int checkIdExist(int id_Search) {
        for (int i = 0; i < le.size(); i++) {
            if (le.get(i).getId() == id_Search) {
                return i;
            }
        }
        return -1;
    }

    public void deleteExpense() {
        System.out.print("Enter id: ");
        int id_Search = v.checkInputInt();
        int checkIdExist = checkIdExist(id_Search);
        if (checkIdExist != -1) {
            le.remove(checkIdExist);
            System.out.println("Delete an expense successful");
            for (int i = id_Search - 1; i < le.size(); i++) {
                le.get(i).setId(le.get(i).getId() - 1);
            }
        } else {
            System.err.println("Delete an expense fail");
        }
        id--;
    }
}
