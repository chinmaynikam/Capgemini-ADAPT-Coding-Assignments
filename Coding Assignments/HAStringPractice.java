class StringPlay{
    int convert;
    int max;

    public StringPlay(){}
}
class StringMethod{
    public int convertToInt(StringPlay sp, String str){
        sp.convert = Integer.parseInt(str);
        return sp.convert;
    }
    public int getMax(StringPlay sp, String str, char ch){
        char temp;
        int count=0;
        for(int i=0;i<str.length();i++){
            temp = str.charAt(i);
            if(temp == ch){
                count++;
            }
        }
        sp.max = count;
        return sp.max;
    }
}
public class HAStringPractice {
    public static void main(String[] args) {
        StringPlay sp = new StringPlay();
        StringMethod sm = new StringMethod();
        sp.convert = sm.convertToInt(sp, "254689");
        sp.max = sm.getMax(sp, "I am Chinmay Nikam. You are my son. By order of the Peaky Fucking Blinders.", 'i');
        System.out.println("Max = "+sp.max+"\nString converted to Int: "+sp.convert);
    }
}
/*Output:
Test Case 1:
Max = 3
String converted to Int: 123

Test Case 2:
Max = 4
String converted to Int: 254689

*/