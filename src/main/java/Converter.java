public class Converter {
    public String convert(int number) {

        String romanNumber = "";
        if (number >= 10) {
            romanNumber += "X";
            number -= 10;
        }
        if (number == 9) {
            return "IX";
        } else if (number >= 5) {
            romanNumber += "V";
            number -= 5;
        } else if (number == 4) {
            return "IV";
        }

        for (int i = 0; i < number ; i++) {
            romanNumber += "I";
        }

        return romanNumber;
    }
}
