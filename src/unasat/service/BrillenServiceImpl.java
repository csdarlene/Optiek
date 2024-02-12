package unasat.service;

import unasat.App.Info;
import unasat.Entity.Brillen;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BrillenServiceImpl implements BrillenService{
    Scanner sc;
    public ArrayList<Brillen> brilList = new ArrayList<Brillen>();

    public void insert(Brillen b) {
        sc = new Scanner(System.in);

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

        brilList.add(b);
        Info.prijsList.add((int) b.getPrijs());

    }

    @Override
    public void display(ArrayList<Brillen> arr) {
        if (arr.isEmpty()) {
            System.out.println("\n\n");
            System.out.println("No Items");
            return;
        }

        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nModel Nummer\t\t\tPrijs\t\t\tMerk\t\t\t\tKleur\t\t\tAantal\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");


        for (Brillen b : arr) {
            System.out.println(b.getModelnummer() + "\t\t\t\t\t\t" + b.getPrijs() + "\t\t\t" + b.getMerk() + "\t\t\t\t" + b.getKleur() + " \t\t\t" + b.getVoorraad());
        }

    }

    public Integer findMin(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MAX_VALUE;
        }

        List<Integer> sortedlist = new ArrayList<>(list);

        Collections.sort(sortedlist);
        return sortedlist.get(0);
    }

    public Integer findMax(List<Integer> list) {
        if (list == null || list.size() == 0) {
            return Integer.MIN_VALUE;
        }
        List<Integer> sortedlist = new ArrayList<>(list);
        Collections.sort(sortedlist);
        return sortedlist.get(sortedlist.size() - 1);
    }
}
