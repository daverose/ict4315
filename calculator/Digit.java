package calculator;

public enum Digit implements Token {
  ZERO(0),
  ONE(1),
  TWO(2),
  THREE(3),
  FOUR(4),
  FIVE(5),
  SIX(6),
  SEVEN(7),
  EIGHT(8),
  NINE(9),
  POINT() {
    @Override
    public String getDisplayValue() {
      return ".";
    }
  },
  
  ;

  private final int digit;
  private Digit(int digit) {
    this.digit = digit;
  }
  private Digit() {
    this(0);
  }
  @Override
  public String getDisplayValue() {
    return Integer.toString(digit);
  }

  public int getValue() {
    return digit;
  }
}
