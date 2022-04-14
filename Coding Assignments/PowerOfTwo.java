import java.util.Scanner;


public class PowerOfTwo{
    public static void main(String[] args) {
        int n,flag=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to Check whether it is power of two (2^n) or not: ");
        n = sc.nextInt();
        int a=n;
        if(n<0){
            System.out.println("Number to small");
        }
        else if(n>32679){
            System.out.println("Number to large");
        }
        else{
            while(n != 1){
                if(n%2 != 0){
                    flag = 0;
                }
                n = n/2;
            }
            if(flag==1){
                System.out.println(a+" is power of two.");
            }
            else{
                System.out.println(a+" is not power of two.");
            }

        }
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter a number to Check whether it is power of two (2^n) or not:
40000
Number to large

Test Case 2:
Enter a number to Check whether it is power of two (2^n) or not:
-10
Number to small

Test Case 3:
Enter a number to Check whether it is power of two (2^n) or not:
256
256 is power of two.

Test Case 4:
Enter a number to Check whether it is power of two (2^n) or not:
512
512 is power of two.

Test Case 5:
Enter a number to Check whether it is power of two (2^n) or not:
444
444 is not power of two.

Test Case 6:
Enter a number to Check whether it is power of two (2^n) or not:
3
3 is not power of two.
*/