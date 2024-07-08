import java.util.*;
public class MechModelA extends MechModel {
  private String wheelChars;
  public MechModelA(String wheelChars) {
    this.wheelChars = wheelChars;
  }

  public boolean play() {
    char[] res = new char[3];
    for(int i = 0; i < res.length; i++)
      res[i] = wheelChars.charAt(rand.nextInt(wheelChars.length()));
    System.out.print("Machine:  " + res[0] + res[1] + res[2] + "  ");
    return res[0] == res[1] && res[1] == res[2];
  }
}
