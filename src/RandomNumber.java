import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {
      int maxNum = 8;
      Random random = new Random();
      System.out.println("random number = "+random.nextInt(8));

      //ranged
      int minNum = 3;
      int value = random.nextInt(maxNum - minNum) + minNum;
      System.out.println("random number between "+maxNum +" and "+minNum+" = "+value);
    }
}
