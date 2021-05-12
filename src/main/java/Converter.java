public class Converter {
  private int numbers[] = {10, 9, 5, 4, 1};
  private String symbols[] = {"X", "IX", "V", "IV", "I"};

  public String convert(int number) {

    StringBuilder romanNumber = new StringBuilder();

    for (int i = 0; i < numbers.length; i++) {
      romanNumber.append(concatenateSymbols(number / numbers[i], symbols[i]));
      number %= numbers[i];
    }
    return romanNumber.toString();
  }

  private String concatenateSymbols(int number, String symbol) {
    StringBuilder romanNumber = new StringBuilder();
    for (int i = 0; i < number; i++) {
      romanNumber.append(symbol);
    }
    return romanNumber.toString();
  }
}
