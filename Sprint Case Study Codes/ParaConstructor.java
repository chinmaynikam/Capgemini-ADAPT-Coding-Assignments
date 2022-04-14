class Customer2{
    private int userId;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private String city;
    private String gender;
    private int phoneNumber;

    Customer2(){
        super();
    }

    public Customer2(int userId, String emailId, String password, String firstName, String lastName, String city, String gender, int phoneNumber){
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }
    //for userId
    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }

    //for emailId
    public String getEmailId(){
        return emailId;
    }
    public void setEmailId(String emailId)
    {
        this.emailId = emailId;
    }

    //for password
    public String getPassword(){
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }

    //for firstName
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    //for lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    //for city
    public String getCity(){
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    //for gender
    public String getGender(){
        return gender;
    }
    public void setGender(String gender)
    {
        this.gender = gender;
    }

    //for phoneNumber
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){
        return "Customer[userId="+userId+",emaiID="+emailId+",password="+password+",firstName="+firstName+",lastName"+lastName+",city="+city+",gender="+gender+",phoneNumber="+phoneNumber+"]";
    }
}
class Admin{
    private String adminid;
    private String email;
    private String firstName;
    private String lastName;
    private String password;

    Admin(){
        super();
    }
    public Admin(String adminid, String email, String firstName, String lastName, String password){
        this.adminid = adminid;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    //for adminid
    public String getAdminid(){
        return adminid;
    }
    public void setAdminid(String adminid)
    {
        this.adminid = adminid;
    }

    //for email
    public String getEmail(){
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }

    //for password
    public String getPassword(){
        return password;
    }
    public void setPassword(String password)
    {
        this.password = password;
    }
    
    //for firstName
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    
    //for lastName
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
}
class Address{
    private String city;
    private String state;
    private int zip;
    private String country;

    Address(){
        super();
    }
    public Address(String city, String state, int zip, String country){
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.country = country;
    }

    //for city
    public String getCity(){
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

    //for state
    public String getState(){
        return state;
    }
    public void setState(String state)
    {
        this.state = state;
    }

    //for zip
    public int getZip(){
        return zip;
    }
    public void setZip(int zip){
        this.zip = zip;
    }
    
    //for country
    public String getCountry(){
        return country;
    }
    public void setCountry(String country)
    {
        this.country = country;
    }
}
class ServiceDetails
{
	private String serviceId;
	private String busId;
	private String deptDateTime;
	private String arrDateTime;
	private String arrivalCity;
	private String deptCity;
	private String cost;
	private String seatsLeft;
	private String totalSeats;
	public ServiceDetails() {
		super();
	}
	public ServiceDetails(String serviceId, String busId, String deptDateTime, String arrDateTime, String arrivalCity,
			String deptCity, String cost, String seatsLeft, String totalSeats) {
		super();
		this.serviceId = serviceId;
		this.busId = busId;
		this.deptDateTime = deptDateTime;
		this.arrDateTime = arrDateTime;
		this.arrivalCity = arrivalCity;
		this.deptCity = deptCity;
		this.cost = cost;
		this.seatsLeft = seatsLeft;
		this.totalSeats = totalSeats;
	}
	public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
	public String getBusId() {
		return busId;
	}
	public void setBusId(String busId) {
		this.busId = busId;
	}
	public String getDeptDateTime() {
		return deptDateTime;
	}
	public void setDeptDateTime(String deptDateTime) {
		this.deptDateTime = deptDateTime;
	}
	public String getArrDateTime() {
		return arrDateTime;
	}
	public void setArrDateTime(String arrDateTime) {
		this.arrDateTime = arrDateTime;
	}
	public String getArrivalCity() {
		return arrivalCity;
	}
	public void setArrivalCity(String arrivalCity) {
		this.arrivalCity = arrivalCity;
	}
	public String getDeptCity() {
		return deptCity;
	}
	public void setDeptCity(String deptCity) {
		this.deptCity = deptCity;
	}
	public String getCost() {
		return cost;
	}
	public void setCost(String cost) {
		this.cost = cost;
	}
	public String getSeatsLeft() {
		return seatsLeft;
	}
	public void setSeatsLeft(String seatsLeft) {
		this.seatsLeft = seatsLeft;
	}
	public String getTotalSeats() {
		return totalSeats;
	}
	public void setTotalSeats(String totalSeats) {
		this.totalSeats = totalSeats;
	}
}
class BookDetails{
    private int bookingId;
    private int userId;
    private String status;
    private String serviceId;

    BookDetails(){
        super();
    }

    public BookDetails( int bookingId, int userId, String status, String serviceId){
        this.bookingId =bookingId;
        this.userId = userId;
        this.status = status;
        this.serviceId = serviceId;
    }

    //for bookingId
    public int getBookingId(){
        return bookingId;
    }
    public void setBookingId(int bookingId){
        this.bookingId = bookingId;
    }

    //for userId
    public int getUserId(){
        return userId;
    }
    public void setUserId(int userId){
        this.userId = userId;
    }
    
    //for status
    public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

    //for serviceId
    public String getServiceId() {
		return serviceId;
	}
	public void setServiceId(String serviceId) {
		this.serviceId = serviceId;
	}
}
public class ParaConstructor {
    public static void main(String[] args) {
        Customer2 customer2 = new Customer2(1001, "raju@gmail.com", "password@123", "Raj", "Kumar", "Bangalore", "Male", 123456789);
        System.out.println(customer2.toString());
    }
}
