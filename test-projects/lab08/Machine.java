public class Machine {

  private MechModel mech;
  private MoneyModel money;
  private String wmsg, lmsg;

  public Machine(MechModel mech, MoneyModel money, String wmsg, String lmsg) {
    this.mech = mech;
    this.money = money;
    this.wmsg = wmsg;
    this.lmsg = lmsg;
  }
  
  public boolean inService() { return money.inService(); }
  public void report() { System.out.println(money.report()); }
  public double play() {
    boolean win = mech.play();
    double amt = money.record(win);
    System.out.println(win ? wmsg + " --> $" + amt : lmsg);
    return win ? amt : -999;
  }
  public String getName() { return "Basic"; }
}
