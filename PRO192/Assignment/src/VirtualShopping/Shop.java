/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualShopping;

import java.util.ArrayList;

/**
 *
 * @author PC
 */
public class Shop {

    private Store st;
    private Basket cart = new Basket();

    public Shop() {
    }

    public Shop(Store st) {
        this.st = st;
    }

    public Store getSt() {
        return st;
    }

    public void setSt(Store st) {
        this.st = st;
    }

//    public void shopping() {
//        while (true) {
//            st.displayListItems();
//            System.out.println("Start shopping. Enter ID: ");
//            String id = Validation.checkInputString();
//            System.out.print("Enter quantity: ");
//            int iQtt = Validation.checkInputInteger();
//            for (ShopItem l : st.ls) {
//                if (l.getiQtt() > iQtt) {
//                    if (l.getId().equals(id)) {
//                        if (l instanceof Book) {
//                            Book bookT = new Book(((Book) l).getWeight(), l.getId(), l.getiName(), l.getiPrice(), iQtt);
//                            cart.addItems(l, iQtt);
//                            l.setiQtt(l.getiQtt() - iQtt);
//                        } else if (l instanceof Software) {
//                            Software softT = new Software(((Software) l).getNoCD(), l.getId(), l.getiName(), l.getiPrice(), iQtt);
//                            cart.addItems(l, iQtt);
//                            l.setiQtt(l.getiQtt() - iQtt);
//                        }
//
//                    }
//                }
//            }
//            System.out.println("Add item successfully.");
//            System.out.println("Continue? Y/N");
//            if (!Validation.checkInputYN()) {
//                return;
//            }
//        }
//    }
    public void shopping() throws CloneNotSupportedException {
        st.displayListItems();
        while (true) {
            System.out.print("Enter ID: ");
            String selectedID = Validation.checkInputString();
            int index = Validation.checkIdExist(st.ls, selectedID);
            if (index == -1) {
                System.err.println("Item Not Found!");
                return;
            }
            ShopItem selectedItem = (ShopItem) st.ls.get(index).clone();
            System.out.print("Enter Quantity: ");
            int selectedQuantity = Validation.checkInputInteger();
            int remain = st.ls.get(index).getiQtt() - selectedQuantity;
            if (remain < 0) {
                System.err.println("Not Enough Item!");
            } else {
                selectedItem.setiQtt(selectedQuantity);
                st.ls.get(index).setiQtt(remain);
                cart.addItem(selectedItem, selectedQuantity);
            }
            System.out.println("Add item successfully.");
            System.out.println("Continue? Y/N");
            if (!Validation.checkInputYN()) {
                return;
            }
        }
    }

    public Basket getCart() {
        return cart;
    }

    public void setCart(Basket cart) {
        this.cart = cart;
    }

    public ArrayList<ShopItem> getCartSelectedItems() {
        return cart.getselectedItems();
    }
}
