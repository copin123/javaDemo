public class CallFunction {
  public static void main(String[] args) {
    System.out.println("I'm going to call a function");

    String message = "this will be called from printFunction";
    printFunction(message);
  }

  public static void printFunction(String mess) {
    System.out.println(mess);
  }
}
