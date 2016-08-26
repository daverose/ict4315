package calculator;

import java.util.Stack;

public class OperatorEntry extends State {

  private Operator operator;
  public OperatorEntry(Operator operator) {
    this.operator = operator;
  }

  @Override
  public void updateState(Stack<State> stack, Digit digit) {
    stack.push(new NumberEntry(digit));
  }
  
  @Override
  public void updateState(Stack<State> stack, Operator operator) {
    if (operator == Operator.EQUALS) {
      stack.pop();
      stack.peek().updateState(stack, operator);
    }
    this.operator = operator;
  }
  
  @Override
  public String getDisplayValue() {
    return operator.getDisplayValue();
  }
  
  @Override
  public Operator getOperator() {
    return operator;
  }

  @Override
  public String getStackValue(Stack<State> stack) {
    return stack.get(stack.size() - 2).getStackValue(stack);
  }
}
