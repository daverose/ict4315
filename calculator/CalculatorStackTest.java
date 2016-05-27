package calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CalculatorStackTest {
  
  private CalculatorStack calculator;
  
  @Before
  public void setup() {
    calculator = new CalculatorStack();
  }

  @Test
  public void testEmpty() {
    assertEquals(getDisplayValue(0), calculator.getDisplayValue());
    assertEquals(getDisplayValue(0), calculator.evaluate());
  }
  
  @Test
  public void testPutDigits() {
    calculator.updateState(Digit.ZERO);
    assertEquals(getDisplayValue(0), calculator.getDisplayValue());
    calculator.updateState(Digit.ONE);
    assertEquals(getDisplayValue(1), calculator.getDisplayValue());
    calculator.updateState(Digit.ZERO);
    assertEquals(getDisplayValue(10), calculator.getDisplayValue());
    calculator.updateState(Digit.SEVEN);
    assertEquals(getDisplayValue(107), calculator.getDisplayValue());
    calculator.updateState(Digit.POINT);
    assertEquals(getDisplayValue(107), calculator.getDisplayValue());
    calculator.updateState(Digit.FIVE);
    assertEquals(getDisplayValue(107.5), calculator.getDisplayValue());
    calculator.updateState(Digit.POINT);
    assertEquals(getDisplayValue(107.5), calculator.getDisplayValue());
    calculator.updateState(Digit.SEVEN);
    assertEquals(getDisplayValue(107.57), calculator.getDisplayValue());
  }
  
  @Test
  public void testPutDigitsStartingWithDot() {
    calculator.updateState(Digit.POINT);
    assertEquals(getDisplayValue(0), calculator.getDisplayValue());
    calculator.updateState(Digit.ONE);
    assertEquals(getDisplayValue(0.1), calculator.getDisplayValue());
    calculator.updateState(Digit.POINT);
    assertEquals(getDisplayValue(0.1), calculator.getDisplayValue());
    calculator.updateState(Digit.ZERO);
    assertEquals(getDisplayValue(0.1) + "0", calculator.getDisplayValue());
    calculator.updateState(Digit.SEVEN);
    assertEquals(getDisplayValue(0.107), calculator.getDisplayValue());
    calculator.updateState(Digit.POINT);
    assertEquals(getDisplayValue(0.107), calculator.getDisplayValue());
    calculator.updateState(Digit.FIVE);
    assertEquals(getDisplayValue(0.1075), calculator.getDisplayValue());
  }
  
  @Test
  public void testAdd() {
    calculator.updateState(Digit.ONE);
    assertEquals(getDisplayValue(1), calculator.getDisplayValue());
    calculator.updateState(Operator.PLUS);
    assertEquals(getDisplayValue(1), calculator.getDisplayValue());
    calculator.updateState(Digit.THREE);
    assertEquals(getDisplayValue(3), calculator.getDisplayValue());
    calculator.updateState(Operator.EQUALS);
    assertEquals(getDisplayValue(4), calculator.getDisplayValue());
    assertEquals(getDisplayValue(4), calculator.evaluate());
  }
  
  @Test
  public void testSubtract() {
    calculator.updateState(Digit.ONE);
    assertEquals(getDisplayValue(1), calculator.getDisplayValue());
    calculator.updateState(Operator.MINUS);
    assertEquals(getDisplayValue(1), calculator.getDisplayValue());
    calculator.updateState(Digit.THREE);
    assertEquals(getDisplayValue(3), calculator.getDisplayValue());
    calculator.updateState(Operator.EQUALS);
    assertEquals(getDisplayValue(-2), calculator.getDisplayValue());
    assertEquals(getDisplayValue(-2), calculator.evaluate());
    calculator.updateState(Operator.MINUS);
    assertEquals(getDisplayValue(-2), calculator.getDisplayValue());
    calculator.updateState(Digit.THREE);
    assertEquals(getDisplayValue(3), calculator.getDisplayValue());
    calculator.updateState(Operator.MINUS);
    assertEquals(getDisplayValue(-5), calculator.getDisplayValue());
    calculator.updateState(Operator.EQUALS);
    assertEquals(getDisplayValue(-5), calculator.getDisplayValue());
    assertEquals(getDisplayValue(-5), calculator.evaluate());
    
  }
  
  @Test
  public void testMultiply() {
    calculator.updateState(Digit.ONE);
    assertEquals(getDisplayValue(1), calculator.getDisplayValue());
    calculator.updateState(Operator.TIMES);
    assertEquals(getDisplayValue(1), calculator.getDisplayValue());
    calculator.updateState(Digit.THREE);
    assertEquals(getDisplayValue(3), calculator.getDisplayValue());
    calculator.updateState(Operator.EQUALS);
    assertEquals(getDisplayValue(3), calculator.getDisplayValue());
    calculator.updateState(Operator.TIMES);
    assertEquals(getDisplayValue(3), calculator.getDisplayValue());
    calculator.updateState(Digit.THREE);
    assertEquals(getDisplayValue(3), calculator.getDisplayValue());
    calculator.updateState(Digit.THREE);
    assertEquals(getDisplayValue(33), calculator.getDisplayValue());
    calculator.updateState(Operator.TIMES);
    assertEquals(getDisplayValue(99), calculator.getDisplayValue());
    assertEquals(getDisplayValue(99), calculator.evaluate());
    
  }
  
  @Test
  public void testDivide() {
    
  }
  
  @Test
  public void testEquals() {
    
  }
  
  @Test
  public void testClear() {
    
  }
  
  @Test
  public void testAllClear() {
    
  }
  
  @Test
  public void testAddThenMultiply() {
    
  }
  
  @Test
  public void testSubtractThenDivide() {
    
  }
  
  @Test
  public void testComplexStack() {
    
  }
  
  private String getDisplayValue(int value) {
    return "" + value + ".";
  }
  
  private String getDisplayValue(double value) {
    return Double.toString(value);
  }

}
