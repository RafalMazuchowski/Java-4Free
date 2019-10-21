package programowanie.obiektowe;
// Dziedziczenie - podstawy 2.6.0_1
public class Firma3 {
public static void main(String args[]){
        Pracownik3 prac = new Pracownik3("Wlodek", "Zięba", 3000); //2.6.0_2
        System.out.println("Imię: "+prac.imie);
        System.out.println("Nazwisko: "+prac.nazwisko);
        System.out.println("Wypłata: "+prac.wyplata+"\n");

        Szef szef = new Szef();  // 2.6.0_3

        System.out.println("Imię: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wypłata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia+"\n");

        szef.imie = "Tadeusz";
        szef.nazwisko = "Kowalski";
        szef.wyplata = 10000;
        szef.premia = 2000;
        System.out.println("Imię: "+szef.imie);
        System.out.println("Nazwisko: "+szef.nazwisko);
        System.out.println("Wypłata: "+szef.wyplata);
        System.out.println("Premia: "+szef.premia);
    }
}