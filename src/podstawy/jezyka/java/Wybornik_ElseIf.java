package podstawy.jezyka.java;
// Instrukcje sterujące 1.11.2

import java.util.Scanner;

public class Wybornik_ElseIf {
    public static void main (String[]args){
        System.out.println("Jak masz na imię?");
        Scanner skan = new Scanner(System.in);
        String imie = skan.nextLine();
        String
                a="Paweł",
                b="Ania",
                c="Wojtek",
                d="Kasia",
                e="Rafał",
                f="Paulina",
                g="Wiktor";
                
        
        if (imie.equals(a)){
                System.out.println("Witaj "+a+".");
    }
        else if(imie.equals(b)){
                System.out.println("Witaj "+b+".");
    }
        else if(imie.equals(b)){
                System.out.println("Witaj "+c+".");
    }
        else if(imie.equals(b)){
                System.out.println("Witaj "+d+".");
    }
        else if(imie.equals(b)){
                System.out.println("Witaj "+e+".");
    }
        else if(imie.equals(b)){
                System.out.println("Witaj "+f+".");
    }
        else if(imie.equals(b)){
                System.out.println("Witaj "+g+".");
    }
        else{
                System.out.println("Proszę opuścić to miejsce.");
                
        }
        
    }
}