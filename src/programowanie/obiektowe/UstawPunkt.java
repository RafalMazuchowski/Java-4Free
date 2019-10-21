package programowanie.obiektowe;
// Pierwszy program obiektowy 2.2.0_2

public class UstawPunkt {
    public static void main(String[] args) {
        Punkt punkt = new Punkt(); //2.2.0_1
        punkt.wspX = 10;
        punkt.wspY = 20;
        System.out.println("Współrzędne punktu: ("+punkt.wspX+","+punkt.wspY+")");
    }
    

}