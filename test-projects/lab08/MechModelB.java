public class MechModelB extends MechModel {

  private double p;
  private char head, tails;
  public MechModelB(double p, char h, char t) {
    this.p = p;
    this.head = h;
    this.tails = t;
  }
  
  public boolean play() {
    double x =  rand.nextDouble();
    boolean win = (x < p);
    //System.out.println(">>> " + x + " " + win);
    System.out.print("Machine: " + (win ? head : tails) + "  ");
    return win;
  }
}
