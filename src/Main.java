import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Main {
  public static void main(String[] args) {
    DataProvider data = new DataProvider();
    Generator generator = new Generator();
    StringProcess digits = new StringProcess();
    data.setStr(generator.generatorStroki(10));

    CsvManipulator csvManipulator = new CsvManipulator();
    csvManipulator.readCsvFile("E://JavaFiles//aaff.csv");
    csvManipulator.createNewCsv("E://JavaFiles//new_file.csv");
    csvManipulator.updateCsv(0, 0, "1");
    csvManipulator.editCsv("E://JavaFiles//newFFF.csv");
    csvManipulator.searchCsvFile("E://JavaFiles//newFFF.csv");
    csvManipulator.deleteCsv("E://JavaFiles//new_file.csv");

    try {
      digits.numberDigits(data.getStr());
    } catch (Errors e) {
      System.out.println("ПОЙМАЛ: " + e.getMessage());
    }
    Stack<Character> stack = new Stack<>();
    List<Character> nonDigits = new ArrayList<>();
    int errorCount = 0;
    for (int i = 9; i >= 0; ) {
      try {
        char generatedChar = generator.generateRandomCharacter();
        int digitValue = Character.getNumericValue(generatedChar);
        if (digitValue != i) {
          nonDigits.add(generatedChar);
          throw new Errors(Enum.NeTotSimvol.getError());
        } else {
          stack.push(generatedChar);
          i--;
        }
      } catch (Errors e) {
        System.out.println("ПОЙМАЛ " + e.getMessage());
        errorCount++;
      }
    }
    while (!stack.isEmpty()) {
      System.out.print(stack.pop() + " ");
    }
    int size = nonDigits.size();
    assert errorCount == size;
  }
}




