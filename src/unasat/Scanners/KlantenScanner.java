package unasat.Scanners;

import unasat.App.Applicatie;
import unasat.Entity.Klanten;

import java.util.ArrayList;
import java.util.Scanner;

public class KlantenScanner {
    static Applicatie applicatie = new Applicatie();
    private static Scanner sc;
    public static ArrayList<Klanten> klantenList = new ArrayList<Klanten>();
    static Klanten k = new Klanten();

    public void Klantmenu() {

        System.out.println("1- Add Customer Details ");
        System.out.println("2- Display All Klanten");
        System.out.println("3-Go Back");
        System.out.println("0- Exit");

        int opt;
        sc = new Scanner(System.in);
        do {
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    insertKlanten();
                    break;

                case 2:
                    k.displayCustomers(klantenList);
                    System.out.println("");
                    System.out.println("1- Add Customer Details ");
                    System.out.println("2- Display All Klanten");
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

    private void insertKlanten() {
        sc = new Scanner(System.in);
        Klanten k = new Klanten();

        System.out.println("Enter Naam:");
        k.setNaam(sc.nextLine());

        System.out.println("Enter Verzekering:");
        k.setNaamVerzekering(sc.nextLine());

        System.out.println("Enter Verzekeringsnummer:");
        k.setVerzekeringsnummer(sc.nextInt());

        System.out.println("Enter Telefoonnummer:");
        k.setTelefoonNummer(sc.nextInt());

        System.out.println("Enter Sterkte Linker oog:");
        k.setOogmetingL(sc.nextDouble());

        System.out.println("Enter Sterkte Rechter oog:");
        k.setOogmetingR(sc.nextDouble());

        k.AddCustomerDetails(k);
        klantenList.add(k);

        Klantmenu();
    }
}

