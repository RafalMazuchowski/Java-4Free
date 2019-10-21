package programowanie.obiektowe;
// Argumenty metod 2.3.3_1
public class Main3 {
    public static void main (String args[]){
        Punkt3 punkt = new Punkt3(); //2.3.3_0
        punkt.pktX = 4;
        punkt.pktY = 5;
        
        punkt.zwiekszX1();
        punkt.zwiekszY1();
        punkt.wysw();
        
        punkt.zwiekszX(3);
        punkt.wysw();
        
        int wartosc=punkt.wspX();
        System.out.println("X:"+wartosc);
        
        
        
        
    }

}