import java.util.Scanner;

public class ShortKBC {
    public static void main(String[] args) {
        String[] questions = {  "Q1: What is the capital of ITALY?",
                                "Q2: What is the capital of CANADA?",
                                "Q3: What is the capital of INDIA?",
                                "Q4: How many states are there in USA?",
                                "Q5: What is the largest  population COUNTRY in the world?"   
                             };
        String[] answers = new String[5];
        String[] ans = {"ROME","OTTAWA","DELHI","56","CHINA"};
        String[] response = {"ADABHOOT","LAJAWAB","SHABAAS","AVISHWASNIAY","7Cr!!!!!"};
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<5;i++)
        {
            System.out.println(questions[i]);
            answers[i]=sc.nextLine();
            if(answers[i].equalsIgnoreCase(ans[i]))
            {
                System.out.println(response[i]);
            }
            else{
                System.out.println("AFSOS YE GALAT JAWAB HAI :(");
            }
        }
        sc.close();
    }
}
