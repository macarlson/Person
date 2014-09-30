
public class Student extends Person {
	
	enum Status {
		FREESHMAN, SOPHOMORE, JUNIOR, SENIOR
	}
	
	public String toString(){
		return "This class name is Student and the person's name is " + Person.getName();}

}
