
import java.util.Random;
import java.util.Scanner;

public class WhileLoop {
  public static void main(String[] args) {
    System.out.println("This will demo a while loop");

    int stopVal = 10;
    while (stopVal > 0){
      System.out.println("  the loop value is "+stopVal);
      if(stopVal % 2 == 0) {
        System.out.println(stopVal+" is even");
      } else {
        System.out.println(stopVal +" is odd.");
      }
      stopVal--;
    }

    System.out.println("another while loop");
    boolean keepLooping = true;
    while (keepLooping) {
      System.out.println("  inside while loop");
      keepLooping = false;
    }

    //now input test
    boolean isGuessed = false;
    Scanner keyboard = new Scanner(System.in);
    //int randNum = 77;
    int randNum = getRandNumber(1, 100);
    while(!isGuessed) {
      System.out.println("enter an integer");
      int myInt = keyboard.nextInt();
      if(myInt < randNum){
        print("your number, "+myInt+" is less than the number.");
      } else if(myInt > randNum) {
        print("your number, "+myInt+" is greater than the number.");
      } else {
        print("Wow, you got it! "+myInt+" is equal to "+randNum+"!");
        isGuessed = true;
      }
    }
  }
  public static int getRandNumber(int fromNum, int toNum){
    Random r = new Random();
    return r.nextInt(toNum-fromNum) + fromNum;
  }
  public static void print(String msg) {
    System.out.println(msg);
  }

}
