public class Pirate extends Machine {

  public Pirate(double initialMoney, double payout) {
    super(new MechModelA("♈✋⛵"),
	  new MoneyModel(initialMoney,payout),
	  "You've won and taken me treasure, scaliwag!",
	  "Arrrr, you lost, matey!"
	  );
  }
  public String getName() { return "Pirate"; }
}

