import java.util.Scanner;

class Customers{
    private int cusId;
    private String name;
    private String city;

    Customers(){
        super();
    }

    public Customers(int cusId, String name, String city){
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
public class LSAByCustomerId {
    public static void main(String[] args) {
        int key,loc,n;
        Scanner sc = new Scanner(System.in);
        Customers[] cus = new Customers[5];
        cus[0] = new Customers(1204, "Gaurav", "Delhi");
        cus[1] = new Customers(1205, "Deepak", "Noida");
        cus[2] = new Customers(1206, "Arjun", "Pune");
        cus[3] = new Customers(1207, "Asha", "Mumbai");
        cus[4] = new Customers(1208, "Chinmay", "Pimpri");
        
        n=cus.length;
        System.out.println("Enter customer ID to be searched: ");
        key = sc.nextInt();
        loc = linearSearch(cus, n, key);

        if(loc==-1)
        {
            System.out.println("No Record Found");
        }
        else{
            System.out.println("Record Found:");
            System.out.println("CusID\t\tName\t\tCity");
            System.out.println(cus[loc].getCusId()+"\t\t"+cus[loc].getName()+"\t\t"+cus[loc].getCity());
        }
        sc.close();
    }
        //linear search method
        static int linearSearch(Customers c[], int n, int key){
            for(int i=0;i<n;i++)
            {
                if(c[i].getCusId() == key)
                {
                    return i;
                }
            }
            return -1;
        }
}
/*Output:
Test Case 1:
Enter customer ID to be searched:
1204
Record Found:
CusID           Name            City
1204            Gaurav          Delhi

Test Case 2:
Enter customer ID to be searched:
1205
Record Found:
CusID           Name            City
1205            Deepak          Noida

Test Case 3:
Enter customer ID to be searched:
1208
Record Found:
CusID           Name            City
1208            Chinmay         Pimpri

Test Case 4:
Enter customer ID to be searched:
1234
No Record Found
*/