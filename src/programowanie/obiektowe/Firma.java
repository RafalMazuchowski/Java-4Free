package programowanie.obiektowe;
// Pierwszy program obiektowy 2.2.1_3

public class Firma {
    public static void main(String[] args) {
    Pracownik pracownik1 = new Pracownik(); //2.2.1_1
    Pracownik pracownik2 = new Pracownik(); //2.2.1_1
    
    pracownik1.imie = "Staszek";
    pracownik1.nazwisko = "Wojtyszak";
    pracownik1.wiek = 47;
    
    pracownik2.imie = "Adam";
    pracownik2.nazwisko = "Nazwisko";
    pracownik2.wiek = 28;
    
        System.out.println("Pracownicy: ");
        System.out.println(pracownik1.imie+" "+pracownik1.nazwisko+", "+pracownik1.wiek+" lat.");
        System.out.println(pracownik2.imie+" "+pracownik2.nazwisko+", "+pracownik2.wiek+" lat.");
    }
}