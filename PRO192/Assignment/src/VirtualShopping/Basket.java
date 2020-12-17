/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualShopping;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Basket implements Serializable {

    private ArrayList<ShopItem> selectedItems = new ArrayList<ShopItem>();
    Book book = new Book();
    Software sw = new Software();

    public Basket() {
    }

    public double getTotal() {
        double total = 0;
        for (ShopItem selectedItem : selectedItems) {
            total = selectedItem.getiPrice() * selectedItem.getiQtt();
        }
        return total;
    }

    public double transFeeTotal() {
        double transFee = 0;
        transFee = book.transportingFee() + sw.transportingFee();
        return transFee;
    }

    public void printInvoice() {
        double totalWeight = 0;
        int totalCD = 0;
        if (selectedItems.isEmpty()) {
            System.err.println("Empty basket!");
            return;
        }
        for (ShopItem selectedItem : selectedItems) {
            if (selectedItem instanceof Book) {
                totalWeight += selectedItem.getWeight() * selectedItem.getiQtt();
            } else if (selectedItem instanceof Software) {
                totalCD += selectedItem.getNoCD() * selectedItem.getiQtt();
            }
        }
        book.setWeight(totalWeight);
        book.setiQtt(1);
        sw.setNoCD(totalCD);
        sw.setiQtt(1);
        System.out.println("Total Price: " + getTotal());
        System.out.println("Books total weight: " + book.getWeight());
        System.out.println("Software total CD: " + sw.getNoCD());
        System.out.println("Transporting Fee: " + transFeeTotal());
        System.out.println("Total fee: " + (getTotal() + transFeeTotal()));
    }

    public void display() {
        if (selectedItems.isEmpty()) {
            System.err.println("Empty basket!");
            return;
        }
        System.out.printf("%-5s %-10s %-15s %-7s %-9s %-5s\n", "ID", "Type", "Title", "Price", "Quantity", "Weight/CD");
        for (int i = 0; i < selectedItems.size(); i++) {
            selectedItems.get(i).printData();
        }
    }

    public void addItem(ShopItem items, int qtt) {
        int index = Validation.checkIdExist(selectedItems, items.getId());
        if (index != -1) {
            int newQtt = selectedItems.get(index).getiQtt() + qtt;
            selectedItems.get(index).setiQtt(newQtt);
        } else {
            selectedItems.add(items);
        }
    }

    public void removeBasket(Store st) {
        if (selectedItems.isEmpty()) {
            System.out.println("Empty basket!");
            return;
        }
        System.out.println("Enter id to remove: ");
        String id = Validation.checkInputString();
        int index = Validation.checkIdExist(selectedItems, id);
        if (index == -1) {
            System.err.println("Not found id");
            return;
        } else {
            System.err.println("Remove successfullly");
            selectedItems.remove(index);
        }
    }

    public ArrayList<ShopItem> getselectedItems() {
        return selectedItems;
    }

    public void setSelectedItems(ArrayList<ShopItem> selectedItems) {
        this.selectedItems = selectedItems;
    }

    public void saveAndLoad() {
        System.out.println("Save and load file.");
        try {
            Manager.WriteObjectFile(selectedItems);
            Manager.ReadObjectFile("Shop.dat");
        } catch (Exception ex) {
            System.out.println("" + ex);
        }
    }
}
