public class ForLoop {
  public static void main(String[] args) {
    System.out.println("let's print all numbers between 0 and 10");
    for (int i = 0; i <=10; i++) {
      System.out.println(""+i);
    }

    System.out.println("Now a different kind of for loop");
    int[] numArray = {1,2,3,4,5,6,7,8,9,10};
    for(int numVal : numArray){
      System.out.println(""+numVal);
    }
  }
}
//make a chore doer list that randomly picks chores and crosses them off of a list.
// will need Random and a second array.
