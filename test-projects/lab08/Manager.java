public class Manager {

  private Machine[] m;
  private int pos = 0;
  private double wallet;

  public Manager(Machine[] m, double wallet) {
    this.m = m;
    pos = 0;
    this.wallet = wallet;
  }

  public double getWallet() { return wallet; }
  
  public void draw() {
    System.out.println("\n<<<<<<< You have $" + getWallet() + ">>>>>>>");
    Draw.show(m,pos);
  }

  public void exec(String mv) {
    if (mv.equals("play")) {
      if (m[pos].inService()) {
	wallet -= 0.25;
	double winAmount = m[pos].play();
	if (winAmount > 0) {
	  wallet += winAmount;
	}
      }
      else
	System.out.println("Sorry, machine not in service");
    }
    else if (mv.equals("left")) {
      if (pos > 0)
	pos--;
    }
    else if (mv.equals("right")) {
      if (pos < m.length-1)
	pos++;
    }
    else if (mv.equals("*report")) {
      for(int i = 0; i < m.length; i++)
	m[i].report();
    }
    
  }
}
