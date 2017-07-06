public class Mobs {

  public String name;
  public int numberOfLegs;
  public int hitPoints;

  public Mobs(String name, int numberOfLegs, int hitPoints){
    this.name = name;
    this.numberOfLegs = numberOfLegs;
    this.hitPoints = hitPoints;
  }

  public String getName() {
    return name;
  }

  public int getNumberOfLegs() {
    return numberOfLegs;
  }

  public int getHitPoints() {
    return hitPoints;
  }
  public void decrementHitPoints(int ammount) {
    hitPoints -= ammount;
  }

  public String toString(){
    return "mob name is: " + getName() +
      "\nmob have " + getNumberOfLegs() + " legs."+
      "\nmob also have " + getHitPoints() + " hit points.";

  }

}
