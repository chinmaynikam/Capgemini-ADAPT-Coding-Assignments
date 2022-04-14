//This is a code for Bus Reservation B Sprint 1 assessment in which wqe have 
//to Display Customer ID/Name in Decending Order
import java.util.Scanner;

public class SortStringArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] customerInfo = new String[5];
        System.out.println("Enter ID/Names of Customer: ");
        for(int i=0;i<5;i++)
        {
            customerInfo[i] = sc.nextLine();
        }
        for( int i=0; i<5; i++)
        {
            for( int j=i+1; j<5; j++)
            {
                if(customerInfo[i].compareTo(customerInfo[j])<0)
                {
                    String temp = customerInfo[i];
                    customerInfo[i] = customerInfo[j];
                    customerInfo[j] = temp;
                }
            }
        }
        System.out.println("\nSorted Customer list: ");
        System.out.println("Customer ID/Name");
        for( int i=0; i<5; i++)
        {
            System.out.println(customerInfo[i]);
        }
        sc.close();
    }
    
}
/*Output:
Test Case 1:
Enter ID/Names of Customer:
1234
5432
8765
2345
4788

Sorted Customer list:
Customer ID/Name
8765
5432
4788
2345
1234

Test Case 2:
Enter ID/Names of Customer:
Chinmay
Rohan
Arjun
Shantanu
Jayshree

Sorted Customer list:
Customer ID/Name
Shantanu
Rohan
Jayshree
Chinmay
Arjun
*/