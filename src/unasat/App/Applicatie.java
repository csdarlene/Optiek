package unasat.App;

import unasat.Scanners.BrillenScanner;
import unasat.Scanners.KlantenScanner;
import unasat.Scanners.OrderScanner;

import java.util.Scanner;

public class Applicatie {
    public static KlantenScanner ks = new KlantenScanner();
    public static BrillenScanner bs = new BrillenScanner();
    static OrderScanner os = new OrderScanner();
    static Info info = new Info();
    static Applicatie applicatie = new Applicatie();


    public static void main( String[] args ) throws Exception {
        info.inventory();
        info.klantenData();
        applicatie.FrontPage();
    }


    public void FrontPage() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Optiek DDS");
        System.out.println("Select \n1 Klanten\n2 Brillen\n3 Orders\n0 Quit");
        int option;
        Scanner sc = new Scanner(System.in);
        option = scanner.nextInt();
        switch (option) {
            case 1:
                ks.Klantmenu();

            case 2:
                bs.Brilmenu();

            case 3:
                os.Ordermenu();

            case 0:
                System.exit(0);

            default:
                System.out.println("Please enter a valid option");

        }
    }


}

