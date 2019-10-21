package programowanie.obiektowe;
// Pierwszy program obiektowy 2.2.1_2

public class Firma1 {
    public static void main(String[] args) {
    Pracownik[] pracownicy = new Pracownik[3]; //2.2.1_1
    
    String[] imiona = {"Hyzio","Dyzio","Zyzio"};
    String[] nazwiska = {"Mróz","Gruz","Zus"};
    int[] wiek = {47,25,36};
    
    for(int i=0;i<pracownicy.length;i++){
        pracownicy[i]=new Pracownik();
        pracownicy[i].imie=imiona[i];
        pracownicy[i].nazwisko=nazwiska[i];
        pracownicy[i].wiek=wiek[i];
    }
    
        System.out.println("Pracownicy: ");
        for (Pracownik pracownicy1 : pracownicy) {
            System.out.println(pracownicy1.imie + " " + pracownicy1.nazwisko + ", " + pracownicy1.wiek + " lat.");
        }
    
    
    }
}