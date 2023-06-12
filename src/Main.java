import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {

      Calculator calculator = new Calculator();
      TestNabor test = new TestNabor();

        for (int i = 0; i < test.getArray1().length; i+=2) {
          System.out.print(calculator.summa(test.getArray1()[i], test.getArray1()[i+1])+" ");
        }

        for (int i = 0; i < test.array2.length; i+=2) {
          System.out.print(calculator.ymnoj(test.array2[i], test.array2[i+1])+" ");
        }

        int i = 0;
        while (i < test.array3.length) {
          System.out.print(calculator.vichit(test.array3[i], test.array3[i+1]) + " ");
            i+=2;
        }

        int ii = 0;
        while (ii < test.array4.length) {
          System.out.print(calculator.delen(test.array4[ii], test.array4[ii+1]) + " ");
            ii+=2;
        }
    }
}

