package bardziej.zaawansowanie;
// Enum 3.2.5 - implementowanie interfejsów
public class EnumTest5 {
    
    public enum Kolor implements Runnable {

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

        @Override
        public void run() {
            System.out.println(czyLadny(this));
        }
    }

    public static void main(String[] args) {
        for(Runnable kolor: Kolor.values()) {
            kolor.run();
        }	
    }

    public static String czyLadny(Kolor kolor) {
        String czyLadny = (kolor.ladny) ? "ladny" : "brzydki";
        return "Kolor "+kolor.toString()+" jest "+czyLadny;
    }
}