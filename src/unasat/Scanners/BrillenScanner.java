package unasat.Scanners;

import unasat.App.Applicatie;
import unasat.Entity.Brillen;
import unasat.App.Info;
import unasat.service.BrillenService;
import unasat.service.BrillenServiceImpl;

import java.util.ArrayList;
import java.util.Scanner;


public class BrillenScanner  {
     Applicatie applicatie = new Applicatie();
    public ArrayList<Brillen> brilList = new ArrayList<Brillen>();
    static BrillenService brillenService = new BrillenServiceImpl();

    Info info = new Info();
    String menuOptions = "1- Add New Bril\n" +
            "2- Display All Models\n" +
            "3- Price range\n" +
            "4- Go Back\n" +
            "0- Exit";



    public void Brilmenu() {


        int opt;
        Scanner sc = new Scanner(System.in);
        do {
            opt = sc.nextInt();
            switch (opt) {
                case 1 ->{ brillenService.insert(new Brillen());
                System.out.println(menuOptions);}
                case 2 -> {
                    brillenService.display(brilList);
                    System.out.println(menuOptions);
                }
                case 3 -> {
                    System.out.println("Min: " + brillenService.findMin(Info.prijsList));
                    System.out.println("Max: " + brillenService.findMax(Info.prijsList));
                }
                case 4 -> applicatie.FrontPage();
                case 0 -> System.exit(0);
                default -> {
                }
            }
        } while (true);
    }


}

