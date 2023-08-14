import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

      Calculator calculator = new Calculator();
      DataProvider data = new DataProvider();
      Generator generator = new Generator();
      StringProcess digits = new StringProcess();
      System.out.println(generator.generatorStroki(10));
      System.out.println(digits.numberDigits("ffds322d11"));

        data.setArray1(generator.generateRandomArray(4));
        System.out.println(Arrays.toString(data.getArray1()));
        data.setArray2(generator.generateRandomArray(4));
        System.out.println(Arrays.toString(data.getArray2()));
        data.setArray3(generator.generateRandomArray(4));
        System.out.println(Arrays.toString(data.getArray3()));
        data.setArray4(generator.generateRandomArray(4));
        System.out.println(Arrays.toString(data.getArray4()));

        for (int i = 0; i < data.getArray1().length; i+=2) {
              System.out.print(calculator.summa(data.getArray1()[i],+ data.getArray1()[i+1]) + " " );
        }
        System.out.println(); // для удобства просмотра вывода, ты говорил сделать в цикл проверку, но чет не выходит, я еще подумаю над этим
        for (int i = 0; i < data.getArray2().length; i+=2) {
          System.out.print(calculator.ymnoj(data.getArray2()[i], data.getArray2()[i+1]) + " ");
        }
        System.out.println();
        int i = 0;
        while (i < data.getArray3().length) {
          System.out.print(calculator.vichit(data.getArray3()[i], data.getArray3()[i+1]) + " ");
            i+=2;
        }
        System.out.println();
        int ii = 0;
        while (ii < data.getArray4().length) {
          System.out.print(calculator.delen(data.getArray4()[ii], data.getArray4()[ii+1]) + " ");
            ii+=2;
        }
    }
}


