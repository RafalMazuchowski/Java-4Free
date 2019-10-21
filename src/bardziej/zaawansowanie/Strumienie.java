package bardziej.zaawansowanie;
// Binarny zapis i odczyt z plików 3.7.0

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Strumienie {
    public static void main(String[] args) {
        try{
            DataOutputStream strumien = new DataOutputStream(new FileOutputStream("plik.txt"));
            /*
             * Dowolne
             * metody
             * 
             */
            strumien.close();
        }catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        }catch(IOException e){
            System.out.println("Błąd wejścia-wyjścia");
        }
    }
}