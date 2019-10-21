package programowanie.obiektowe;
// Konstruktory 2.5.0_1
public class Pracownik2 {
    String imie, nazwisko;
    int wiek;
    
    public Pracownik2(String a, String b, int c){
        imie = a;
        nazwisko = b;
        wiek = c;
    }
    
    public Pracownik2(Pracownik2 prac){
        imie = prac.imie;
        nazwisko = prac.nazwisko;
        wiek = prac.wiek;
    }

    public Pracownik2(){
        imie = "---";
        nazwisko = "---";
        wiek = 00;
    }
      

}