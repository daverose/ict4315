package calculator;

public enum Operator implements Token {
  NONE("") {
    @Override
    public double evaluate(double lhs, double rhs) {
      return 0;
    }
  },
  PLUS("+") {
    @Override
    public double evaluate(double lhs, double rhs) {
      return lhs + rhs;
    }
  },
  MINUS("-") {
    @Override
    public double evaluate(double lhs, double rhs) {
      return lhs - rhs;
    }
  },
  TIMES("x") {
    @Override
    public double evaluate(double lhs, double rhs) {
      return lhs * rhs;
    }
  },
  DIVIDE("/") {
    @Override
    public double evaluate(double lhs, double rhs) {
      return lhs / rhs;
    }
  },
  EQUALS("=") {
    @Override
    public double evaluate(double lhs, double rhs) {
      return rhs;
    }
  },
  
  
  ;
  
  private String operator;
  private Operator(String operator) {
    this.operator = operator;
  }

  @Override
  public String getDisplayValue() {
    return operator;
  }
  
  public abstract double evaluate(double lhs, double rhs);
}
