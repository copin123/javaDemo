public class CallFunction {
  public static void main(String[] args) {
  getDressed();
    	boolean hasEaten = eat("breakfast");
    }

    public static void getDressed() {
    	print("got dressed");
    }

    public static boolean eat(String meal) {
	boolean hasEaten = false;
    	switch(meal) {
    	case("breakfast"):
    		print("you ate breakfast");
		hasEaten = true;
    		break;
    	case("lunch"):
    		print("you ate Lunch");
		hasEaten = true;
    		break;
    	case("dinner"):
    		print("you ate Dinner");
		hasEaten = true;
    		break;
    	default:
    		print("you ate something….");
		hasEaten = true;
    		break;
    }
    return hasEaten;
  }
    public static void print(String printVal){
    	System.out.println(printVal);
    }

}
