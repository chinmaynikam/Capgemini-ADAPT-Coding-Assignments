import java.util.Scanner;

class CalculateSalary{
    public static void main(String[] args) {
        int sal,shifts;
        double saving=0;
        Scanner sc = new Scanner(System.in);

        sal = sc.nextInt();
        shifts = sc.nextInt();

        if(sal>8000)
        {
            System.out.println("Salary too Large");
        }
        else if(sal<0)
        {
            System.out.println("Salary too Small");
        }
        else{
            if(shifts<0)
            {
                System.out.println("Shifts too small");
            }
            else{
                saving=(sal*0.5)+(sal*shifts*0.02);
            }
        }
        System.out.print(saving);
        sc.close();
    }
}