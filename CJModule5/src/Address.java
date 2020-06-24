
public class Address {
   private String addressLine;
   private String city;
   
   Address(String addressLine,String city){
	   this.addressLine = addressLine;
	   this.city = city;
   }
   public void setAddressLine(String addressLine) {
	   this.addressLine = addressLine;
   }
   public void setCity(String city) {
	   this.city = city;
   }
   public String getAddressLine() {
	   return addressLine;
   }
   public String getCity() {
	   return city;
   }
   void getAddressDetail(String addressLine,String city) {
	   addressLine = addressLine;
	   city = city;
   }
}
