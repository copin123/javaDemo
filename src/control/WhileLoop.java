public class WhileLoop {
  public static void main(String[] args) {
    System.out.println("This will demo a while loop");

    int stopVal = 0;
    while (stopVal < 10){
      System.out.println("the loop value is "+stopVal);
      stopVal++;
    }

    System.out.println("another while loop");
    boolean keepLooping = true;
    while (keepLooping) {
      System.out.println("inside while loop");
      keepLooping = false;
    }
  }
}
