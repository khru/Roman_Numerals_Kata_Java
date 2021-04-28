public class Converter {
    public String convert(int number) {
        if (number == 4) {
            return "IV";
        }
        if (number == 3) {
          return "III";
        } else if (number == 2) {
            return "II";
        }

        return "I";
    }
}
