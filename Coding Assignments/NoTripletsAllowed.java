import java.util.Scanner;

public class NoTripletsAllowed {
    public static boolean noTriplet(int nums[])
    {
        int flag=1;
        for(int i=0;i<nums.length/2;i++)
        {
            if(nums[i] == nums[i+1] && nums[i] == nums[i+2])
            {
                flag = 0;
            }
        }
        if(flag == 0)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args) {
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        size = sc.nextInt();
        int[] nums = new int[size];
        System.out.println("Enter elements of array: ");
        for(int i=0;i<size;i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println("Is the entered array has triples?");
        if(noTriplet(nums))
        {
            System.out.println("True. There are no triples.");
        }
        else{
            System.out.println("False. There are triples.");
        }
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter size of array:
5
Enter elements of array:
1
1
2
2
1
Is the entered array has triples?
True. There are no triples.

Test Case 2:
Enter size of array:
6
Enter elements of array:
1
1
2
2
2
1
Is the entered array has triples?
False. There are triples.

Test Case 3:
Enter size of array:
7
Enter elements of array:
1
1
1
2
2
2
1
Is the entered array has triples?
False. There are triples.

*/
