
import java.util.Date;

public class Ticket {
	
	private long id;
	private String doctor;
	private Date dateVisit;
	private Patient patient;
	
	public Ticket(long id, String doctor, Date dateVisit, Patient patient){
		this.id = id;
		this.doctor = doctor;
		this.dateVisit = dateVisit;
		this.patient = patient;
		
		System.out.println("Created object: " + this.getClass().getSimpleName());
	}
	
	public void ptintTicket(){}
	
}