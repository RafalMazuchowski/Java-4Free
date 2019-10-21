package programowanie.obiektowe;
// Polimorfizm 2.13.1_2
public class Prostokat implements Figura{
    int a, b;
    
    public Prostokat(int a, int b){
        this.a=a;
        this.b=b;
    }

    @Override
    public void obliczPole() {
        System.out.println(a*b);
    }
}