package programowanie.obiektowe;
// Metody o zmiennej liczbie argumentów (varargs) 2.15.0
public class Suma {
    public static int suma(int arg0, int...args){  //
        int wynik = arg0;
        
        for (int i=0; i<args.length; i++){
            wynik += args[i];
        }
        return wynik;
    }
    public static void main(String[] args) {
        System.out.println(suma(3)+" ");
        System.out.println(suma(3+3)+" ");
        System.out.println(suma(3+3+3)+" ");
        System.out.println(suma(3+3+3+3+3+3)+" ");        
    }
}