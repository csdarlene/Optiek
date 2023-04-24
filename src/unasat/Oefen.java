package unasat;

import unasat.Entity.Brillen;

import java.util.*;


public class Oefen {

    public static void main( String[] args ) throws Exception {
        Brillen bril1 = new Brillen(20, 123, 932.63, "wit", "nike");
        Brillen bril2 = new Brillen(16, 456, 306.13, "bruin", "dior");
        Brillen bril3 = new Brillen(212, 903, 402.95, "wit", "nike");
        Brillen bril4 = new Brillen(544, 306, 780.53, "blauw", "chanel");


        ArrayList<String> merk = new ArrayList<>();
        merk.add(bril1.getMerk());
        merk.add(bril2.getMerk());
        merk.add(bril3.getMerk());
        merk.add(bril4.getMerk());

        ArrayList<Integer> voorraad = new ArrayList<>();
        voorraad.add(bril1.getVoorraad());
        voorraad.add(bril2.getVoorraad());
        voorraad.add(bril3.getVoorraad());
        voorraad.add(bril4.getVoorraad());

        List<Double> prijs = new ArrayList<>();
        prijs.add(bril1.getPrijs());
        prijs.add(bril2.getPrijs());
        prijs.add(bril3.getPrijs());
        prijs.add(bril4.getPrijs());

        ArrayList<Integer> modelnum = new ArrayList<>();
        modelnum.add(bril1.getModelnummer());
        modelnum.add(bril2.getModelnummer());
        modelnum.add(bril3.getModelnummer());
        modelnum.add(bril4.getModelnummer());

      System.out.println("Merk: "+ merk);
        System.out.println("Voorraad: "+voorraad);
        System.out.println("ModelNum: "+modelnum);
        System.out.println("");

        System.out.println("Prijs: "+ prijs);
        Collections.sort(prijs);
        System.out.println("Sorted ArrayList: " + prijs);

        System.out.println("");
        boolean value = Collections.disjoint(voorraad, modelnum);
        System.out.println("Two lists are disjoint: " + value);

        boolean value1 = Collections.disjoint(prijs, voorraad);
        System.out.println("Two lists are disjoint: " + value1);
        System.out.println("");

        int count = Collections.frequency(merk, "nike");
        System.out.println("Count of nike: " + count);
        System.out.println("");

        int pos = Collections.binarySearch(merk, "nike");
        System.out.println("The position of nike is "+pos );


    }
}






