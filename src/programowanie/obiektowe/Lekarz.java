package programowanie.obiektowe;
// Dziedziczenie cd. i konstrukcja super() 2.9.0_3
public class Lekarz extends Pracownik4{ //2.9.0_1
    private double premia;
    
    public Lekarz(String imie,String nazwisko, double wyplata){
        super(imie, nazwisko, wyplata);
        premia = 0;
    }
    
    public double getPremia(){return premia;}
    public void setPremia(double d){
       premia =d;
    }

}