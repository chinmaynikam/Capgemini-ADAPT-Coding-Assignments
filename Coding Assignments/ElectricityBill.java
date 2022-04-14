import java.util.Scanner;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int units;
        System.out.println("***********Electricity bill***********");
        System.out.println("Enter number of units: ");
        units = sc.nextInt();
        if(units>=0)
        {
            System.out.println("Your total bill is: "+calculateElectricitbill(units));
        }
        else{
            System.out.println("INVALID INPUT");
        }
        sc.close();
    }

    static double calculateElectricitbill(int units) {
        double total=0;
        if(units<=30)
        {
            total = units * 3.5;
        }
        else if(units>30 && units<=100)
        {
            double u1 = 30 * 3.5;
            double u2 = (units - 30) * 4.0;
            total = u1 + u2;
        }
        else if(units>100)
        {
            double u1 = 30 * 3.5;
            double u2 = 70 * 4.0;
            double u3 = (units - 100) * 5.0;
            total = u1 + u2 + u3;
        }
        return total;
    }
}
/*Output:
Test Case 1:
***********Electricity bill***********
Enter number of units:
110
Your total bill is: 435.0

Test Case 2:
***********Electricity bill***********
Enter number of units:
150
Your total bill is: 635.0

Test Case 3:
***********Electricity bill***********
Enter number of units:
0
Your total bill is: 0.0

Test Case 4:
***********Electricity bill***********
Enter number of units:
-10
INVALID INPUT

Test Case 5:
***********Electricity bill***********
Enter number of units:
80
Your total bill is: 305.0

Test Case 6:
***********Electricity bill***********
Enter number of units:
25
Your total bill is: 87.5
*/