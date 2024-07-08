import java.util.*;
import java.io.*;

public class Reader {

  public static Machine[] machines(String fname) {
    Scanner sc = null;
    try { sc = new Scanner(new FileReader(fname)); } 
    catch(IOException e) { e.printStackTrace(); System.exit(1); }
    String mask = sc.next();
    int n = mask.length();
    Machine[] m = new Machine[n];
    for(int i = 0; i < n; i++) {
      String kind = sc.next();
      if (kind.equals("yoda")) {
	double p = sc.nextDouble();
	double b = sc.nextDouble();
	double x = sc.nextDouble();
	m[i] = new Yoda(p,b,x);
      }
      else {
	double b = sc.nextDouble();
	double x = sc.nextDouble();
	m[i] = new Pirate(b,x);	  
      }	  
    }
    return m;
  }  
}
