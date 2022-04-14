import java.util.Scanner;

public class AverageMarks {
    public static void main(String[] args) {
        int marks1, marks2, marks3, averageMarks;
        Scanner sc = new Scanner(System.in);
        System.out.println("Marks in Physics: ");
        marks1 = sc.nextInt();
        System.out.println("Marks in Chemistry: ");
        marks2 = sc.nextInt();
        System.out.println("Marks in Mathematics: ");
        marks3 = sc.nextInt();

        averageMarks = (marks1+marks2+marks3)/3;
        if( marks1<0 || marks2<0 || marks3<0 || marks1>100 || marks2>100 || marks1>100 )
        {
            System.out.println("Invalid Marks!");
        }
        else{
            if(averageMarks>=70)
            {
                System.out.println("Distinction");
            }
            else if(averageMarks>=60 && averageMarks<70)
            {
                System.out.println("First");
            }
            else if(averageMarks>=50 && averageMarks<60)
            {
                System.out.println("Second");
            }
            else if(averageMarks>=40 && averageMarks<50)
            {
                System.out.println("Third");
            }
            else if(averageMarks<=40)
            {
                System.out.println("Fail");
            }
        }
        sc.close();
    }
}
/* Output:
Test Case 1:
Marks in Physics:
45
Marks in Chemistry:
67
Marks in Mathematics:
89
First

Test Case 2:
Marks in Physics:
24
Marks in Chemistry:
45
Marks in Mathematics:
34
Fail

Test Case 3:
Marks in Physics:
90
Marks in Chemistry:
91
Marks in Mathematics:
95
Distinction

Test Case 4:
Marks in Physics:
-44
Marks in Chemistry:
34
Marks in Mathematics:
78
Invalid Marks!

Test Case 5:
Marks in Physics:
104
Marks in Chemistry:
90
Marks in Mathematics:
80
Invalid Marks!
*/