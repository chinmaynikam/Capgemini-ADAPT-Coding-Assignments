import java.util.Scanner;

public class SalesDesignations {
    public static void main(String[] args) {
        int n,count=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of designations: ");
        n = sc.nextInt();
        if(n>0)
        {
            String[] designations = new String[n];
            sc.nextLine();
            System.out.println("Enter "+n+" designations: ");
            for(int i=0;i<n;i++)
            {
                designations[i] = sc.nextLine();
            }
            String[] temp = new String[n];
            for(int i=0;i<n;i++)
            {
                if(designations[i].contains("Sales"))
                {
                    temp[count] = designations[i];
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("No designations in sales office.");
            }
            else{
                System.out.println("Designations in sales department are "+count);
                for(int i=0;i<count;i++)
                {
                    System.out.println(temp[i]);
                }
            }
        }
        else{
            System.out.println("INVALID INPUT");
        }
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter number of designations:
3
Enter 3 designations:
Programmer
Salesofficer
Salesmanager
Designations in sales department are 2
Salesofficer
Salesmanager

Test Case 2:
Enter number of designations:
2
Enter 2 designations:
Clerk
Salesman
Designations in sales department are 1
Salesman

Test Case 3:
Enter number of designations:
2
Enter 2 designations:
Clerk
Programmer
No designations in sales office.

Test Case 4: 
Enter number of designations:
-2
INVALID INPUT
*/
