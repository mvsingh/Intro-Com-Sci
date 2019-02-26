
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
		
	}
}
