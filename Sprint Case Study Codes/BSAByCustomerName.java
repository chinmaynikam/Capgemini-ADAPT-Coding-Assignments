import java.util.Scanner;

class Customer1{
    private int cusId;
    private String name;
    private String city;

    Customer1(){
        super();
    }

    public Customer1(int cusId, String name, String city){
        this.cusId = cusId;
        this.name = name;
        this.city = city;
    }
    //for cusId
    public int getCusId(){
        return cusId;
    }
    public void setCusId(int cusId){
        this.cusId = cusId;
    }

    //for name
    public String getName(){
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }

    //for city
    public String getCity(){
        return city;
    }
    public void setCity(String city)
    {
        this.city = city;
    }

}
public class BSAByCustomerName {
    public static void main(String[] args) {
        int loc,n;
        String key;
        Scanner sc = new Scanner(System.in);
        Customer1[] cus = new Customer1[5];
        cus[0] = new Customer1(1001, "Arjun", "Pune");
        cus[1] = new Customer1(1002, "Asha", "Noida");
        cus[2] = new Customer1(1003, "Chinmay", "Pimpri");
        cus[3] = new Customer1(1004, "Deepak", "Mumbai");
        cus[4] = new Customer1(1005, "Gaurav", "Delhi");

        System.out.println("CusID\t*\tName\t*\tCity");
        System.out.println("**************************************");
        for(int i=0;i<5;i++){
            
            System.out.println(cus[i].getCusId()+"\t*\t"+cus[i].getName()+"\t*\t"+cus[i].getCity());
        }
        System.out.println("**************************************");
        //sc.nextLine();
        n=cus.length;
        System.out.println("Enter customer name to be searched: ");
        key = sc.nextLine();
        loc = binarySearch(cus, n, key);

        if(loc==-1)
        {
            System.out.println("\nNo Record Found");
        }
        else{
            System.out.println("\nRecord Found:");
            System.out.println("CusID\t*\tName\t*\tCity");
            System.out.println("**************************************");
            System.out.println(cus[loc].getCusId()+"\t*\t"+cus[loc].getName()+"\t*\t"+cus[loc].getCity());
            System.out.println("**************************************");
        }
        sc.close();
    }

    private static int binarySearch(Customer1[] cus, int n, String key) {
        int low = 0, mid, high = n-1;
        while(low <= high){
            mid = ( low + high )/2;
            if(key.compareToIgnoreCase(cus[mid].getName())==0){
                return mid;
            }
            else if(key.compareToIgnoreCase(cus[mid].getName())<0){
                high = mid-1;
            }
            else{
                low = mid + 1;
            }
        }
        return -1;
    }
}
/*Output: 
Test Case 1:
CusID   *       Name    *       City
**************************************
1001    *       Arjun   *       Pune
1002    *       Asha    *       Noida
1003    *       Chinmay *       Pimpri
1004    *       Deepak  *       Mumbai
1005    *       Gaurav  *       Delhi
**************************************
Enter customer name to be searched:
Gaurav

Record Found:
CusID   *       Name    *       City
**************************************
1005    *       Gaurav  *       Delhi
**************************************

Test Case 2:
CusID   *       Name    *       City
**************************************
1001    *       Arjun   *       Pune
1002    *       Asha    *       Noida
1003    *       Chinmay *       Pimpri
1004    *       Deepak  *       Mumbai
1005    *       Gaurav  *       Delhi
**************************************
Enter customer name to be searched:
Asha

Record Found:
CusID   *       Name    *       City
**************************************
1002    *       Asha    *       Noida
**************************************

Test Case 3:
CusID   *       Name    *       City
**************************************
1001    *       Arjun   *       Pune
1002    *       Asha    *       Noida
1003    *       Chinmay *       Pimpri
1004    *       Deepak  *       Mumbai
1005    *       Gaurav  *       Delhi
**************************************
Enter customer name to be searched:
Chinmay

Record Found:
CusID   *       Name    *       City
**************************************
1003    *       Chinmay *       Pimpri
**************************************

Test Case 4:
CusID   *       Name    *       City
**************************************
1001    *       Arjun   *       Pune
1002    *       Asha    *       Noida
1003    *       Chinmay *       Pimpri
1004    *       Deepak  *       Mumbai
1005    *       Gaurav  *       Delhi
**************************************
Enter customer name to be searched:
Rohan

No Record Found
*/