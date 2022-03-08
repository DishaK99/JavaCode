package petstoreproject.petstoreapp;

public class CustomerService {
	private String serviceHelplineNumber;
	private String name;
	public String getServiceHelplineNumber() {
		return serviceHelplineNumber;
	}
	
	public String getName() {
		return name;
	}
	
	private static CustomerService customerService=new CustomerService();
	private CustomerService()
	{
		this.serviceHelplineNumber="+91637257";
		this.name="Disha";
		
		
	}
	public static CustomerService createCustomerServiceinstance()
	{
		return customerService;
	}
	
	

}
