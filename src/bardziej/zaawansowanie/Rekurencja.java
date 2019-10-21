package bardziej.zaawansowanie;
// Rekurencja (rekursja) 3.1.0
public class Rekurencja {
    
    public int sumaIteracja(int n){
        int suma=0;
        while(n>0){
            suma=suma+n;
            n--;
        }
        return suma;
    }
    
    public int sumaRekurencja(int n){
        if(n>0){
            return n+sumaRekurencja(n-1);
        } else {
            return 0;
        }
    }
    
    public static void main(String[] args) {
        Rekurencja r = new Rekurencja();
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