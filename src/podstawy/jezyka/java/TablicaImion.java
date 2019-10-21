package podstawy.jezyka.java;
// Tablice jednowymiarowe 1.14.0

import java.util.Scanner;

public class TablicaImion {
    public static void main(String[] args) {
        String[] tablica = new String[5];
        Scanner skan = new Scanner(System.in);
        
        for(int i=0;i<5;i++){
            System.out.println("Podaj "+(i+1)+"# imię: ");
            tablica[i]= skan.nextLine();
        }
        for(int i=0;i<5;i++){
            System.out.println("Witaj "+tablica[i]);
        }
    }

}