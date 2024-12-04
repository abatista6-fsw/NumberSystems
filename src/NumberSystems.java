/**
 * Program that performs interesting conversions between the data types and number systems supported in Java
 * @author Andrew Batista
 * @version 1.0
 */
public class NumberSystems {

    /**
     * The main entry point for the binary value.
     */
    public static void main(String[] args) throws Exception {

        System.out.println("Type in a binary value (VALUE MUST BE FROM 1-16 DIGITS): ");
        int number = userNumberInput();
        octalValue(number);
        decimalValue(number);
        hexValue(number);

    }

    /**
     * The three methods below display the numbers in octal,
     * decimal, and hexadecimal formats respectively.
     */
    public static void octalValue (int number) {
        System.out.printf("Octal: %o\n", number);
    }

    public static void decimalValue (int number) {
        System.out.printf("Decimal: " + number);
    }

    public static void hexValue (int number) {
        System.out.printf("  Hex: %h\n", number);
    }

    /**
     * @return Returns the binary value in octal, decimal, and hexadecimal forms.
     * @throws Exception Makes sure that the input binary number has 0's and 1's,
     * and is no more than 16 characters long.
     */
    private static int userNumberInput() throws Exception {
        int number = 0;
        int currentChar;
        while ((currentChar = System.in.read()) != '\n') {
            int inputNumber = currentChar - '0';
            if (inputNumber < 0 || inputNumber > 1)
                throw new Exception("Binary numbers can only have 0's or 1's.");
            int place = System.in.available()-1;
            if (place > 15)
                throw new Exception("Binary numbers can only have a maximum of 16 characters.");
            number += inputNumber << place;
        }
        return number;
    }
}
