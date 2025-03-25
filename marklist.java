import java.util.*;
public class marklist{
     double mark1, mark2, mark3, per;
     int roll_no;
     String name;
     Scanner sc = new Scanner(System.in);
     marklist(){
        mark1=mark2=mark3=per=roll_no=0;
     }
     public void details(){
        System.out.println("Enter the name : ");
        name = sc.nextLine();
        System.out.println("Enter the roll no : ");
        roll_no = sc.nextInt();
        System.out.println("Enter 3 marks : ");
        mark1 = sc.nextDouble();
        mark2 = sc.nextDouble();
        mark3 = sc.nextDouble();
     }
     public void calc(){
        per = ((mark1+mark2+mark3) / 300) * 100;
     }
     public void display(){
        System.out.println("Name : "+name);
        System.out.println("Roll no : "+roll_no);
        System.out.println("percentage : "+per);
     }
     public static void main(String[] args){
        int i,n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        n = sc.nextInt();
        marklist[] m = new marklist[n];
        for(i=0;i<n;i++){
            m[i] = new marklist();
        }
        System.out.println("----------------");
        for(i=0;i<n;i++){
         System.out.println("-- Student : "+(i+1)+" --");
         m[i].details();
         m[i].calc();
         System.out.println();
        }
        System.out.println("-----------------");
        for(i=0;i<n;i++){
         System.out.println("-- Student : "+(i+1)+" --");
         m[i].display();
         System.out.println();
        }
        sc.close();
     }

}