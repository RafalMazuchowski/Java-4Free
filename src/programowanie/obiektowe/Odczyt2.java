package programowanie.obiektowe;
// Wyjątki - blok try catch 2.11.2
import java.util.Scanner;

public class Odczyt2 {
    public static void main(String[] args) {
        int tab[] = {1,2,3,4,5};
        Scanner odczyt = new Scanner(System.in);
        int index = -1;
        
        System.out.println("Podaj indeks tablicy, który chcesz odczytać: ");
        index=odczyt.nextInt();
        
        try{
            System.out.println(tab[index]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
        }
        
    }
}