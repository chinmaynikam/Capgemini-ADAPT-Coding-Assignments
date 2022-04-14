import java.util.Scanner;

public class TriviaGame {
    public static void main(String[] args) {
        String[] questions = {  "Q1: What is the capital of ITALY?",
                                "Q2: What is the capital of CANADA?",
                                "Q3: What is the capital of INDIA?",
                                "Q4: How many states are there in USA?",
                                "Q5: What is the largest  population COUNTRY in the world?"   
                             };
        String[] answers = new String[5];
        String[] response = {"ADABHOOT","LAJAWAB","INCRIDIBLE","SHABAAS","7Cr!!!!!"};
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println(questions[i]);
            answers[i]=sc.nextLine();
            System.out.println(response[i]);
        }
        System.out.println("Final Score: "+triviaMethod(questions,answers));
        sc.close();
    }

    private static int triviaMethod(String[] questions, String[] answers) {
        int p=0;
        int[] marks = {2,3,3,2,5};
        String[] ans = {"ROME","OTTAWA","DELHI","56","CHINA"};
        
        for(int i=0;i<5;i++)
        {
            if(ans[i].equalsIgnoreCase(answers[i]))
            {
                p +=marks[i];
            }
            else{
                System.out.println("AFSOS YE GALAT UTTAR HAI :(");
            }
        }
        return p;
    }
}
