import java.util.Scanner;

public class Inflation {
    public static double calculateCost(double cost, int years, double inflationrate)
    {
        for(int i=0;i<years;i++)
        {
            cost += cost*inflationrate;
        }
        return cost;
    }
    public static void main(String[] args) {
        double cost, inflationrate;
        int years; 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Cost: ");
        cost = sc.nextDouble();
        System.out.println("Enter Years: ");
        years = sc.nextInt();
        System.out.println("Enter Inflation Rate: ");
        inflationrate = sc.nextDouble();

        inflationrate = inflationrate/100;
        System.out.println("Expected Cost: "+calculateCost(cost, years, inflationrate));
        sc.close();
    }
}
/*Output:

Enter Cost:
2000
Enter Years:
3
Enter Inflation Rate:
5.6
Expected Cost: 2355.167232

Enter Cost:
2000
Enter Years:
12
Enter Inflation Rate:
5.6
Expected Cost: 3845.891378195159
*/