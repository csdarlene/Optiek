package unasat.App;

import unasat.Entity.Brillen;
import unasat.Entity.Klanten;
import unasat.Scanners.BrillenScanner;
import unasat.Scanners.KlantenScanner;

import java.util.ArrayList;
import java.util.List;

public class Info {
    static KlantenScanner ks = new KlantenScanner();
    static BrillenScanner bs = new BrillenScanner();
    public static List<Integer> prijsList = new ArrayList<>();

    public void klantenData() {
        Klanten klant1 = new Klanten("dwayne", -0.2, -0.3, 87654321, 212, "pzs");
        Klanten klant2 = new Klanten("shemar", -1.2, -0.5, 87654321, 567, "szf");
        Klanten klant3 = new Klanten("darlene", -2.5, -1.0, 87654321, 165, "pzs");
        klant1.AddCustomerDetails(klant1);
        ks.klantenList.add(klant1);

        klant2.AddCustomerDetails(klant2);
        ks.klantenList.add(klant2);

        klant3.AddCustomerDetails(klant3);
        ks.klantenList.add(klant3);
    }

    public void inventory() {
        Brillen bril1 = new Brillen(20, 123, 932.23, "wit", "nike");
        Brillen bril2 = new Brillen(2, 456, 500.03, "zwart", "chanel");
        Brillen bril3 = new Brillen(16, 168, 106.13, "bruin", "dior");


        bs.brilList.add(bril1);


        bs.brilList.add(bril2);


        bs.brilList.add(bril3);


        prijsList.add((int) bril1.getPrijs());
        prijsList.add((int) bril2.getPrijs());
        prijsList.add((int) bril3.getPrijs());

    }

}
