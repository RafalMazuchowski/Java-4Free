package programowanie.obiektowe;
// Wyjątki - blok try catch 2.11.0
import java.util.Scanner;

public class Odczyt {
    public static void main(String[] args) {
        int tab[] = {1,2,3,4,5};
        Scanner odczyt = new Scanner(System.in);
        int index = -1;
        
        System.out.println("Podaj indeks tablicy, który chcesz odczytać: ");
        index=odczyt.nextInt();
        
        System.out.println(tab[index]);        
    }
}