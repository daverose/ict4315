package calculator;

import java.util.Stack;

public enum Clear implements Token {
  CLEAR("C") {
    @Override
    public void clear(Stack<State> stack) {
      State top;
      do {
        top = stack.pop();
      } while (top instanceof OperatorEntry);
    }
  },
  ALL_CLEAR("AC") {
    @Override
    public void clear(Stack<State> stack) {
      stack.clear();
    }
  },
  
  ;
  
  private String label;
  private Clear(String label) {
    this.label = label;
  }

  @Override
  public String getDisplayValue() {
    return label;
  }
  
  public abstract void clear(Stack<State> stack);

}
