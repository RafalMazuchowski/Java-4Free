package programowanie.obiektowe;
// Argumenty metod 2.3.2_3
public class Main2 {
    public static void main (String args[]){
        Punkt2 punkt = new Punkt2(); //2.3.2_0
        punkt.x=5;
        punkt.y=5;
        
        System.out.println("Pobrane : "+punkt.x+" "+punkt.y);
        Test2.zmien(punkt); //2.3.2_1
        
        System.out.println("Współrzędne to: "+punkt.x+" "+punkt.y);
    }

}