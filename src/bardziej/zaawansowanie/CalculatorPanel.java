package bardziej.zaawansowanie;
// Wywołanie kodu javascript z poziomu Javy 3.3.0_1
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class CalculatorPanel extends JPanel {
    private JTextArea resultArea;

    public CalculatorPanel() {
        JPanel centralPanel = new JPanel();
        centralPanel.setLayout(new GridLayout(4, 3));
        JPanel rightPanel = new JPanel();
        rightPanel.setLayout(new GridLayout(4, 1));
        ActionListener listener = new CalcAction();

        addButton("1", listener, centralPanel);
        addButton("2", listener, centralPanel);
        addButton("3", listener, centralPanel);
        addButton("4", listener, centralPanel);
        addButton("5", listener, centralPanel);
        addButton("6", listener, centralPanel);
        addButton("7", listener, centralPanel);
        addButton("8", listener, centralPanel);
        addButton("9", listener, centralPanel);
        addButton("0", listener, centralPanel);
        addButton(".", listener, centralPanel);
        addButton("=", listener, centralPanel);

        addButton("+", listener, rightPanel);
        addButton("-", listener, rightPanel);
        addButton("*", listener, rightPanel);
        addButton("/", listener, rightPanel);

        resultArea = new JTextArea();
        resultArea.setEditable(false);

        this.setLayout(new BorderLayout());
        this.add(resultArea, BorderLayout.NORTH);
        this.add(centralPanel, BorderLayout.CENTER);
        this.add(rightPanel, BorderLayout.EAST);
    }

    private void addButton(String label, ActionListener listener, JPanel panel) {
        JButton button = new JButton(label);
        button.addActionListener(listener);
        panel.add(button);
    }

    private class CalcAction implements ActionListener {
        ScriptEngineManager manager;
        ScriptEngine engine;

        public CalcAction() {
            manager = new ScriptEngineManager();
            engine = manager.getEngineByName("js");
        }

        @Override
        public void actionPerformed(ActionEvent action) {
            String click = action.getActionCommand();
            String resultString = null;
            if ("=".equals(click)) {
                try {
                    Double eval = (Double) engine.eval(resultArea.getText());
                    resultString = eval.toString();
                } catch (ScriptException e) {
                    e.printStackTrace();
                }
            } else {
                resultString = resultArea.getText() + click;
            }
            resultArea.setText(resultString);
        }
    }

}