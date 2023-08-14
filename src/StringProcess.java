public class StringProcess {
    public int numberDigits(String str) {
        int digit = 0;
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (Character.isDigit(currentChar)) {
                digit++;
            }
        }
        return digit;
    }
}
