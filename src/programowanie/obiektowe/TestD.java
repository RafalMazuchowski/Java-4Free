package programowanie.obiektowe;
// Dziedziczenie - podstawy 2.6.1_0
public class TestD {
    public static void main(String[] args) {
        Punkt2D pkt1 = new Punkt2D(3,4); // 2.6.1_1
        Punkt3D pkt2 = new Punkt3D(3,5,7); // 2.6.1_2
        
        System.out.println("Punkt2D: "+pkt1.x+" "+pkt1.y);
        System.out.println("Punkt3D: "+pkt2.x+" "+pkt2.y+" "+pkt2.z);
    }

}