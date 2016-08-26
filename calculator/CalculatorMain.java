package calculator;

import java.awt.Font;
import java.util.Enumeration;

import javax.swing.UIManager;

public class CalculatorMain {

  public static void main(String[] args) {
    // Schedule a job for the event-dispatching thread:
    // creating and showing this application's GUI.
    javax.swing.SwingUtilities.invokeLater(new Runnable() {
      @Override
      public void run() {
        setUIFont(new javax.swing.plaf.FontUIResource(Font.SANS_SERIF,Font.PLAIN,36));
        CalculatorMediator mediator = new CalculatorMediator(new CalculatorStack());
        CalculatorUI ui = new CalculatorUI(mediator);
        ui.setSize(300,  400);
        ui.setVisible(true);
      }
    });
  }

  public static void setUIFont(javax.swing.plaf.FontUIResource f) {
    Enumeration<Object> keys = UIManager.getDefaults().keys();
    while (keys.hasMoreElements()) {
      Object key = keys.nextElement();
      Object value = UIManager.get(key);
      if (value != null && value instanceof javax.swing.plaf.FontUIResource)
        UIManager.put(key, f);
    }
  }
}
