package podstawy.jezyka.java;
// Tablice jednowymiarowe 1.14.1

import java.util.Scanner;
public class Tablicaliczb {
    public static void main(String[] args) {
        System.out.println("Podaj wielkość tablicy: ");
        Scanner skan = new Scanner(System.in);
        int rozmiar = skan.nextInt();
        int[] tablica = new int[rozmiar];
        int i=0;
        
        while (i<rozmiar){
            tablica[i]=i;
            System.out.println(i+1+"# element tablicy: "+tablica[i]);
            i++;
            
            
            
        }/*
        System.out.println("1# el tablicy: "+tablica[0]);
        System.out.println("2# el tablicy: "+tablica[1]);
        System.out.println("3# el tablicy: "+tablica[2]);
        System.out.println("4# el tablicy: "+tablica[3]);
        System.out.println("5# el tablicy: "+tablica[4]);
        System.out.println("10# el tablicy: "+tablica[9]);
        System.out.println("15# el tablicy: "+tablica[14]);
*/
    }
}