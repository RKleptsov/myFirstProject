import java.sql.SQLOutput;
public class Main {
    public static void main(String[] args) {

      Calculator calculator = new Calculator();

        for (int i = 0; i < TestNabor.array1.length; i++) {}
        System.out.print(Calculator.summa(TestNabor.array1[1],TestNabor.array1[0])+" ");
        System.out.println(Calculator.summa(TestNabor.array1[3], TestNabor.array1[2]));

        for (int i = 0; i < TestNabor.array2.length; i++) {}
        System.out.print(Calculator.ymnoj(TestNabor.array2[2], TestNabor.array2[0])+" ");
        System.out.println(Calculator.ymnoj(TestNabor.array2[3], TestNabor.array2[1]));

        int i = 0;
        while (i < TestNabor.array3.length) {
            i++;
        }
        System.out.print(Calculator.vichit(TestNabor.array3[1], TestNabor.array3[0]) + " ");
        System.out.println(Calculator.vichit(TestNabor.array3[2],TestNabor.array3[3]));

        int ii = 0;
        while (ii < TestNabor.array4.length) {
            ii++;
        }
        System.out.print(Calculator.delen(TestNabor.array4[0], TestNabor.array4[1]) + " ");
        System.out.println(Calculator.delen(TestNabor.array4[2],TestNabor.array4[3]));
    }
}

