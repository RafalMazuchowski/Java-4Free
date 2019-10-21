package programowanie.obiektowe;
// Metody o zmiennej liczbie argumentów (varargs) 2.15.1
public class Wypisz {
    public static void wypisz(int arg0, int...args){
        System.out.println("Pierwszy argument stały: "+arg0);
        
        for(int i=0;i<args.length;i++){
            System.out.println((i+1)+" zmienny argument: "+args[i]);
        }
        
        System.out.println("Ilość zmiennych argumentów: "+args.length);
    }
    
    public static void main(String[] args) {
        wypisz(6,5,4,3,2,1);
    }
}