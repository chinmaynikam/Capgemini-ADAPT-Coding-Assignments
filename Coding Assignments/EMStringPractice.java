class Encryption{

    public String decodeMessage(String string) {
        String msg1 = string.replaceAll("[aeiouAEIOU]", "");
        return msg1;
    }

    public String encodeMessage(String string) {
        String msg;
        char[] msg1 = string.toCharArray();
        char[] vowels = {'a','e' ,'i' ,'o' ,'u'};
        char[] temp = new char[string.length()*2];
        int id = 0,flag;
        int i=0,j=0;
        while(i != temp.length && j != string.length())
        {
            flag=0;
            if(msg1[j] != ' ')
            {
                temp[i] = msg1[j];
                temp[i+1] = vowels[id++]; 
            }
            else{
                temp[i] = msg1[j];
                flag=1;
            }
            if(id == vowels.length)
            {
                id = 0;
            }
            if(flag==1)
            {
                j++;
                i=i+1;
            }
            else{
                j++;
                i=i+2;
            }
        }
        msg = new String(temp);
        return msg;
    }
    
}
public class EMStringPractice {
    public static void main(String[] args) {
        Encryption obj = new Encryption();
        System.out.println(obj.decodeMessage("oriGinal MessAge"));
        System.out.println(obj.encodeMessage("QWRT cvbN MnKL"));
    }    
}
/*Ouput:
Test Case 1:
rGnl Mssg
QaWeRiTo cuvabeNi MonuKaLe

*/