import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CsvManipulator {
    public void readCsvFile(String filePath) {
        String line = "";
        String splitBy = ",";
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            while ((line = br.readLine()) != null) {
                String[] chtoto = line.split(splitBy);
                System.out.println("1 = " + chtoto[0] + ", 2 = " + chtoto[1] + ", 3 = " + chtoto[2]);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public boolean createNewCsv (String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.append("raz,dva,tri\n");
            fileWriter.close();
            System.out.println("ксв файл создан");
            return true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
    public String filePath = "E://JavaFiles//new_file.csv";
    public boolean updateCsv(int columnToUpdate, int lineToUpdate, String valueToUpdate) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(filePath));
            if (lineToUpdate >= 0 && lineToUpdate < lines.size()) {
                String[] columns = lines.get(lineToUpdate).split(",");
                if (columnToUpdate >= 0 && columnToUpdate < columns.length) {
                    columns[columnToUpdate] = valueToUpdate;
                    lines.set(lineToUpdate, String.join(",", columns));
                    Files.write(Paths.get(filePath), lines);
                    System.out.println("ксв файл обновлен");
                    return true;
                }
            }
            throw new Errors(Enum.StringNotFound.getError());
        } catch (IOException | Errors e) {
            System.out.println("ПОЙМАЛ: " + e.getMessage());
        }
        return false;
    }
    public boolean deleteCsv(String filePath) {
        File file = new File(filePath);
        try {
            file.delete();
            System.out.println("ксв файл удален");
            return true;
        } catch (Exception e) {
            System.out.println("ксв файл НЕ удален " + e.getMessage());
        }
        return false;
    }
    public boolean editCsv(String newFilePath) {
        File currentFile = new File(filePath);
        File newFile = new File(newFilePath);
        try {
            currentFile.renameTo(newFile);
            System.out.println("ксв файл переименован");
            return true;
        } catch (Exception e) {
            System.out.println("ошибка " + e.getMessage());
        }
        return false;
    }
    public boolean searchCsvFile(String fileName) {
        File file = new File(fileName);
        try {
            if (!file.exists()) {
                throw new Errors(Enum.FileNotFound.getError());
            }
            System.out.println("файл найден");
            return true;
        } catch (Errors e) {
            System.out.println("ПОЙМАЛ: " + e.getMessage());
            return false;
        }
    }
}
