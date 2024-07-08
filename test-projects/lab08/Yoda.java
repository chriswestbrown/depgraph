public class Yoda extends Machine {

  public Yoda(double prob, double initialMoney, double payout) {
    super(new MechModelB(prob,'ⓗ','ⓣ'),
	  new MoneyModel(initialMoney,payout),
	  "Strong is the Force in this one.  Won you have.",
	  "There is no win, only lose or lose not.  Lost you did."
	  );
  }
  public String getName() { return "Yoda"; }
}
  
