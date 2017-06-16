public class CaseLogic {
  public static void main(String[] args) {
    char caseVal = args[0].charAt(0);
    switch(caseVal){
      case 'a':
        printIt("your case was a");
        break;
      case 'b':
        printIt("your case was b");
        break;
      default:
        printIt("default case");
        break;
    }

  }
  public static void printIt(String val) {
    System.out.println(val);
  }
}
