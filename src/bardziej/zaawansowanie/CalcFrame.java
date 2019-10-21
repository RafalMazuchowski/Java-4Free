package bardziej.zaawansowanie;
// Wywołanie kodu javascript z poziomu Javy 3.3.0_2
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CalcFrame extends JFrame {
    JPanel calcPanel;

    public CalcFrame() {
        calcPanel = new CalculatorPanel();
        this.add(calcPanel);
        setPreferredSize(new Dimension(200, 200));
        pack();
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}