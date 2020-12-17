/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VirtualShopping;

/**
 *
 * @author PC
 */
public class VirtualShoppingDriver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws CloneNotSupportedException {
        // TODO code application logic here
        Store st = new Store();
        st.ls.add(new Book(1, "111", "Conan", 10.3, 10));
        st.ls.add(new Book(2, "222", "Doreamon", 1.2, 10));
        st.ls.add(new Software(7, "333", "My Tam", 7.8, 10));
        st.ls.add(new Book(3, "444", "Tom", 5.5, 10));
        st.ls.add(new Software(5, "555", "Snow", 6, 10));
        Shop sh = new Shop(st);
        outer:
        while (true) {
            int choice = Manager.menu();
            if (choice == 1) {
                while (true) {
                    int choiceA = Manager.menuAdmin();
                    switch (choiceA) {
                        case 1:
                            System.out.println("- Add Items");
                            st.addItems();
                            break;
                        case 2:
                            System.out.println("- Update Items");
                            st.updateItems();
                            break;
                        case 3:
                            System.out.println("- View Items");
                            st.displayListItems();
                            break;
                        case 4:
                            System.out.println("- Remove Items");
                            st.removeItems();
                            break;
                        case 5:
                            continue outer;
                    }

                }
            }
            if (choice == 2) {
                while (true) {
                    int choiceB = Manager.menuCustomer();
                    switch (choiceB) {
                        case 1:
                            System.out.println("- Add to Shopping Basket");
                            sh.shopping();
                            break;
                        case 2:
                            System.out.println("- Display the Shopping Basket");
                            sh.getCart().display();
                            break;
                        case 3:
                            System.out.println("- Remove Shopping Basket");
                            sh.getCart().removeBasket(st);
                            break;
                        case 4:
                            System.out.println("- Print invoice(Orders)");
                            sh.getCart().printInvoice();
                            break;
                        case 5:
                            System.out.println("- Save and load");
                            sh.getCart().saveAndLoad();
                            break;
                        case 6:
                            continue outer;
                    }
                }
            }
            if (choice == 3) {
                return;
            }
        }
    }
}
