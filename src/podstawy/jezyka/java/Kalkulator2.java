package podstawy.jezyka.java;
// Funkcje matematyczne i Wielkie liczby 1.6.1
import static java.lang.Math.*;
import java.math.BigInteger;

public class Kalkulator2 {
    public static void main (String[]args){
        BigInteger a=new BigInteger("123123123123123123123");
        BigInteger b=new BigInteger("-9876543219876543210");
        
        System.out.println("A:\t\t"+a.toString());
        System.out.println("B:\t\t"+b.toString());
        System.out.println();
        
        System.out.println("Suma a i b:\t"+a.add(b).toString());
        System.out.println("Różnica a i b:\t"+a.subtract(b).toString());
        System.out.println("Iloczyn a i b:\t"+a.multiply(b).toString());
        System.out.println("Iloraz a i b:\t"+a.divide(b).toString());
        System.out.println("Potęga a^2:\t"+a.pow(2).toString());
        System.out.println("Modulo |b|:\t"+b.abs().toString());
        // It's not a good idea xD
        //System.out.println("Potęga a^b: "+s.modPow(a, b).toString());
        
        
        
        

    }
    
}