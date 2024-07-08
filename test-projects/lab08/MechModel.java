import java.util.*;
public class MechModel {
  protected static Random rand = new Random();
  public boolean play() {
    double x = rand.nextDouble();
    if (x < 0.5) {
      System.out.println("AAA");
      return true;
    }
    else {
      System.out.println("BAA");
      return false;
    }
  }
  
}
