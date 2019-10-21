package podstawy.jezyka.java;
// Zmienne 1.4
public class Zmienne {
    public static void main (String[] args){
        int liczba;//Deklaracja
        liczba=5;//Inicjalizacja
        char znak='A';
        
//***************************************

        int liczba1 = 6;
        int liczba2 = liczba1;
        System.out.println(liczba1+liczba2);
        
        double liczba3, liczba4;
        liczba3=5.0;
        liczba4=3.6;
        System.out.println(liczba3);
        System.out.println(liczba4);
        
        final double liczbaPi=3.14;
        System.out.println(Kalkulator());
        // liczbaPi=3;
        
//***************************************

        String hello="Witaj ";
        String world="Świecie";
        String powitanie=hello+world; //łączenie Stringów
        System.out.println(powitanie);
        
        String kawalek = powitanie.substring(0,7)+"wietny Uczniu"; //
        // Pierwsza litera ma ID: 0
        System.out.println(kawalek);
        
//***************************************

        String slowo1="Pa", slowo2="lenie", 
               slowo3="w", slowo4="z",slowo5="bronione";
        String nadSlowo=slowo1+slowo2+slowo3+slowo4+slowo5;
        
        String jaworski=nadSlowo.substring(0,7)+" "+nadSlowo.substring(7,17);
        System.out.println(jaworski);

    }
    public static String Kalkulator(){
        int a=5;
        int b=3;
        double liczbaPi=3.1415; //zmienna wewnetrzna
        System.out.println(liczbaPi);
        return ("a+b= "+(a+b));
    }

}