import java.util.Scanner;

public class HRDesignations {
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
                if(designations[i].contains("HR"))
                {
                    temp[count] = designations[i].toUpperCase();
                    count++;
                }
            }
            if(count==0)
            {
                System.out.println("\nNo HR designations found in office.");
            }
            else{
                System.out.println("\nTotal HR Designations "+count+" in the office.");
                for(int i=0;i<count;i++)
                {
                    System.out.println(temp[i]);
                }
            }
        }
        else{
            System.out.println("\nINVALID INPUT");
        }
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter number of designations:
4
Enter 4 designations:
Operator
HRExecutive
Accountant
HRManager
Total HR Designations 2 in the office.
HREXECUTIVE
HRMANAGER
*/