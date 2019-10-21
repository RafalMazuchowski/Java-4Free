package programowanie.obiektowe;
// Metoda equals() 2.16.0_1

import java.util.Scanner;

public class Sklep {
    public static void main(String[] args) {
        Warzywo warzywo1 = new Warzywo("Groszek", 2.5);
        Warzywo warzywo2 = new Warzywo("Groszek", 2.5);
        System.out.println(warzywo1 == warzywo2); //false
        System.out.println(warzywo2.equals(warzywo2)); //true
        
        System.out.println("----------------------------------------");
        
        String first = "Napis";
        String second = "Napis";
        System.out.println(first == second); //true
        System.out.println(first.equals(second)); //true
        
        System.out.println("----------------------------------------");
        
        Scanner scan = new Scanner(System.in);
        first = scan.nextLine(); //"abc"
        second = scan.nextLine(); //"abc"
        System.out.println("................");
        System.out.println(first == second); //false
        System.out.println(first.equals(second)); //true
        
    }
}