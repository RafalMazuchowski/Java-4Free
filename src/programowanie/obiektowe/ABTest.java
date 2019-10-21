package programowanie.obiektowe;
// Polimorfizm 2.13.0_2
public class ABTest {
    public static void main(String[] args) {
        A obiekt = new B(); //Przypisując obiekt B do referencji typu A 
                            //mamy dostęp tylko to metod, które znajdują się w typie referencji, 
                            //w tym przypadku interfejsu A.
        
                            
        obiekt.x();
//      obiekt.y();         //błąd, interfejs A nie posiada metody y()
        ((B)obiekt).y();    //ok, dzięki rzutowaniu uzyskujemy dostęp do metody y()
    }

}