
public class TestCustomer {
	public static void main(String[] args) {
		Customer customer = new Customer();
		customer.setCustomerName("Simran");
		customer.setResidentialAddress("!st main layout");
		System.out.println("Customer Name :"+customer.getCustomerName());
		System.out.println("Residential Address :"+customer.getResidentialAddress());
		
		Customer customer1 = new Customer("Anamika","@nd layout");
		customer1.getCustomerDetails();
	}

}
