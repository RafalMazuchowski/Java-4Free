package bardziej.zaawansowanie;
// Binarny zapis i odczyt z plików 3.7.1

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Strumienie1 {
    public static void main(String[] args) {
        DataOutputStream strumien = null;
        try{
            strumien = new DataOutputStream(new FileOutputStream("plik.txt"));
        }catch(FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
        }
        
        /*try{
            /*
            * Dowolne metody
            *           
        }catch(IOException e){
            // obsługa wyjątku
        }*/
        
        try{
            if(strumien!=null)
                strumien.close();
        }catch(IOException e){
            System.out.println("Błąd zamykania strumienia");
        }
    }

}