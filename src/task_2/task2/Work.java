
public class Work {
	
	private String company;
	private Address address;
	
	public Work(String company, Address address){
		this.company = company;
		this.address = address;
		
		System.out.println("Created object: " + this.getClass().getSimpleName());
	}
	
	public String getInfoWork(){return null;}
	
}