package programowanie.obiektowe;
// Wyjątki - blok try catch 2.11.3
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Odczyt3 {
    public static void main(String[] args) {
        int tab[] = {1,2,3,4,5};
        BufferedReader  odczyt = new BufferedReader(new InputStreamReader(System.in));
        int index = -1;
        
        System.out.println("Który element tablicy chcesz zobaczyć: ");
        boolean czyPoprawne = false;
        
        while(!czyPoprawne){
            try{
                index=Integer.parseInt(odczyt.readLine());
            }catch (NumberFormatException n){System.err.println("Niepoprawne dane!"
                    + "\nKtóry element tablicy chcesz zobaczyć:");
            }catch (IOException e){System.err.println("Błąd odczytu danych");                
            }
            
            czyPoprawne = index == -1? false : true;
        }
        
        try{
            System.out.println(tab[index-1]);
        } catch (ArrayIndexOutOfBoundsException e){
            System.err.println("Niepoprawny parametr, rozmiar tablicy to: "+tab.length);
        }
        
    }
}