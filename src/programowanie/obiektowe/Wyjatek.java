package programowanie.obiektowe;
// Zgłaszanie wyjątków - instrukcja throw 2.12.0

import java.util.Scanner;

public class Wyjatek {
    public static void main(String[] args) throws ArithmeticException{
        int x=10;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dzielnik: ");
        y=sc.nextInt();
        if(y==0)
            throw new ArithmeticException("Nie można dzielić przez 0");
        else
            System.out.println(x/(double)y);
        
    }
}