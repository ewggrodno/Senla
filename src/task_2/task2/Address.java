
public class Address {
	
	private String country;
	private String city;
	private String street;
	private int house;
	private int apartment;
	private int postcode;
	
	public Address(String country, String city, String street, int house, int apartment, int postcode){
		this.country = country;
		this.city = city;
		this.street = street;
		this.house = house;
		this.apartment = apartment;
		this.postcode = postcode;
		
		System.out.println("Created object: " + this.getClass().getSimpleName());
	}
	
	public String getInfoAddress(){return null;}
	
}