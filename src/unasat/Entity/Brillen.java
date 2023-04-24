package unasat.Entity;

import java.util.ArrayList;

public class Brillen {
    private int modelnummer;
    private double prijs;
    private String merk;
    private String kleur;
    private int voorraad;

    public Brillen() {
    }

    public Brillen( int voorraad, int modelnummer, double prijs, String kleur, String merk ) {
        this.modelnummer = modelnummer;
        this.prijs = prijs;
        this.merk = merk;
        this.kleur = kleur;
        this.voorraad = voorraad;
    }

    public int getModelnummer() {
        return modelnummer;
    }

    public void setModelnummer( int modelnummer ) {
        this.modelnummer = modelnummer;
    }

    public double getPrijs() {
        return prijs;
    }

    public void setPrijs( double prijs ) {
        this.prijs = prijs;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk( String merk ) {
        this.merk = merk;
    }


    public String getKleur() {
        return kleur;
    }

    public void setKleur( String kleur ) {
        this.kleur = kleur;
    }


    public int getVoorraad() {
        return voorraad;
    }

    public void setVoorraad( int voorraad ) {
        this.voorraad = voorraad;
    }


    @Override
    public String toString() {
        return "\nBrillen{" +
                "model nummer=" + modelnummer +
                "merk=" + merk +
                ", prijs='" + prijs + '\'' +
                ", kleur='" + kleur + '\'' +
                "aantal=" + voorraad + '\'' +
                '}' + "\n";
    }

    public void addNewBril( Brillen b ) {
        this.modelnummer = modelnummer;
        this.prijs = prijs;
        this.merk = merk;
        this.kleur = kleur;
        this.voorraad = voorraad;
    }

    public void displayBrillen( ArrayList<Brillen> arr ) {

        if (arr.isEmpty()) {
            System.out.println("\n\n");
            System.out.println("No Items");
            return;
        }

        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------");
        System.out.print("\nModel Nummer\t\t\tPrijs\t\t\tMerk\t\t\t\tKleur\t\t\tAantal\n");
        System.out.format("-----------------------------------------------------------------------------------------------------------------------------------\n");


        for (Brillen b : arr) {
            System.out.println(b.modelnummer + "\t\t\t\t\t\t" + b.prijs + "\t\t\t" + b.merk + "\t\t\t\t" + b.kleur + " \t\t\t" + b.voorraad);
        }
    }
}