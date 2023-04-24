package unasat.Entity;

import unasat.App.Applicatie;

import java.text.SimpleDateFormat;
import java.util.*;

import static unasat.App.Applicatie.bs;
import static unasat.App.Applicatie.ks;

public class Order {
    public static int inp_quantity;
    public static String inp_merk;

    public static Stack<Integer> bonN = new Stack<>();

    public Order() {
    }

    public Stack<Integer> bestelling( int i ) {
        System.out.println("Plaats bestelling");

        bonN.add(i);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Merk :");
        inp_merk = sc.next().toLowerCase();
        Order o = new Order();
        for (Brillen b : bs.brilList) {
            if ((b.getMerk().equals(inp_merk))) {
                System.out.println("Merk:" + b.getMerk());
                System.out.println("Prijs:" + b.getPrijs());
                System.out.println("Kleur:" + b.getKleur());
                System.out.println("Modelnummer:" + b.getModelnummer());
                System.out.println("Quantity:" + b.getVoorraad());
                System.out.println("Customer willing to Buy the item? y");
                String ch = sc.next().toLowerCase();
                if (ch.equals("y")) {
                    System.out.print("Enter the Quantity you like to Buy:");
                    inp_quantity = sc.nextInt();
                    if (b.getVoorraad() >= inp_quantity) {
                        b.setVoorraad((b.getVoorraad()) - inp_quantity);
                    } else {
                        System.out.println("Number of Item not available.Out of Stock!!");
                    }
                }
                break;
            }

        }
        return bonN;
    }


    public void displayOrders( Stack<Integer> stack ) {

        if (stack.isEmpty()) {
            System.out.println("\n\n");
            System.out.println("Geen Bestellingen");
            return;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Bonnen");
        System.out.println("------------------------------------------------------------------------------------------------------");

        System.out.println(bonN);

        System.out.println("------------------------------------------------------------------------------------------------------");
        System.out.println("\n\n");
    }


    public static void Orders() {
        Order o = new Order();
        System.out.println("\t\t\t\t---------------------Invoice------------------");
        System.out.println("\t\t\t\t\t\t\t\t " + "  " + "Optiek DDS");
        System.out.println("\t\t\t\t\t\t\t\t Morgenstondlaan 15");
        System.out.println("\t\t\t\t\t\t\t\t" + "     " + "Noord");
        System.out.println("" + "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\tContact: (+597) 8988775");

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        String[] days = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.println(days[calendar.get(Calendar.DAY_OF_WEEK) - 1] + "\t\t\t\t\t\t ");
        System.out.println("Date: " + formatter.format(date) + "\t\t\t\t\t\t ");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Customer Name: ");
        String klant = scan.next().toLowerCase();
        for (Klanten k : ks.klantenList) {
            if ((k.getNaam().equals(klant))) {
                for (Brillen b : bs.brilList) {
                    if ((b.getMerk().equals(inp_merk))) {
                        System.out.println("\n\t\t\t\t\t\t\t\t\t\tTotal Amount ($)" + inp_quantity * b.getPrijs());
                        System.out.println("\n\t\t\t\t\t\t\t\t\t\t     Invoice Total ");
                        System.out.println("\t\t\t\t----------------Thank You for Shopping!!-----------------");
                        System.out.println("\t\t\t\t                     Visit Again");
                        System.out.println("");
                        Applicatie app = new Applicatie();
                        app.FrontPage();

                    }
                }
            }
        }

    }
}
