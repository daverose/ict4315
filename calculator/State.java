package calculator;

import java.util.Stack;

public abstract class State {
  
  public double getValue() {
    return 0;
  }
  
  public Operator getOperator() {
    return Operator.NONE;
  }

  public abstract void updateState(Stack<State> stack, Digit digit);
  public abstract void updateState(Stack<State> stack, Operator operator);
  
  public void updateState(Stack<State> stack, Clear clear) {
    clear.clear(stack);
    if (stack.size() == 0) {
      stack.push(new NumberEntry(Digit.ZERO));
    }
  }

  public abstract String getDisplayValue();
  public abstract String getStackValue(Stack<State> stack);

}
