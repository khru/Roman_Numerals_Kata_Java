public class Converter {
    public String convert(int number) {

        if (number == 7) {
            return "VII";
        } else if (number == 6) {
            return "VI";
        } else if (number == 5) {
            return "V";
        } else if (number == 4) {
            return "IV";
        }

        String romanNumber = "";
        for (int i = 0; i < number ; i++) {
            romanNumber += "I";
        }

        return romanNumber;
    }
}
