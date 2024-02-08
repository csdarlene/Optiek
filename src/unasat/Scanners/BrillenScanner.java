package unasat.Scanners;

import unasat.App.Applicatie;
import unasat.Entity.Brillen;
import unasat.App.Info;
import unasat.service.Helper;

import java.util.ArrayList;
import java.util.Scanner;


public class BrillenScanner  {
     Applicatie applicatie = new Applicatie();
    public ArrayList<Brillen> brilList = new ArrayList<Brillen>();
    static Helper<Brillen> brillenService = (Helper<Brillen>) new Brillen();

    private Scanner sc;
    Info info = new Info();

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
                case 1 -> brillenService.insert(new Brillen());
                case 2 -> {
                    brillenService.display(brilList);
                    System.out.println(" ");
                    System.out.println("1- Add New Bril");
                    System.out.println("2- Display All Models ");
                    System.out.println("3- Price range ");
                    System.out.println("4- Go Back");
                    System.out.println("0- Exit");
                }
                case 3 -> {
                    System.out.println("Min: " + brillenService.findMin(info.prijsList));
                    System.out.println("Max: " + brillenService.findMax(info.prijsList));
                }
                case 4 -> applicatie.FrontPage();
                case 0 -> System.exit(0);
                default -> {
                }
            }
        } while (true);
    }


}

