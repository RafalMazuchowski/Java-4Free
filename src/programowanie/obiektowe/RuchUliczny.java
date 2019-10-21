package programowanie.obiektowe;
// Interfejsy 2.8.0_4
public class RuchUliczny {
    Pojazd rower = new Rower(); // 2.8.0_2
    Pojazd samochod = new Samochod(); // 2.8.0_3
    
    //    ^^^
    // Interfejsy mogą być wykorzystywane polimorficznie, 
    // tzn można ich używać jako typu ogólniejszego klas, 
    // które go implementują
    
    Samochod rower2 = new Samochod();

}