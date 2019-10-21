package podstawy.jezyka.java;
// Operatory matematycze i logiczne 1.5
public class Kalkulator {
    public static void main (String[] args){
        double a= 3;
        double b= 5;
        double c= 7;
        double wynik;
        boolean rezultat;
        
        System.out.println("Liczby to: A="+a+", B="+b+", C="+c);        
        wynik=(a+b)*c;
        System.out.println("(a+b)*c = "+wynik);
        wynik=a-b/c;
        System.out.println("a-b/c = "+wynik);
        wynik-=a;
        System.out.println("-a = "+wynik);
        rezultat=(wynik+a==a-b/c);
        System.out.println("Czy rezultat wraca? "+rezultat);
        
        
        System.out.println("------------------------------------------\n");
        System.out.println("A = "+a+"B = "+b);
        wynik=a+b++; //  pre-inkrementacja - PRZED        
        System.out.println("pre-inkrementacja  a+b++");
        System.out.println("A = "+a+"B = "+b);
        System.out.println("a+b++ = "+wynik+", \'b\' wynisi:"+b);
        System.out.println();
        System.out.println("*** Sumowanie a+b zachodzi na \"pierwotnym b \"\n\n");
        
        System.out.println("A = "+a+"B = "+b);
        wynik=a+(++b); //  post-inkrementacja - PO
        System.out.println("post-inkrementacja  a+(++b)");
        System.out.println("B = "+b+"A = "+a);
        System.out.println("a+(++b) = "+wynik+", \'b\' wynisi:"+b);
        System.out.println("A = "+a+"B = "+b);
        System.out.println();
        System.out.println("*** Sumowanie a+b zachodzi na \"przerobionym b \"\n");
        System.out.println("------------------------------------------");
        
        rezultat=(a+b>c);
        System.out.println("(a+b) > c ?\t"+rezultat);
        rezultat=(a==b);
        System.out.println("a=b ?\t\t"+rezultat);
        
    }

}