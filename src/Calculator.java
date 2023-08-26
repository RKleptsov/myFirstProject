
public class Calculator  {
        int summa (int a, int b) {
            return a + b;
        }
        int vichit (int a, int b) {
            return a - b;
        }
        int ymnoj (int a, int b) {
            return a * b;
        }
        int delen (int a, int b) throws Errors {
            if (b == 0) {
                throw new Errors(Enum.ByZero.getError());
            }
            if (a % b != 0) {
                int c = a % b;
                int d = (a - c) / b;
                return d;
            } else return a / b;
        }
    }

