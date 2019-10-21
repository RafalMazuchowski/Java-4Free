package bardziej.zaawansowanie;
// Binarny zapis i odczyt z plików 3.7.2

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class Zapisywanie {
    public static void main(String[] args) {
        RandomAccessFile strumien = null;
        int ilośćSczytanychBajtów = 0;
        try{
            strumien = new RandomAccessFile("daneBinarne.txt", "rw");
        }catch(FileNotFoundException e){
            System.out.println("Błąd otwierania strumienia");
        }
        
        try{
            strumien.writeUTF("Rafal");
            strumien.writeInt(2019);
            strumien.writeDouble(50/4);
            strumien = new RandomAccessFile("daneBinarne.txt", "rw");
            while (strumien.read() != -1)
                    ilośćSczytanychBajtów++;
        }catch(IOException e){
            System.out.println("Błąd WE-WYJ");
        }
        try{
            strumien.close();
        }catch(IOException e){
            System.out.println("Błąd zamykania strumeinia");
        }
        System.out.println("Ilość bajtów wynosi: " + ilośćSczytanychBajtów);
    
    }
}