package podstawy.jezyka.java;
// Pętle w Javie 1.13

import java.util.Scanner;


public class Bomba {
    public static void main(String[] args) {
        System.out.println("Podaj liczbe powyżej 0: ");
        Scanner licznik = new Scanner(System.in);
        
        for(int a = licznik.nextInt();a!=0;a--){
            System.out.println("Bomba wybuchnie za: "+a);
        }
        
        System.out.println("\nBUM!");
        
    }

}