import java.util.*;

public class Main {
  public static void main(String[] args) {
    Calculator calculator = new Calculator();
    DataProvider data = new DataProvider();
    Generator generator = new Generator();
    StringProcess digits = new StringProcess();
    data.setStr(generator.generatorStroki(10));
    data.setArray1(generator.generateRandomArray(4));
    data.setArray2(generator.generateRandomArray(4));
    data.setArray3(generator.generateRandomArray(4));
    data.setArray4(generator.generateRandomArray(4));
    try {
      digits.numberDigits(data.getStr());
    } catch (Errors e) {
      System.out.println("ПОЙМАЛ: " + e.getMessage());
    }
    for (int i = 0; i < data.getArray1().length; i += 2) {
      calculator.summa(data.getArray1()[i], +data.getArray1()[i + 1]);
    }
    for (int i = 0; i < data.getArray2().length; i += 2) {
      calculator.ymnoj(data.getArray2()[i], data.getArray2()[i + 1]);
    }
    int i = 0;
    while (i < data.getArray3().length) {
      calculator.vichit(data.getArray3()[i], data.getArray3()[i + 1]);
      i += 2;
    }
    int ii = 0;
    while (ii < data.getArray4().length) {
      try {
        calculator.delen(data.getArray4()[ii], data.getArray4()[ii + 1]);
      } catch (Errors e) {
        System.out.println("ПОЙМАЛ: " + e.getMessage());
      }
      ii += 2;
    }
    Stack<Character> stack = new Stack<>();
    List<Character> nonDigits = new ArrayList<>();
    int errorCount = 0;
    for (int z = 9; z >= 0; ) {
      try {
        char generatedChar = generator.generateRandomCharacter();// оно не работает через гетор хз почему
        if (generatedChar - '0' != z) {
          nonDigits.add(generatedChar);
          if (generatedChar - '0' != z) {
            throw new Errors(Enum.NeTotSimvol.getError());
          }
        } else {
          stack.push(generatedChar);
          z--;
        }
      } catch (Errors e) {
        System.out.println("ПОЙМАЛ " + e.getMessage());
        errorCount++;
      }
    }
    System.out.println();
    System.out.println("Стек: " + stack);
    System.out.println(nonDigits);
    System.out.println("Количество ошибок: " + Errors.getErrorCount());
    System.out.println("Количество ошибок в стеке: " + errorCount);
    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }
    int size = nonDigits.size();
    System.out.println("Количество элементов в nonDigits: " + size);
    assert errorCount == size; // асерты включил работает
  }
}




