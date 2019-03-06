
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
String m = "\"Look here!\"";
System.out.println(m.length());
System.out.println(m.substring(0,12) + "has" + " " +  m.length() + " " + "characters" + ".");
System.out.println("All \"good\" men should to the aid of their country.");
System.out.println("Hello \nHello again");
System.out.println("A backslash looks like this \\, ...right?");
String pq = "Eddie Haskel";
int hm = pq.length();
String ed = pq.substring(hm-4);
System.out.println(ed);

String s1 = "Allan Alda";
String s2 = "John Wayne";
String s3 = "Gregory Peck";
int i1 = s1.length();
String s1a = s1.substring(i1-8);
System.out.println(s1a);
int i2 = s2.length();
String s2a = s2.substring(i2-8);
System.out.println(s2a);
	}
}
