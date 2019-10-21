package bardziej.zaawansowanie;
// Rekurencja (rekursja) 3.1.1
public class Rekurencja1 {
    
    public int sumaIteracja(int n){
        int suma=0;
        while(n>0){
            suma=suma+n;
            n--;
        }
        return suma;
    }
    
    public int sumaRekurencja(int n){
        return n>0? n+sumaRekurencja(n-1):0; //operator trójargumentowy (ternary operator)
    }
    
    public static void main(String[] args) {
        Rekurencja1 r = new Rekurencja1();
        int iteracja, rekurencja = 0;
        
        iteracja = r.sumaIteracja(3);
        rekurencja = r.sumaRekurencja(3);
        
        System.out.println("Iteracja: "+iteracja);
        System.out.println("Rekurencja: "+rekurencja);
    }
}

/*
sumaRekurencja(3);
    3 + sumaRekurencja(2);
sumaRekurencja(2);
    3 + 2 + sumaRekurencja(1);
sumaRekurencja(1);
    3 + 2 + 1 + sumaRekurencja(0);
sumaRekurencja(0);
    3 + 2 + 1 + 0
sumaRekurencja(1);
    3 + 2 + 1
sumaRekurencja(2);
    3 + 3
sumaRekurencja(3);
    return 6
*/