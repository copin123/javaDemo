public class RandomNumberGuesser {

  public static void main(String[] args) {
    int answer = 7;

    int myGuess = Integer.parseInt(args[0]);
    String results = guesser(myGuess, answer);
    System.out.println(results);
  }

  public static String guesser(int myGuess, int actual ) {
    if (myGuess < actual) {
      return "Your guess of "+ myGuess +" is less than the answer, try again";
    } else if (myGuess > actual) {
      return "your guess of "+ myGuess +" is more than the answer, try agian";
    } else {
      return "You Got it, your guess of "+ myGuess + " is correct!";
    }
  }
}
