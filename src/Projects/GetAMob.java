public class GetAMob {
  public static void main(String[] args) {
    Mobs spyder = new Mobs("spyder", 8, 50);
    print(spyder.toString());

    print("\n\n");

    Creeper creeper = new Creeper("Joe", 4, 80, 20);
    print(creeper.toString());
  }
  public static void print(String msg) {
    System.out.println(msg);
  }
}
