/**
 * Created by james on 6/28/17.
 */
public class TernaryLogic {
    public static void main(String[] args) {
        String[] flavorsOfIceCream = {"chocolate", "vanilla", "strawberry", "shnosberry"};
        String bestFlavor = "";

        for (String flavor : flavorsOfIceCream) {
            bestFlavor += (flavor == "chocolate") ? flavor + " is the best flavor ever\n" : flavor + " is ok\n";
        }
        printFunction(bestFlavor);
    }

    public static void printFunction(String mess) {
        System.out.println(mess);
    }
}