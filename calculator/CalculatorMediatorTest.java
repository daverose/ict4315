package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import javax.swing.JLabel;

public class CalculatorMediatorTest {
  private CalculatorStack calculator;
  private CalculatorMediator mediator;
  private JLabel label;

  @Before
  public void setup() {
    calculator = new CalculatorStack();
    mediator = new CalculatorMediator(calculator);
    label = new JLabel();
    mediator.setDisplay(label);
  }
  
  @Test
  public void testPutDigits() {
    mediator.digitPressed(Digit.ZERO);
    assertEquals(getDisplayValue(0), label.getText());
    mediator.digitPressed(Digit.ONE);
    assertEquals(getDisplayValue(1), label.getText());
    mediator.digitPressed(Digit.ZERO);
    assertEquals(getDisplayValue(10), label.getText());
    mediator.digitPressed(Digit.SEVEN);
    assertEquals(getDisplayValue(107), label.getText());
    mediator.digitPressed(Digit.POINT);
    assertEquals(getDisplayValue(107), label.getText());
    mediator.digitPressed(Digit.FIVE);
    assertEquals(getDisplayValue(107.5), label.getText());
    mediator.digitPressed(Digit.POINT);
    assertEquals(getDisplayValue(107.5), label.getText());
    mediator.digitPressed(Digit.SEVEN);
    assertEquals(getDisplayValue(107.57), label.getText());
  }
  
  private String getDisplayValue(int value) {
    return "" + value + ".";
  }
  
  private String getDisplayValue(double value) {
    return Double.toString(value);
  }

}
