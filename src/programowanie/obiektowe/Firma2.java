package programowanie.obiektowe;
// Konstruktory 2.5.0_2
public class Firma2 {
    public static void main(String[] args) {
        System.out.println("Imie\tNazwisko\tWiek");
        
        Pracownik2[] pracownicy = new Pracownik2[3];
        pracownicy[0] = new Pracownik2();
        pracownicy[1] = new Pracownik2("Adam","Wojcik",47);
        pracownicy[2] = new Pracownik2(pracownicy[1]);
        
        for(Pracownik2 p:pracownicy){
            System.out.println(p.imie+"\t"+p.nazwisko+"\t\t"+p.wiek);
        }
    }

}
