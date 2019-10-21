package bardziej.zaawansowanie;
// Enum 3.2.2 - zwięzła implementacja obiektów
public class EnumTest2 {
    
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
        System.out.println(czyLadny(Kolor.CZERWONY));
        System.out.println(czyLadny(Kolor.ZIELONY));		
    }

    public static String czyLadny(Kolor kolor) {
        String czyLadny = (kolor.ladny) ? "ladny" : "brzydki";
        return "Kolor "+kolor.toString()+" jest "+czyLadny;
    }
}