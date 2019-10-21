package podstawy.jezyka.java;
// Zapis i konwencja nazewnictwa 1.9
//
//
public class Konwencje {    //klasa
        void metoda(){
        int jakasZmienna;
  final int TO_JEST_STALA;
  
        int liczba;         //wielkość ma znaczenie
        int Liczba;         // !!!
        
        }        
    
}

class Klasa_1{            //kramry
  void metoda(){
     int zmienna;
  }
}


// Wstęp i podstawowe terminy 1.10
class Klasa{
  void metoda1(){}                          // ta metoda nie zwracająca nic
  int metoda2(){ return 1; }                // ta metoda zwraca w wyniku liczbę 1
  Klasa metoda3(){ return new Klasa(); }    // ta metoda zwraca obiekt klasy Klasa
  void metoda4(int parametr){}              // funkcja przyjmująca jeden argument typu int
}
