package programowanie.obiektowe;
// Przeciążanie metod 2.4.0
public class Dodaj {
    int dodaj(int a, int b){
        System.out.println("METODA 1:INT (2x INT)\n");
        return a+b;
    }
    double dodaj(double a, double b){
        System.out.println("METODA 2:DOUBLE (2x DOUBLE)\n");
        return a+b;
    }
    double dodaj(int a, double b){
        System.out.println("METODA 3:DOUBLE (INT+DOUBLE)\n");
        return a+b;
    }
    int dodaj(int a, short b){
        System.out.println("METODA 4:INT (INT+SHORT)\n");
        return a+b;
    }
}

class Test3 {
    public static void main (String args[]){
        int a=5, b=3;
        double c=1, d=2;
        short e=7;
        
        Dodaj suma = new Dodaj();
        System.out.println("Int+Int");
        suma.dodaj(a,b); //1
        
        System.out.println("Double+Double");
        suma.dodaj(c,d); //2
        
        System.out.println("Double+Int");
        suma.dodaj(c,a); //3
        
        System.out.println("Int+Double");
        suma.dodaj(b,d); //3  !!! 2
        
        System.out.println("Int+Short");
        suma.dodaj(a,e); //4
        
        System.out.println("Short+Int");
        suma.dodaj(e,a); //4  !!! 1 

        System.out.println("Short+Double");
        suma.dodaj(e,d); //3  !!! 2
    }
    
}