package podstawy.jezyka.java;
// Zapis i odczyt z plików 1.12

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class ZapisDoPliku {
    public static void main(String[] args) throws FileNotFoundException {
        
        Scanner skan = new Scanner(System.in);
        System.out.println("Podaj swoje imię: ");
        String imie =skan.nextLine();
        
        PrintWriter zapis = new PrintWriter("imie.txt"); //Tworzy plik!
        zapis.print(imie);
        zapis.close();
                
        Scanner odczyt = new Scanner(new File("imie.txt"));
        System.out.println("Zapisano: "+odczyt.nextLine());
        
        
    }

}