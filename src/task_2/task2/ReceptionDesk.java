
import java.util.HashSet;
import java.util.Set;

public class ReceptionDesk {

	private Set<Patient> setPatient;
	
	public ReceptionDesk(){
		this.setPatient = new HashSet<>();
		
		System.out.println("Created object: " + this.getClass().getSimpleName());
	}
	
	public Patient createPatient(){return null;}
	
	public Patient findPatient(long id){return null;}
	
	public void removePatient(Patient patient){}
	
	public Ticket createTicket(Patient patient){return null;}

}