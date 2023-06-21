import java.util.Random;

public class Generator {
   static int getIntGenerator (int min, int max) {
      Random random = new Random();
      return random.nextInt(max - min + 1) + min;
   }
//   public void Gener() {
//      Random random = new Random();
//      for (int i = 0; i<100; i++) {
//         System.out.println(random.nextInt(10));
//      }
//   }
}



