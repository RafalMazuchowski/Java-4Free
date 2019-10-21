package programowanie.obiektowe;
// Dziedziczenie - podstawy 2.6.0_2
public class Pracownik3 {
    String imie, nazwisko;
    int wyplata;
    
    public Pracownik3(String a, String b, int c){
        imie = a;
        nazwisko = b;
        wyplata = c;
    }
    
    public Pracownik3(Pracownik3 prac){
        imie = prac.imie;
        nazwisko = prac.nazwisko;
        wyplata = prac.wyplata;
    }

    public Pracownik3(){
        imie = "---";
        nazwisko = "---";
        wyplata = 0;
    }
      

}