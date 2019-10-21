package bardziej.zaawansowanie;
// Wywołanie kodu javascript z poziomu Javy 3.3.0_0
import java.awt.EventQueue;

public class CalcMain {
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new CalcFrame();
            }
        });
    }
}