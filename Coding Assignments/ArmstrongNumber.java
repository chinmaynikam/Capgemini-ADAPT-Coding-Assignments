import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        n = sc.nextInt();
        if(n<100 || n>999)
        {
            System.out.println("INVALID_INPUT");
        }
        else{
            isArmstrong(n);
        }
        sc.close();
    }
    static void isArmstrong(int n)
    {
        int a=n,digit,sum=0;
        while(a>0)
        {
            digit = a%10;
            sum = sum +(digit * digit * digit);
            a = a/10;
        }
        if(n==sum){
            System.out.println(n+" IS ARMSTRONG NUMBER");
        }
        else{
            System.out.println(n+" IS NOT ARMSTRONG NUMBER");
        }
    }
}
/*Output:
Test Case 1:
Enter a number:
371
371 IS ARMSTRONG NUMBER

Test Case 2:
Enter a number:
865
865 IS NOT ARMSTRONG NUMBER

Test Case 3:
Enter a number:
45
INVALID_INPUT

Test Case 4:
Enter a number:
1256
INVALID_INPUT

*/