package bardziej.zaawansowanie;
// Enum 3.2.1 - konstruktory
public class EnumTest1 {
    
    public enum Kolor {

        CZERWONY(false), 
        ZIELONY(true), 
        NIEBIESKI(true);

        boolean ladny;

        private Kolor(boolean czyLadny) {
            ladny = czyLadny;
        }
    }
    
    public static void main(String[] args) {
        Kolor kolor = EnumTest1.Kolor.CZERWONY;		
        System.out.println("Kolor czerwony jest "+czyLadny(kolor));

        kolor = EnumTest1.Kolor.ZIELONY;		
        System.out.println("Kolor zielony jest "+czyLadny(kolor));
    }

    public static String czyLadny(Kolor kolor) {
        return (kolor.ladny) ? "ladny" : "brzydki";
    }

}
