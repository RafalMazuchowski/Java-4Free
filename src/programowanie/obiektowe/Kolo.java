package programowanie.obiektowe;
// Polimorfizm 2.13.1_1
public class Kolo implements Figura{
    int promien;
    final double pi=3.14;
    
    public Kolo(int promien){
        this.promien = promien;
    }

    @Override
    public void obliczPole() {
        System.out.println(pi*promien*promien);
    }
}