
import java.util.Date;

public class Human {
	
	private String firstName;
	private String secondName;
	private Date birthday;
	private Gender gender;
	
	public Human(String firstName, String secondName, Date birthday, Gender gender){
		this.firstName = firstName;
		this.secondName = secondName;
		this.birthday = birthday;
		this.gender = gender;
		
		System.out.println("Created object: " + this.getClass().getSimpleName());
	}
	
	public void printInfo(){}
	
}