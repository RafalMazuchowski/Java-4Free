package programowanie.obiektowe;
// Dziedziczenie cd. i konstrukcja super() 2.9.0_2
public class Pielegniarka extends Pracownik4{ //2.9.0_1
    private int nadgodziny;
    
    public Pielegniarka(String imie, String nazwisko, double wyplata){
        super(imie, nazwisko, wyplata);
        nadgodziny = 0;
    }
    
    public int getNadgodziny(){return nadgodziny;}
    public void setNadgodziny(int n){
        nadgodziny += n;
    }
}