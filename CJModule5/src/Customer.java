
public class Customer {
	private String customerName;
	private String residentialAddress;
      
	Customer(){
	
	}
	Customer(String customerName,String residentialAddress){
		this.customerName = customerName;
		this.residentialAddress = residentialAddress;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public void setResidentialAddress(String residentialAddress) {
		this.residentialAddress = residentialAddress;
	}
	public String getCustomerName() {
		return customerName;
	}
	public String getResidentialAddress() {
		return residentialAddress;
	}
	void getCustomerDetails() {
		System.out.println("Customer Name :"+customerName);
		System.out.println("Residential Address :"+residentialAddress);
		
	}

	
}
