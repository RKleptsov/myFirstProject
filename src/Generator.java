import java.util.Random;

public class Generator {
    public String generatorStroki(int n) {
        Random random = new Random();
        String stroka = "";
        for (int i = 0; i < n; i++) {
            int monetka = random.nextInt(2);
            if (monetka == 0) {
                char randomChar = (char) (random.nextInt(26) + 'a');
                stroka += randomChar;
            } else {
                int randomNumber = random.nextInt(10);
                stroka += randomNumber;
            }
        }
        return stroka.toString();
    }
    public char generateRandomCharacter() {
        Random random = new Random();
        int randomValue = random.nextInt(36);
        char randomChar;
        if (randomValue < 10) {
            randomChar = (char) (randomValue + '0');
        } else {
            randomChar = (char) (randomValue - 10 + 'a');
        }
        return randomChar;
    }
}

