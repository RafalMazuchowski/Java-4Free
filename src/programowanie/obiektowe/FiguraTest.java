package programowanie.obiektowe;
// Polimorfizm 2.13.1_3
public class FiguraTest {
    public static void main(String[] args) {
        Figura obiekt = new Kolo(10);
        Figura obiekt1 = new Prostokat(10,2);
        obiekt.obliczPole();
        obiekt1.obliczPole();
    }
}