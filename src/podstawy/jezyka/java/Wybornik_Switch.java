package podstawy.jezyka.java;
// Instrukcje sterujące 1.11.1.0

import java.util.Scanner;

public class Wybornik_Switch {
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
                
        
        switch(imie){
            case "Paweł":
                System.out.println("Witaj "+a+".");
                break;                
            case "Ania":
                System.out.println("Witaj "+b+".");
                break;                
            case "Wojtek":
                System.out.println("Witaj "+c+".");
                break;                
            case "Kasia":
                System.out.println("Witaj "+d+".");
                break;                
            case "Rafał":
                System.out.println("Witaj "+e+".");
                break;                
            case "Paulina":
                System.out.println("Witaj "+f+".");
                break;                
            case "Wiktor":
                System.out.println("Witaj "+g+".");
                break;
                
            default:
                System.out.println("Proszę opuścić to miejsce.");
                
        }
        
    }

}