import java.util.*;

public class Lab08 {

  public static void main(String[] args) {
    if (args.length < 2) {
      System.out.println("usage java Lab08 <initWallet> <setupFile>");
      System.exit(0);
    }
    double initWallet = Double.parseDouble(args[0]);
    Machine[] m = Reader.machines(args[1]);
    Manager man = new Manager(m,initWallet);
    Scanner sc = new Scanner(System.in);
    man.draw();
    System.out.print("> ");
    String comm = sc.next();
    while(!comm.equals("quit")) {
      man.exec(comm);
      man.draw();
      System.out.print("> ");
      comm = sc.next();
    }
  }
}
