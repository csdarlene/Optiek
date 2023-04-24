package unasat.Entity;

import java.util.ArrayList;

public class Klanten {

    private String naam;
    private int telefoonNummer;
    private double oogmetingR;
    private double oogmetingL;
    private int verzekeringsnummer;
    private String naamVerzekering;

    public Klanten( String naam, double oogmetingL, double oogmetingR, int telefoonNummer, int verzekeringsnummer, String naamVerzekering ) {
        this.verzekeringsnummer = verzekeringsnummer;
        this.naamVerzekering = naamVerzekering;
        this.naam = naam;
        this.oogmetingL = oogmetingL;
        this.oogmetingR = oogmetingR;
        this.telefoonNummer = telefoonNummer;
    }

    public Klanten() {
    }


    public void setVerzekeringsnummer( int verzekeringsnummer ) {
        this.verzekeringsnummer = verzekeringsnummer;
    }

    public int getVerzekeringsnummer() {
        return verzekeringsnummer;
    }

    public void setNaamVerzekering( String naamVerzekering ) {
        this.naamVerzekering = naamVerzekering;
    }

    public String getNaam() {
        return naam;
    }

    public void setNaam( String naam ) {
        this.naam = naam;
    }


    public void setTelefoonNummer( int telefoonNummer ) {
        this.telefoonNummer = telefoonNummer;
    }

    public int getTelefoonNummer() {
        return telefoonNummer;
    }

    public void setOogmetingR( double oogmetingR ) {
        this.oogmetingR = oogmetingR;
    }


    public void setOogmetingL( double oogmetingL ) {
        this.oogmetingL = oogmetingL;
    }


    @Override
    public String toString() {
        return "\nKlanten{" + "naam='" + naam + '\'' + ", telefoonNummer=" + telefoonNummer + "verzekeringsnummer=" + verzekeringsnummer + ", naam van verzekering='" + naamVerzekering + '\'' + ", oogmetingL=" + oogmetingL + ", oogmetingR=" + oogmetingR + "}\n";
    }


    public void AddCustomerDetails( Klanten k ) {
        this.naam = k.naam;
        this.telefoonNummer = k.telefoonNummer;
        this.verzekeringsnummer = k.verzekeringsnummer;
        this.naamVerzekering = k.naamVerzekering;
        this.oogmetingL = k.oogmetingL;
        this.oogmetingR = k.oogmetingR;
    }


    public void displayCustomers( ArrayList<Klanten> arr ) {

        if (arr.isEmpty()) {
            System.out.println("\n\n");
            System.out.println("Geen Klanten");
            return;
        }
        System.out.println("-----------------------------------------------------------------------------------------------------");
        System.out.println("Klant \t\t Telefoonnummer \t\t Sterkte L \t\t Sterkte R \t\t Verzekering \t\t Verzekeringsnummer");
        System.out.println("------------------------------------------------------------------------------------------------------");

        for (Klanten k : arr) {
            System.out.println(k.naam + "\t\t" + k.telefoonNummer + "\t\t\t\t" + k.oogmetingL + "\t\t\t\t" + k.oogmetingR + "\t\t\t\t\t" + k.naamVerzekering + "\t\t\t\t\t" + k.verzekeringsnummer);
        }
        System.out.println("------------------------------------------------------------------------------------------------------");
    }

}

