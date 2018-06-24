
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Patient extends Human {
	
	private long id;
	private Address address;
	private Blood blood;
	private Work work;
	private Set<Ticket> setTicket;

	public Patient(String firstName, String secondName, Date birthday, Gender gender, long id, Address address, Blood blood, Work work){
		super(firstName, secondName, birthday, gender);

		this.id = id;
		this.address = address;
		this.blood = blood;
		this.work = work;
		this.setTicket = new HashSet<>();
		
		System.out.println("Created object: " + this.getClass().getSimpleName());
	}

	public void addTicket(Ticket ticket){}
	
	public Address updateAddress(){return null;}
	
	public Work updateWork(){return null;}
	
	public void takeTests(){}
	
	public void takeMedicine(){}
	
	public void printAllPatientInformation(){}
	
	public String getAllPatientInformation(){return null;}

}