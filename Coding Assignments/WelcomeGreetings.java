import java.util.Scanner;

public class WelcomeGreetings {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of people: ");
        n = sc.nextInt();
        int handshake=0;
        if(n<0)
        {
            System.out.println("Invalid Input");
        }
        else{
            for(int i=1;i<=n;i++)
            {
                if(i>1)
                {
                    handshake = handshake + (i-1);
                }
                System.out.println("handshake("+i+")="+handshake);
            }
        }
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter number of people:
8
handshake(1)=0
handshake(2)=1
handshake(3)=3
handshake(4)=6
handshake(5)=10
handshake(6)=15
handshake(7)=21
handshake(8)=28

Test Case 2:
Enter number of people:
5
handshake(1)=0
handshake(2)=1
handshake(3)=3
handshake(4)=6
handshake(5)=10

Test Case 3:
Enter number of people:
20
handshake(1)=0
handshake(2)=1
handshake(3)=3
handshake(4)=6
handshake(5)=10
handshake(6)=15
handshake(7)=21
handshake(8)=28
handshake(9)=36
handshake(10)=45
handshake(11)=55
handshake(12)=66
handshake(13)=78
handshake(14)=91
handshake(15)=105
handshake(16)=120
handshake(17)=136
handshake(18)=153
handshake(19)=171
handshake(20)=190

*/