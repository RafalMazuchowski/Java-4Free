package podstawy.jezyka.java;
// Funkcje matematyczne i Wielkie liczby 1.6.0
import static java.lang.Math.*;

public class Kalkulator1 {
    public static void main (String[]args){
        int a=-2;
        int b=4;
        //a=-123; b=432;
        //b=5;
        
        
        System.out.println("a^b="+pow(a, b));
        System.out.println("|a|="+abs(a));
        System.out.println("pierwiastek z liczby a podniesionej do potęgi b: "+
                sqrt(pow(a,b)));
    }

}