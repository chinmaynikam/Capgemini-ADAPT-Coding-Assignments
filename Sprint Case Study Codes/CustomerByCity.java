import java.util.Scanner;

class Customer{
    private int userId;
    private String emailId;
    private String password;
    private String firstName;
    private String lastName;
    private String city;
    private String gender;
    private int phoneNumber;

    public  Customer(){
        super();
    }

    public Customer(int userId, String emailId, String password, String firstName, String lastName, String city, String gender, int phoneNumber){
        this.userId = userId;
        this.emailId = emailId;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString(){

        return "Customer[userId="+userId+",emaiID="+emailId+",password="+password+",firstName="+firstName+",lastName"+lastName+",city="+city+",gender="+gender+",phoneNumber="+phoneNumber+"]";

    }

}

public class CustomerByCity {


public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String input= scan.next();
        switch(input.toLowerCase()){

            case "bangalore": getBangalore();
                                break;

            case "chennai": getChennai();
                            break;
            
            case "delhi":  getDelhi();
                            break;

            default:    System.out.println("No City Found");


        }

        scan.close();
    }


    public static void getBangalore(){
        Customer bangalore = new Customer(1001, "abc1@gmail.com","password1", "Harry", "Potter","Bangalore", "male", 1234567892);
        System.out.println(bangalore);
    }

    public static void getChennai(){
        Customer Chennai = new Customer(1002, "abc12@gmail.com","password2", "Raj", "Kumar","Chennai", "male", 1254567892);
        System.out.println(Chennai);
    }

    public static void getDelhi(){
        Customer delhi = new Customer(1003, "abc13@gmail.com","password3", "Sneha", "dip","Delhi", "male", 1234560892);
        System.out.println(delhi);
    }
    
}
