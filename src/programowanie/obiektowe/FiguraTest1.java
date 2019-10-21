package programowanie.obiektowe;
// Polimorfizm 2.13.1_3
public class FiguraTest1 {
    public static void main(String[] args) {
        Figura[] obiekt = new Figura[10];
        obiekt[0] = new Kolo(10);
        obiekt[1] = new Prostokat(10,2);
        obiekt[2] = new Prostokat(3,4);
        obiekt[3] = new Prostokat(4,2);
        obiekt[4] = new Kolo(11);
        obiekt[5] = new Prostokat(6,5);
        obiekt[6] = new Prostokat(10,10);
        obiekt[7] = new Prostokat(22,1);
        obiekt[8] = new Kolo(2);
        obiekt[9] = new Kolo(4);
        
        for (Figura f: obiekt) f.obliczPole();
        
    }
}