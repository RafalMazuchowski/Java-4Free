package podstawy.jezyka.java;
// Instrukcje sterujące 1.11.0
import java.util.Scanner;

public class Jezeli_If {
    public static void main (String[]args){
        double a,b;
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        a = skan.nextDouble();
        System.out.println("Podaj drugą iczbę: ");
        b = skan.nextDouble();
        
        if (a>b){
            System.out.println("Liczba "+a+" jest większa");
        } else if (a<b){
            System.out.println("Liczba "+b+" jest większa");
        } else{
            System.out.println("Liczby "+a+" i "+b+" są sobie równe.");
            }
        
        if(a%2==0){
            System.out.println("Liczba "+a+" jest parzysta");
        } else {
            System.out.println("Liczba "+a+" jest nieparzysta");
        }
        
        if(b%2==0){
            System.out.println("Liczba "+b+" jest parzysta");
        } else {
            System.out.println("Liczba "+b+" jest nieparzysta");
        }
    }
}