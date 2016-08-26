package calculator;

import javax.swing.JLabel;

public class CalculatorMediator {
  private JLabel display;
  private CalculatorStack calculator;
  
  public CalculatorMediator(CalculatorStack calculator) {
    this.calculator = calculator;
  }
  
  public void setDisplay(JLabel display) {
    this.display = display;
  }
  
  public void digitPressed(Digit digit) {
    calculator.updateState(digit);
    display.setText(calculator.getDisplayValue());
  }

  public void operatorPressed(Operator operator) {
    calculator.updateState(operator);
    display.setText(calculator.getDisplayValue());
  }

  public void clearPressed(Clear clear) {
    calculator.updateState(clear);
    display.setText(calculator.getDisplayValue());
  }

  public void characterPressed(Character character) {
    System.out.println("Not yet implemented: " + character.getDisplayValue());
  }
}
