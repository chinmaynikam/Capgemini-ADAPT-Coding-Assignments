import java.util.Scanner;

class Person{
    private String name;
    private int age;
    private char gender;
    Person(){
        super();
    }
    public Person(String name, int age, char gender){
        super();
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    //for name
    public String getName(){
        //System.out.println("Name: "+name);
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    //for age
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }

    //for gender
    public char getGender(){
        return gender;
    }
    public void setGender(char gender){
        this.gender=gender;
    }

    //Overriding equals method
    @Override
    public boolean equals(Object o){
        Person p2 = (Person) o;
        //Either of the if conditions from below is working. You can use any of them. :)
        //if(p2.getName().equals(this.getName()) && p2.getAge() == this.getAge() && p2.getGender() == this.getGender()){
        if(this.name.equals(p2.name) && this.age == p2.age && this.gender == p2.gender){
            return true;
        }
        else{
            return false;
        }
    }
}
public class SamePerson {
    public static void main(String[] args) {
        /*Person p1 = new Person("MyName", 26, 'm');
        Person p2 = new Person("MyName", 26, 'm');*/
        String name1, name2;
        int age1, age2;
        char gender1, gender2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter info of Person 1: ");
        name1 = sc.nextLine();
        age1 = sc.nextInt();
        gender1 = sc.next().charAt(0);
        System.out.println("\nName1: "+name1+"\nAge1: "+age1+"\nGender1: "+gender1);
        Person p1 = new Person(name1, age1, gender1);

        sc.nextLine();
        System.out.println("\nEnter info of Person 2: ");
        name2 = sc.nextLine();
        age2 = sc.nextInt();
        gender2 = sc.next().charAt(0);
        System.out.println("\nName2: "+name2+"\nAge2: "+age2+"\nGender2: "+gender2);
        Person p2 = new Person(name2, age2, gender2);

        System.out.print("\nPerson p1 and p2 are ");
        if(p1.equals(p2))
        {
            System.out.print("Same");
        }
        else{
            System.out.print("Different");
        }
        sc.close();
    }
}
/*OUTPUT:
Test Case 1:
Enter info of Person 1:
MyName
26
m

Name1: MyName
Age1: 26
Gender1: m

Enter info of Person 2:
MyName
26
m

Name2: MyName
Age2: 26
Gender2: m

Person p1 and p2 are Same

Test Case 2:


MyName
26
m
*/