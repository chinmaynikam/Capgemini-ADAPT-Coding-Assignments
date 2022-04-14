import java.util.Scanner;

public class DecimaltoBinary {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal number: ");
        n = sc.nextInt();
        if(n<1 || n>999)
        {
            System.out.println("INVALID INPUT");
        }
        else{
            int count = 0;
            int[] binary = new int[10];
            while(n>=1 && n<=1000)
            {
                binary[count] = n%2;
                n = n/2;
                count++;
            }
            System.out.print("Binary equivalent: ");
            for(int i=count-1;i>=0;i--)
            {
                System.out.print(binary[i]);
            }
        }
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter a decimal number:
10
Binary equivalent: 1010

Test Case 2:
Enter a decimal number:
-22
INVALID INPUT

Test Case 3:
Enter a decimal number:
1001
INVALID INPUT

Test Case 4:
Enter a decimal number:
457
Binary equivalent: 111001001

*/