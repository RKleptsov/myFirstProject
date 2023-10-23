public class StringProcess {
    public int numberDigits(String str) throws Errors {
        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                digit++;
                if (i >= 2 && Character.isDigit(str.charAt(i - 1)) && Character.isDigit(str.charAt(i - 2))) {
                    throw new Errors(Enum.ThreeNumbersInLine.getError());
                }
                if (str.contains("z")) {
                    throw new Errors(Enum.LetterZ.getError());
                    }
                }
            }
        return digit;
    }
}
