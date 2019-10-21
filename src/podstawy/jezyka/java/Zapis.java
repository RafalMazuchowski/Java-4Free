package podstawy.jezyka.java;
// Zapis i odczyt z plików 1.11.0
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Zapis{
    public static void main(String[] args) throws FileNotFoundException{
        PrintWriter zapis = new PrintWriter("ala.txt");
        zapis.println("Ala ma kota, a kot ma Alę");
        zapis.close();
    }
}