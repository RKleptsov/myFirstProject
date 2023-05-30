
public class Calculator {
    public int summa;
    public int vichit;
    public int ymnoj;
    public int delen;
    public Calculator() {
        this.summa = summa;
        this.vichit = vichit;
        this.ymnoj = ymnoj;
        this.delen = delen;
    }
    public static int summa(int a, int b) {
        return a + b;
    }
    public static int vichit(int a, int b) {
        return a - b;
    }
    public static int ymnoj(int a, int b) {
        return a * b;
    }
    public static int delen(int a, int b) {
        if (a % b != 0) {
            int c = a % b;
            int d = (a - c) / b;
            return d;
        } else return a / b;
    }
}






