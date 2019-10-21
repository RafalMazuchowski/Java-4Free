package programowanie.obiektowe;
// Klasy abstrakcyjne 2.14.0
public abstract class Gwardzista {
    public static final int ILOSC_OCZU = 2; //stałe są ok
    
    //metoda abstrakcyjna
    public abstract String krzyczNaLudzi();
    
    //zwykła metoda z implementacją
    public static void biegnijDoKoszar(int odleglosc, int predkosc) {
            double czas = (double)odleglosc/predkosc;
            System.out.println("Wracam z amunicją za "+czas);
    }
}

/*
                    ŹLE

public abstract class Gwardzista {
	public static final int ILOSC_OCZU = 2; //stałe są ok

	//metoda abstrakcyjna nie może być statyczna
	public abstract static String krzyczNaLudzi();

	//metoda abstrakcyjna nie może posiadać implementacji
	//ani nawet nawiasów klamrowych
	public abstract void biegnijDoKoszar() {}
}

*/