/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package js54contact;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class ContactManagement {

    Validation v = new Validation();

    public int menu() {
        System.out.println("========== CONTACT ==========");
        System.out.println("1. Add a contact.");
        System.out.println("2. Display all contact.");
        System.out.println("3. Delete a contact.");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = v.checkInputIntLimit(1, 4);
        return choice;
    }

    public void createContact(ArrayList<Contact> lc) {
        System.out.print("Enter id contact: ");
        int contactId = v.checkInputInt();
        System.out.print("Enter first name: ");
        String firstName = v.checkInputString();
        System.out.print("Enter last name: ");
        String lastName = v.checkInputString();
        System.out.print("Enter group: ");
        String group = v.checkInputString();
        System.out.print("Enter address: ");
        String address = v.checkInputString();
        System.out.print("Enter phone: ");
        String phone = v.checkInputPhone();
        lc.add(new Contact(contactId, firstName + lastName, group, address,
                phone, firstName, lastName));
        System.err.println("Add successfully!");
    }

    public void printAllContact(ArrayList<Contact> lc) {
        System.out.printf("%-5s%-25s%-20s%-20s%-20s%-20s%-20s\n", "Id", "Name",
                "First name", "Last name", "Group", "Address", "Phone");
        for (Contact contact : lc) {
            System.out.printf("%-5d%-25s%-20s%-20s%-20s%-20s%-20s\n",
                    contact.getContactId(), contact.getFullName(),
                    contact.getFirstName(), contact.getLastName(),
                    contact.getGroup(), contact.getAddress(), contact.getPhone());
        }
    }

    public void deleteContactd(ArrayList<Contact> lc) {
        System.out.print("Enter id: ");
        int idDelete = v.checkInputInt();
        Contact contactDelete = getContactById(lc, idDelete);
        if (contactDelete == null) {
            System.err.println("Not found contact.");
            return;
        } else {
            lc.remove(contactDelete);
        }
        System.err.println("Delete successful.");
    }

    public Contact getContactById(ArrayList<Contact> lc, int idDelete) {
        for (Contact contact : lc) {
            if (contact.getContactId() == idDelete) {
                return contact;
            }
        }
        return null;
    }
}
