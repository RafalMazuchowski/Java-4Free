package bardziej.zaawansowanie;
// Enum 3.2.4 - iteracja po elementach
public class EnumTest4 {
    
    public enum Kolor {

        CZERWONY(false), 
        ZIELONY(true), 
        NIEBIESKI(true);

        boolean ladny;

        private Kolor(boolean czyLadny) {
            ladny = czyLadny;
        }
        
        @Override
        public String toString() {
            return super.toString().toLowerCase();
        }
    }
    
    public static void main(String[] args) {
        Kolor[] kolory = Kolor.values();
        
        for(int i=0; i<kolory.length; i++) {            //sposób I
            System.out.println(czyLadny(kolory[i]));
        }
        
        System.out.println("______________________________");

        for(int i=0; i<Kolor.values().length; i++) {    //sposób II
            System.out.println(czyLadny(Kolor.values()[i]));
        }

        System.out.println("______________________________");
        
        for(Kolor kolor: Kolor.values()) {              //sposób III
            System.out.println(czyLadny(kolor));
        }
    }

    public static String czyLadny(Kolor kolor) {
        String czyLadny = (kolor.ladny) ? "ladny" : "brzydki";
        return "Kolor "+kolor.toString()+" jest "+czyLadny;
    }
}