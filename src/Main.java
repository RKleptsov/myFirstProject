import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
      Calculator calculator = new Calculator();
      DataProvider data = new DataProvider();
      Generator generator = new Generator();
      StringProcess digits = new StringProcess();
      data.setStr(generator.generatorStroki(10));
      digits.numberDigits(data.getStr());
      data.setArray1(generator.generateRandomArray(4));
      data.getArray1();
      data.setArray2(generator.generateRandomArray(4));
      data.getArray2();
      data.setArray3(generator.generateRandomArray(4));
      data.getArray3();
      data.setArray4(generator.generateRandomArray(4));
      data.getArray4();
        for (int i = 0; i < data.getArray1().length; i+=2) {
              calculator.summa(data.getArray1()[i],+ data.getArray1()[i+1]);
        }
        for (int i = 0; i < data.getArray2().length; i+=2) {
         calculator.ymnoj(data.getArray2()[i], data.getArray2()[i+1]);
        }
        int i = 0;
        while (i < data.getArray3().length) {
          calculator.vichit(data.getArray3()[i], data.getArray3()[i+1]);
            i+=2;
        }
        int ii = 0;
        while (ii < data.getArray4().length) {
          calculator.delen(data.getArray4()[ii], data.getArray4()[ii+1]);
            ii+=2;
        }
    }
}


