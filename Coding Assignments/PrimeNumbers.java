import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        int num,flag=1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num = scanner.nextInt();
        for(int i=2;i<num/2;i++)
        {
            if(num%i==0)
            {
                flag=0;
            }
        }
        if (flag==1) {
            System.out.println(num+" is a prime number.");
        } else {
            System.out.println(num+" is not a prime number.");
        }
        scanner.close();
    }
}
/*Output:
Test Case 1:
Enter a number:
13
13 is a prime number.

Test Case 2:
Enter a number:
15
15 is not a prime number.

Test Case 3:
Enter a number:
24
24 is not a prime number.

Test Case 4:
Enter a number:
29
29 is a prime number.

Test Case 5:
Enter a number:
843
843 is not a prime number.
*/