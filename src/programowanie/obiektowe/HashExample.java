package programowanie.obiektowe;
// Metoda hashCode() 2.10.0_1
public class HashExample {
    public static void main(String[] args) {
        
        Product prod1 = new Product("Czekolada", 2.99);
        Product prod2 = new Product("Czekolada", 2.99);
        System.out.println(prod1.equals(prod2));
        System.out.println(prod1.hashCode()); //2018699554
        System.out.println(prod2.hashCode()); //1311053135
        
        Integer 
            a=prod1.hashCode(),
            b=prod2.hashCode();
        
        System.out.println(a.equals(b)); // Wł./Wył. @Override
        
    }
}