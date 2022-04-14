import java.util.Scanner;

public class MonkeyTrouble {
    static boolean isTrouble(boolean aSmile, boolean bSmile)
    {
        if(aSmile==bSmile)
        {
            return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args) {
        boolean aSmile, bSmile;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter whether Monkey a and Monkey b is smiling or not?\n(Enter true for smiling and false for not smiling): ");
        aSmile = sc.nextBoolean();
        bSmile = sc.nextBoolean();
        boolean trouble = isTrouble(aSmile, bSmile);
        System.out.println("Is there any Monkey Trouble?\n"+trouble);
        sc.close();
    }
}
/*Output:
Test Case 1:
Enter whether Monkey a and Monkey b is smiling or not?
(Enter true for smiling and false for not smiling):
true true
Is there any Monkey Trouble?
true

Test Case 2:
Enter whether Monkey a and Monkey b is smiling or not?
(Enter true for smiling and false for not smiling):
true false
Is there any Monkey Trouble?
false

Test Case 3:
Enter whether Monkey a and Monkey b is smiling or not?
(Enter true for smiling and false for not smiling):
false true
Is there any Monkey Trouble?
false

Test Case 4:
Enter whether Monkey a and Monkey b is smiling or not?
(Enter true for smiling and false for not smiling):
false false
Is there any Monkey Trouble?
true

*/