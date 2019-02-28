
public class stringmanipulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String myName = "ManmeetSingh";
		int nameLength = myName.length();
		System.out.println(nameLength-1);

System.out.println(myName.substring(7));
	
String lName = myName.substring(7);

String fName = myName.substring(0,7);
System.out.println(fName + " " + lName);
System.out.println(fName);

System.out.println("a\ta");
System.out.println("a\"t");
System.out.println("a\\\\");
System.out.println("\\\n\\");

System.out.println("I \"love\" \n");

String s = "The number of rabbits is";
int argh = 129;
System.out.println(s + " "+ argh + ".");
String g = "Computer Science is for nerds";
System.out.println(g.substring(0,29).toLowerCase());
String m = "Look here!";
System.out.println(m.length());
	}
}
