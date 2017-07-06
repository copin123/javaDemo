public class Creeper extends Mobs {
  public int explodeDamage;

  public Creeper(String name, int numberOfLegs, int hitPoints, int explodeDamage){
    super(name, numberOfLegs, hitPoints);
    this.explodeDamage = explodeDamage;
  }
  public int getExplodeDamage() {
    return explodeDamage;
  }

  public String toString(){
    return super.toString() +
      "\ncreepers also cause " + getExplodeDamage() + " points of hit damage.";

  }

}
