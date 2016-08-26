package calculator;

import java.util.Stack;

public class CalculatorStack {
  private Stack<State> stack = new Stack<>();
  
  public CalculatorStack() {
    stack.push(new NumberEntry(Digit.ZERO));
  }
  
  public void updateState(Clear clear) {
    stack.peek().updateState(stack, clear);
  }

  /**
   * There are two possibilities:
   * - The state on top of the stack is a NumberEntry. In that case entering 
   *   a digit will just add to it and it will return itself.
   * - The state on top of the stack is an OperatorEntry. In that case
   *   a new NumberEntry will be returned which we just push onto the stack.
   */
  public void updateState(Digit digit) {
    stack.peek().updateState(stack, digit);
  }

  /**
   * Then there are two possibilities:
   * - The state on top of the stack is a NumberEntry and we may need to 
   *   perform a calculation depending on what else is on the stack. 
   * - The state on top of the stack is an OperatorEntry and then
   *   it will just update the operator.
   */
  public void updateState(Operator operator) {
    stack.peek().updateState(stack, operator);
  }

  /**
   * @param character that was typed
   */
  public void updateState(Character character) {
    
  }
  
  public String getDisplayValue() {
    return stack.peek().getStackValue(stack);
  }
  
  public String evaluate() {
    updateState(Operator.EQUALS);
    return getDisplayValue();
  }
}
