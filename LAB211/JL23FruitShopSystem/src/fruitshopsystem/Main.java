/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fruitshopsystem;

/**
 *
 * @author PC
 */
public class Main {

    public static void main(String[] args) {
        FruitShop fs = new FruitShop();
        Shopping s = new Shopping();
        OwnerManagement owner = new OwnerManagement(fs, s);
        Management m = new Management();

        fs.addFruit(new Fruit("F1", "Apple", 0.75, 100, "USA"));
        fs.addFruit(new Fruit("F2", "Banana", 1.2, 100, "Vietnam"));
        fs.addFruit(new Fruit("F3", "Mango", 1.4, 100, "Thailand"));
        fs.addFruit(new Fruit("F4", "Watermelon", 1.1, 100, "Philipines"));
        fs.addFruit(new Fruit("F5", "Orange", 2.2, 100, "Japan"));

        outer:
        while (true) {
            m.mainMenu();
            System.out.print("Your option: ");
            int option = Validation.checkInputIntLimit(1, 3);

            switch (option) {
                case 1:
                    while (true) {
                        m.ownerMenu();
                        System.out.print("Your option: ");
                        option = Validation.checkInputIntLimit(1, 4);

                        switch (option) {
                            case 1:
                                fs.viewFruitShop();
                                break;
                            case 2:
                                owner.createFruit();
                                break;
                            case 3:
                                owner.viewOrder();
                                break;
                            case 4:
                                continue outer;
                        }
                    }
                case 2:
                    Customer customer;
                    System.out.print("Enter name: ");
                    String name = Validation.checkInputString();
                    customer = new Customer(name, fs);
                    while (true) {
                        m.customerMenu();
                        System.out.print("Your option: ");
                        option = Validation.checkInputIntLimit(1, 3);

                        switch (option) {
                            case 1:
                                fs.viewFruitShop();
                                customer.buy();
                                break;
                            case 2:
                                customer.viewCart();
                                break;
                            case 3:
                                System.out.print("Do you want to checkout? ");
                                boolean answer = Validation.checkInputYN();
                                if (answer) {
                                    customer.viewCart();
                                    s.addOrders(customer);
                                    continue outer;
                                }
                        }
                    }
                case 3:
                    return;
            }
        }

    }
}
