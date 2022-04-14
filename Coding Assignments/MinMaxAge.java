import java.util.Scanner;

public class MinMaxAge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of ages: ");
        n = sc.nextInt();
        if(n<1 || n>20)
        {
            System.out.println("Invalid Input");
        }
        else{
            int[] age = new int[n];
            for(int i=0;i<n;i++)
            {
                age[i]=sc.nextInt();
            }
            int min = age[0];
            for(int i=0;i<n;i++)
            {
                if(age[i]<min)
                {
                    min = age[i];
                }
            }
            int max = age[0];
            for(int i=0;i<n;i++)
            {
                if(age[i]>max)
                {
                    max = age[i];
                }
            }
            System.out.println("Min age: "+min+"\nMax age: "+max);
        }
        sc.close();
    }
}
/* Output:
Test Case 1:
Enter the number of ages:
5
34
56
12
89
43
Min age: 12
Max age: 89

Test Case 2:
Enter the number of ages:
25
Invalid Input

Test Case 3:
Enter the number of ages:
8
78
44
23
65
45
9
23
39
Min age: 9
Max age: 78

*/