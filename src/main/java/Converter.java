public class Converter {
  public String convert(int number) {

    String romanNumber = "";
    if (number >= 20) {
      return "XX";
    } else if (number >= 10) {
      romanNumber += "X";
      number -= 10;
    }
    if (number == 9) {
      romanNumber += "IX";
      number -= 9;
    } else if (number >= 5) {
      romanNumber += "V";
      number -= 5;
    } else if (number == 4) {
      romanNumber += "IV";
      number -= 4;
    }

    for (int i = 0; i < number; i++) {
      romanNumber += "I";
    }

    return romanNumber;
  }
}
