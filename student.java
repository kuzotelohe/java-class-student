import java.util.Scanner;
public class student {
    String USN,Name,Branch,Phone;
    Scanner input=new Scanner (System.in);
    void read(){
        System.out.println("Enter Student Detail");
        System.out.println("Enter USN");
        USN=input.nextLine();
        System.out.println("Enter Name");
        Name=input.nextLine();
        System.out.println("Enter Branch");
        Branch=input.nextLine();
        System.out.println("Enter Phone");
        Phone=input.nextLine();
    }
    void display(){
        System.out.printf("%-20s%-20s%-20s%-20s",USN,Name,Branch,Phone);
    }
}
class studentdetails{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number of student details to be created");
        int number=input.nextInt();
        student s[]=new student[number];
        //Read student details into array of student objects
        for(int i=0;i<number;i++){
            s[i]=new student();
            s[i].read();
        }
        //display student information
        System.out.printf("%-20s%-20s%-20s%-20s","USN","NAME","BRANCH","PHONE");
        for(int i=0;i<number;i++)
        {
            System.out.println();
            s[i].display();
        }
        input.close();
    }
}
