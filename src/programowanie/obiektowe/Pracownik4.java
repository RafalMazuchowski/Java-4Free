package programowanie.obiektowe;
// Dziedziczenie cd. i konstrukcja super() 2.9.0_1
public class Pracownik4 {
    private String imie;
    private String nazwisko;
    private double wyplata;
    
    public Pracownik4(String imie,String nazwisko, double wyplata){
        this.imie=imie;
        this.nazwisko=nazwisko;
        this.wyplata=wyplata;        
    }
    
    String getImie(){ return imie; }
    String getNazwiko(){ return nazwisko; }
    double getWyplata(){ return wyplata; }

}