package bardziej.zaawansowanie;
// Wątki - wprowadzenie i przykład 3.5.1_0
public class MyRun1{ // bez implementacji
    
    private int id;
    
    public MyRun1(int id){
        this.id = id;
    }
    
    public void run(){
        while(true){
            System.out.println("NieWatek "+id);
            try{
                //usypiamy wątek na 100 milisekund
                Thread.sleep(100);
            }catch (InterruptedException e){
                e.printStackTrace();            
            }
        }
    }
}