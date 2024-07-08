public class MoneyModel {

  double forCasino, originalpot, pot, x;
  double count = 0;

  public MoneyModel(double initialMoney, double payout) {
    forCasino = 0;
    originalpot = pot = initialMoney;
    x = payout;
  }
  
  public boolean inService() { return pot >= x; }
  public double record(boolean win) {
    ++count;
    if (count % 2 == 1)
      forCasino += 0.25;
    else
      pot += 0.25;
    if (!win) {
      return 0;
    }
    else {
      pot -= x;
      return x;
    }
  }

  public String report() {
    return "casino: $" + forCasino + ", pot: $" + pot + ", net: $" + ((pot - originalpot) + forCasino);
  }  
}
