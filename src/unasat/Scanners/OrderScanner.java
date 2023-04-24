package unasat.Scanners;

import unasat.App.Applicatie;
import unasat.Entity.Order;

import java.util.*;

public class OrderScanner extends Order {
    static Applicatie applicatie = new Applicatie();
    private static Scanner sc;
    public Stack<Integer> OrderList = new Stack<>();
    static Order o = new Order();
    static int i = 670;

    public void Ordermenu() {
        System.out.println("1- Add Order ");
        System.out.println("2- Display All Orders");
        System.out.println("3- Go Back");
        System.out.println("0- Exit");

        int opt;
        sc = new Scanner(System.in);
        do {
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    insertOrder();
                    break;

                case 2:
                    o.displayOrders(OrderList);
                    System.out.println("");
                    System.out.println("1- Add Order ");
                    System.out.println("2- Display All Orders");
                    System.out.println("3- Go Back");
                    System.out.println("0- Exit");
                    break;

                case 3:
                    applicatie.FrontPage();
                    break;

                case 0:
                    System.exit(0);

                default: {

                }
            }
        } while (opt != 0);

    }

    private void insertOrder() {
        OrderList.add(o.bestelling(i).peek());
        i++;
        o.Orders();
    }
}

