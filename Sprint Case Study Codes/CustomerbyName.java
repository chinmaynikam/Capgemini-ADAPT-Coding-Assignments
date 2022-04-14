import java.util.Scanner;

public class CustomerbyName {
    public static void main(String[] args) {
        String[][] customer = new String[5][3];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter info of 5 customers: ");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                customer[i][j]=sc.nextLine();
            }
        }
        //displaying customer info before
        System.out.println("\nBefore Sorting: \n");
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(customer[i][j]+"\t"); 
            }
            System.out.println();
        }
        //sorting the customer array
        for(int i=0;i<5;i++)
        {
            for(int j=i+1;j<5;j++)
            {
                if(customer[i][1].compareTo(customer[j][1])<0)
                {
                    //Swapping
                    String[][] temp = new String[5][3];
                    temp[i] = customer[i];
                    customer[i] = customer[j];
                    customer[j] = temp[i];
                }
            }
        }
        //displaying customer info after
        System.out.println("\nAfter Sorting: \n");
        for(int i=4;i>=0;i--)
        {
            for(int j=0;j<3;j++)
            {
                System.out.print(customer[i][j]+"\t"); 
            }
            System.out.println();
        }
        sc.close();
    }
    
}
/*
Test Case 1:
Enter info of 5 customers:
100
Rajan
Pune
20
Rohan
Pimpri
3
Chinmay
Kothrud
10
Arjun
Shivajinagar
24
Shantanu
Amravati

Before Sorting:

100     Rajan       Pune
20      Rohan       Pimpri
3       Chinmay     Kothrud
10      Arjun       Shivajinagar
24      Shantanu    Amravati

After Sorting:

10      Arjun       Shivajinagar
3       Chinmay     Kothrud
100     Rajan       Pune
20      Rohan       Pimpri
24      Shantanu    Amravati

*/