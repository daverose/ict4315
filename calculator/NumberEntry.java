package calculator;

import java.util.Stack;

public class NumberEntry extends State {
  private String integerPart = "0";
  private String fractionalPart = "";
  private boolean inFractionalPart;
  private boolean closed;

  public NumberEntry(Digit digit) {
    if (digit == Digit.POINT) {
      inFractionalPart = true;
    } else {
      integerPart = digit.getDisplayValue();
    }
  }
  
  public static NumberEntry fromDouble(double number) {
    String value = Double.toString(number);
    String[] numbers = value.split("\\.");
    String integerPart = numbers[0];
    NumberEntry entry = new NumberEntry(integerPart);
    if (numbers.length > 0 && Integer.parseInt(numbers[1]) != 0) {
      entry.fractionalPart = numbers[1];
      entry.inFractionalPart = true;
    }
    return entry;
  }
  
  private NumberEntry(String integerPart) {
    this.integerPart = integerPart;
  }

  @Override
  public void updateState(Stack<State> stack, Digit digit) {
    if (closed) {
      stack.clear();
      stack.push(new NumberEntry(digit));
    } else if (inFractionalPart) {
      if (digit != Digit.POINT) {
        fractionalPart += digit.getDisplayValue();
      }
    } else if (digit == Digit.POINT) {
      inFractionalPart = true;
    } else if (integerPart.equals("0")) {
      integerPart = digit.getDisplayValue();
    } else {
      integerPart += digit.getDisplayValue();
    }
  }

  @Override
  public void updateState(Stack<State> stack, Operator operator) {
    if (stack.size() < 3) {
      addOperatorEntry(stack, operator);
      return;
    }
    // stack.pop() is us but we need to get it out of the way
    double rhs = stack.pop().getValue();
    if (operator == Operator.PLUS 
        || operator == Operator.MINUS
        || operator == Operator.EQUALS) {
      while (stack.size() > 0) {
        State op = stack.pop();
        double lhs = stack.pop().getValue();
        rhs = op.getOperator().evaluate(lhs, rhs);
      }
    } else if (operator == Operator.TIMES || operator == Operator.DIVIDE) {
      while ((stack.peek().getOperator() == Operator.TIMES)
          || (stack.peek().getOperator() == Operator.DIVIDE)) {
        State op = stack.pop();
        double lhs = stack.pop().getValue();
        rhs = op.getOperator().evaluate(lhs, rhs);
        if (stack.size() == 0) {
          break;
        }
      }
    }
    stack.push(NumberEntry.fromDouble(rhs));
    addOperatorEntry(stack, operator);
  }
  
  private void addOperatorEntry(Stack<State> stack, Operator operator) {
    if (operator == Operator.EQUALS) {
      ((NumberEntry)stack.peek()).closed = true;
    } else if (operator != Operator.NONE) {
      stack.push(new OperatorEntry(operator));
    }
  }
  
  @Override
  public String getDisplayValue() {
    return integerPart + "." + fractionalPart;
  }
  
  @Override
  public double getValue() {
    return Double.parseDouble(getDisplayValue());
  }

  @Override
  public String getStackValue(Stack<State> stack) {
    return getDisplayValue(); 
  }
}
