package be.vdab;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String voornaam = "";
        String familienaam = "";
        try {
            System.out.println("Schrijf je voornaam:");
            Scanner scanner1=new Scanner(System.in);
            voornaam=scanner1.nextLine();
        }catch (NaamException ex){
            System.out.println(ex);
        }
        try {
            System.out.println("Schrijf je familienaam:");
            Scanner scanner2=new Scanner(System.in);
            familienaam=scanner2.nextLine();
        }catch (NaamException ex){
            System.out.println(ex);
        }

        var persoon= new Politieker(voornaam,familienaam, new PolitiekePartij("N-VA", 2755));
        System.out.println(persoon);
    }
}
