package podstawy.jezyka.java;
//  Podstawowe wejście / wyjście 1.8
import java.util.Scanner;

public class Skaner {
    public static void main (String[]args){
        double a,b;
        Scanner liczba = new Scanner(System.in);
        System.out.print("Podaj pierwszą liczbę:\t");
        a = liczba.nextDouble();
        System.out.print("Podaj drugą liczbę:\t");
        b = liczba.nextDouble();
        System.out.println("\n");
        
        System.out.println("a+b = "+(a+b));
        System.out.println("a-b = "+(a-b));
        System.out.println("a*b = "+(a*b));
        System.out.println("a/b = "+(a/b));
        
    }

}