package bardziej.zaawansowanie;
// Wątki - wprowadzenie i przykład 3.5.1_1
public class Runner1 { // bez implementacji
    public static void main(String[] args) {
        MyRun1[] notRunners = new MyRun1[10];
        
        for(int i=0;i<10;i++){
            notRunners[i] = new MyRun1(i);
        }
        
        for(int i=0;i<10;i++){
            notRunners[i].run();
        }
    }

}