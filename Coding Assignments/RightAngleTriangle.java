import java.util.Scanner;

public class RightAngleTriangle {
    public static void main(String[] args) {
        int s3, s2, s1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lengths of each sides of triangle: ");
        s3 = sc.nextInt();
        s2 = sc.nextInt();
        s1 = sc.nextInt();

        int a = (s1*s1) + (s2*s2);
        int b = s3*s3;
        if(s3>s2 && s3>s1)
        {
            if(a==b)
            {
                System.out.println("Right Angle Triangle.");
            }
            else{
                System.out.println("Not A Right Angle Triangle.");
            }
        }
        else{
            System.out.println("Invalid Input!");
        }
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter lengths of each sides of triangle:
5 4 3
Right Angle Triangle.

Test Case 2:
Enter lengths of each sides of triangle:
13 12 5
Right Angle Triangle.

Test Case 3:
Enter lengths of each sides of triangle:
7 4 3
Not A Right Angle Triangle.

Test Case 4:
Enter lengths of each sides of triangle:
4 6 8
Invalid Input!
*/