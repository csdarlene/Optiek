package unasat.Scanners;

import unasat.App.Applicatie;
import unasat.Entity.Brillen;
import unasat.App.Info;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BrillenScanner {
    static Applicatie applicatie = new Applicatie();
    private Scanner sc;
    Info info = new Info();
    public static ArrayList<Brillen> brilList = new ArrayList<Brillen>();
    static Brillen b = new Brillen();

    public void Brilmenu() {

        System.out.println("1- Add New Bril");
        System.out.println("2- Display All Models ");
        System.out.println("3- Price range ");
        System.out.println("4- Go Back");
        System.out.println("0- Exit");

        int opt;
        sc = new Scanner(System.in);
        do {
            opt = sc.nextInt();
            switch (opt) {
                case 1:
                    insertBrillen();
                    break;

                case 2:
                    b.displayBrillen(brilList);
                    System.out.println(" ");
                    System.out.println("1- Add New Bril");
                    System.out.println("2- Display All Models ");
                    System.out.println("3- Price range ");
                    System.out.println("4- Go Back");
                    System.out.println("0- Exit");
                    break;

                case 3:
                    System.out.println("Min: " + findMin(info.prijsList));
                    System.out.println("Max: " + findMax(info.prijsList));
                    break;

                case 4:
                    applicatie.FrontPage();
                    break;

                case 0:
                    System.exit(0);
                default:

                    break;
            }
        } while (opt != 0);
    }

    private void insertBrillen() {
        sc = new Scanner(System.in);
        Brillen b = new Brillen();
        System.out.println("Enter Merk");
        b.setMerk(sc.nextLine());

        System.out.println("Enter Kleur");
        b.setKleur(sc.nextLine());

        System.out.println("Enter Model Nummer");
        b.setModelnummer(sc.nextInt());

        System.out.println("Enter Prijs");
        b.setPrijs(sc.nextDouble());

        System.out.println("Enter Aantal");
        b.setVoorraad(sc.nextInt());

        b.addNewBril(b);
        brilList.add(b);
        info.prijsList.add((int) b.getPrijs());

        Brilmenu();
    }

    public Integer findMin( List<Integer> list ) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }

        List<Integer> sortedlist = new ArrayList<>(list);

        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }

    public Integer findMax( List<Integer> list ) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(sortedlist.size() - 1);
    }

}

