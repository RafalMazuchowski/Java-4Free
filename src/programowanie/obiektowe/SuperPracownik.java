package programowanie.obiektowe;
// Dziedziczenie cd. i konstrukcja super() 2.9.0_0
public class SuperPracownik {
    public static void main(String[] args) {
        Lekarz lekarz = new Lekarz("Asia", "Kowalska", 2000); //2.9.0_2
        lekarz.setPremia(4000);
        System.out.println(lekarz.getImie()+" "+lekarz.getNazwiko()+"  ilość nadgodzin: "+lekarz.getPremia());
    }
    

}