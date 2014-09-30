
public class Person {
	
	private static String name;
	private String address;
	private String phoneNumber;
	private String email;
	
	public static String getName(){
		return name;
	}
	
	public String toString(){
		return "This class name is Person and the person's name is " + getName();}

}
