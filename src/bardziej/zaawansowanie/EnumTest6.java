package bardziej.zaawansowanie;
// Enum 3.2.6_1 - własny komparator

import java.util.Arrays;
import java.util.Comparator;

public class EnumTest6 {
    public class MojKomparator implements Comparator<Kolor> {
        public int compare(Kolor pierwszy, Kolor drugi) {

            // najpierw porównaj, czy obydwa sa ladne / brzydkie
            if (pierwszy.ladny != drugi.ladny) {
                if (pierwszy.ladny) {
                    return -1;
                } else {
                    return 1;
                }
            } else {
                // jesli te same, to porównaj nazwy (alfabetycznie)
                return pierwszy.toString().compareTo(drugi.toString());
            }
        }
    }
    
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

        EnumTest6 test = new EnumTest6();
        MojKomparator mojKomparator = test.new MojKomparator();

        Kolor[] kolory = Kolor.values();

        System.out.println("Przed sortowaniem:");
        for (Kolor kolor : kolory) {
            System.out.println(kolor.toString());
        }

        Arrays.sort(kolory, mojKomparator);

        System.out.println("\nPo sortowaniu");
        for (Kolor kolor : kolory) {
            System.out.println(kolor.toString());
        }
    }

    public static String czyLadny(Kolor kolor) {
        String czyLadny = (kolor.ladny) ? "ladny" : "brzydki";
        return "Kolor "+kolor.toString()+" jest "+czyLadny;
    }
}