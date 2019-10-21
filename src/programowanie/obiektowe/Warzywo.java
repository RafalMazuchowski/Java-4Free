package programowanie.obiektowe;
// Metoda equals() 2.16.0_0
public class Warzywo {
    private String nazwa;
    private double cena;
    
    public Warzywo (String nazwa, double cena){
        this.nazwa=nazwa;
        this.cena=cena;
    }
    public String getNazwa() {
        return nazwa;
    }
    public double getCena() {
        return cena;
    }
    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    public void setCena(double cena) {
        this.cena = cena;
    }
    
    @Override
    public boolean equals(Object obj){
         if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Warzywo inna = (Warzywo) obj;
        if (nazwa == null) {
            if (inna.nazwa != null)
                return false;
        } else if (!nazwa.equals(inna.nazwa))
            return false;
        if (Double.doubleToLongBits(cena) != Double.doubleToLongBits(inna.cena))
            return false;
        return true;
    }
    

}