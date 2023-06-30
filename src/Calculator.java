
public class Calculator {

        int summa (int a, int b) {
            return a + b;
        }
        int vichit (int a, int b) {
            return a - b;
        }
        int ymnoj (int a, int b) {
            return a * b;
        }
        int delen (int a, int b) {
            if (a % b != 0) {
                int c = a % b;
                int d = (a - c) / b;
                return d;
            } else return a / b;
        }
    }







