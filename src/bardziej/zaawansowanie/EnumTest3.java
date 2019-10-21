package bardziej.zaawansowanie;
// Enum 3.2.3 - operacje na wywoływanym Enum'ie
public class EnumTest3 {
    
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
            String poprzedniaNazwa = super.toString();
            String nowaNazwa = poprzedniaNazwa.toLowerCase();
            return nowaNazwa;
            
            // albo zamiast 3 linijek
            // return super.toString().toLowerCase();
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