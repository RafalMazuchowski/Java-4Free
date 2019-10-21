package programowanie.obiektowe;
// Parametry i słowo kluczowe this 2.7.0
public class PunktThis {
    int x;  // <---- this
    int y;
            public PunktThis(int a, int b){
                this.x = a; // to samo
                y = b;
            }
            public void setPunkt(int x, int y){ // wywalamy dodatkowe argumenty
                this.x = x; 
                this.y = y;
            }

}