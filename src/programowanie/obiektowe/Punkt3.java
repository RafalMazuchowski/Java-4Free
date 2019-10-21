package programowanie.obiektowe;
// Argumenty metod 2.3.3_0
public class Punkt3 {
     
    int pktX;
    int pktY;
    
    void zwiekszX1(){
        pktX++;
    }
    void zwiekszY1(){
        pktY++;
    }
    void zwiekszX(int a){
        pktX+=a;
    }
    void zwiekszY(int a){
        pktY+=a;
    }
    int wspX(){
        return pktX;
    }
    int wspY(){
        return pktY;
    }
    void wysw (){
        System.out.println("X:"+pktX+" Y:"+pktY);
    }
}