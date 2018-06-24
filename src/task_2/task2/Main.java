
import java.util.Date;

public class Main{

	public static void main(String[] args){
		Human human = new Human("Human firstName", "Human seconfName", new Date(83, 3 , 1), Gender.MALE);
		
		Address addressPatient = new Address("Patient country", "Patient city", "Patient street", 1, 2, 3);
		Address addressWork = new Address("Work country", "Work city", "Work street", 4, 5, 6);
		
		Work work = new Work("name Company", addressWork);
		
		Patient patient = new Patient("Human firstName", "Human seconfName", new Date(83, 3 , 1), Gender.MALE,
										1, addressPatient, Blood.O, work);
										
		ReceptionDesk receptionDesk = new ReceptionDesk();
		
		Ticket ticket = new Ticket(1, "Name Doctor", new Date(118, 6, 24), patient);
	}
	
}