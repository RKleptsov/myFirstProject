import java.util.Random;

public class Generator {
    DataProvider dataProvider = new DataProvider();
    public int[] generateRandomArray(int n) {
        Random random = new Random();
        int [] array = new int[n];
        for (int i = 0; i<n; i++) {
            array[i] = random.nextInt(101);
        }
        return array;
    }
}






