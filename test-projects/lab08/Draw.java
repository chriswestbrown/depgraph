public class Draw {

  public static void show(Machine[] m, int pos) {
    for(int line = 1; line <= 5; line++) {
      for(int i = 0; i < m.length; i++) {
	if (i > 0)
	  System.out.print("   ");
	System.out.print(Draw.drawLine(line, m[i].getName(), (pos == i) ));
      }
      System.out.println();
    }    
  }
  
  public static String drawLine(int i, String name, boolean active) {
    if (i == 1 || i == 5)
      return (active ? "##########" : "----------");
    else if (i == 2 || i == 4)
      return active ? "#        #" : "-        -";
    else {
      String[] pad = {""," ","  ","   ","    "};
      int r = (8 - name.length())/2;
      int l = 8 - name.length() - r;
      String s = (active ? "#" : "-");
      return s + pad[l] + name + pad[r] + s;      
    }
  }

  public static void main(String[] args) {
    String lab1 = "Pirate";
    String lab2 = "Yoda";
    for(int i = 1; i <= 5; i++)
      System.out.println(
			 drawLine(i,lab1,false)
			 + "   " + 
			 drawLine(i,lab1,true)
			 + "   " + 
			 drawLine(i,lab2,false));
  }
}
