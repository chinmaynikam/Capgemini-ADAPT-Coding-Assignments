import java.util.Scanner;

class Utility{
    public static int farenheittocelcius(double farenheit)
    {
        int celcius=0;
        celcius = (int) (farenheit - 32)*5/9;
        return celcius;
    }
    public static String tempLevel(int[] temp) {
        String level=null;
        int sum=0;
        for(int i=0;i<temp.length;i++)
        {
            sum += temp[i];
        }
        if(sum>=100)
        {
            level = "HIGH";
        }
        else if(sum>=70 && sum<100)
        {
            level = "MEDIUM";
        }
        else if(sum<70)
        {
            level = "LOW";
        }
        return level;
    }
}
public class FarenheitToCelcius {
    public static void main(String[] args) {
        int ch,size;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your choice: ");
        ch = scanner.nextInt();
        switch (ch) {
            case 1: double farenheit;
                    farenheit = scanner.nextDouble();
                    System.out.println("Temperature in 'C : "+Utility.farenheittocelcius(farenheit));
                    break;
            case 2: System.out.println("Enter size of array: ");
                    size = scanner.nextInt();
                    int[] temp = new int[size];
                    System.out.println("Enter temperatures: ");
                    for(int i=0;i<size;i++)
                    {
                        temp[i]=scanner.nextInt();
                    }
                    System.out.println("Temperature Level is "+Utility.tempLevel(temp));
                    break;
        
            default:System.out.println("Invalid Input");
                    break;
        }
        scanner.close();
    }
}
/*Output:
Test Case 1:
Enter your choice:
1
100
Temperature in 'C : 37

Test Case 2:
Enter your choice:
1
95.5
Temperature in 'C : 35

Test Case 3:
Enter your choice:
2
Enter size of array:
4
Enter temperatures:
40
50
5
10
Temperature Level is HIGH

Test Case 4:
Enter your choice:
2
Enter size of array:
5
Enter temperatures:
30
10
8
12
7
Temperature Level is LOW

Test Case 5:
Enter your choice:
2
Enter size of array:
3
Enter temperatures:
30
35
25
Temperature Level is MEDIUM

Test Case 6:
Enter your choice:
3
Invalid Input

*/