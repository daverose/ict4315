package calculator;

public enum Character implements Token {
  PERCENT("%");
  
  private String character;
  private Character(String character) {
    this.character = character;
  }

  @Override
  public String getDisplayValue() {
    return character;
  }
}
