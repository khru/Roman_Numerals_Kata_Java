public class Converter {
  public String convert(int number) {

    StringBuilder romanNumber = new StringBuilder();
    if (number >= 10) {
      romanNumber.append(concatenateSymbols(number / 10, "X"));
      number %= 10;
    }
    if (number == 9) {
      romanNumber.append("IX");
      number -= 9;
    } else if (number >= 5) {
      romanNumber.append("V");
      number -= 5;
    } else if (number == 4) {
      romanNumber.append("IV");
      number -= 4;
    }

    romanNumber.append(concatenateSymbols(number, "I"));

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
