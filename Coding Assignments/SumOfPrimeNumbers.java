import java.util.Scanner;

public class SumOfPrimeNumbers {
    public static void main(String[] args) {
        int a,b,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        a = sc.nextInt();
        b = sc.nextInt();
        if( a<3 || b<3 || a>1000 || b>1000 )
        {
            System.out.println("INVALID INPUT");
        }
        else if(a>b)
        {
            System.out.println("INVALID INPUT");
        }
        else{
            int flag;
            for(int i=a;i<=b;i++)
            {
                flag=1;
                for(int j=2;j<i/2;j++)
                {
                    if(i%j==0)
                    {
                        flag=0;
                    }
                }
                if(flag==1)
                {
                    sum += i;
                }
            }
            System.out.println("Total of all prime numbers coming between "+a+" & "+b+" is "+sum);
        }
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter two numbers:
10 20
Total of all prime numbers coming between 10 & 20 is 60

Test Case 2:
Enter two numbers:
2 30
INVALID INPUT

Test Case 3:
Enter two numbers:
2 40
INVALID INPUT

Test Case 4:
Enter two numbers:
10 1020
INVALID INPUT

Test Case 5:
Enter two numbers:
10 1000
Total of all prime numbers coming between 10 & 1000 is 76110

Test Case 6:
Enter two numbers:
20 10
INVALID INPUT
*/