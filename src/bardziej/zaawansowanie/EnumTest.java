package bardziej.zaawansowanie;
// Enum 3.2.0
public class EnumTest {
    
    public enum Kolor {
        CZERWONY, ZIELONY, NIEBIESKI;
    }
    
    public static void main(String[] args) {

        EnumTest.Kolor kolor = EnumTest.Kolor.CZERWONY;

        if(kolor.equals(EnumTest.Kolor.CZERWONY)) {
            System.out.println("Zgadza sie");
        }

        if(kolor.equals(EnumTest.Kolor.NIEBIESKI)) {
            System.out.println("Zgadza sie");
        } else {
            System.out.println("Nie zgadza sie");
        }
    }
}