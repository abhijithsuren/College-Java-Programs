import java.util.*;
public class shapes{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int choice;
        boolean running = true;
        while(running){
            System.out.println("\nEnter your choice : \n1.Circle\n2.Square\n3.Rectangle\n4.Exit");
            choice = sc.nextInt();
            switch(choice){
                case 1: double r;
                    System.out.println("Enter the radius : ");
                    r = sc.nextDouble();
                    System.out.println("Area of the circle is : "+ (3.14*r*r));
                    break;
                case 2: int length;
                    System.out.println("Enter the side of the square : ");
                    length = sc.nextInt();
                    System.out.println("Area of the square is "+(length*length));
                    break;
                case 3: int l,b;
                    System.out.println("Enter the length and breadth of rectangle");
                    l=sc.nextInt();
                    b=sc.nextInt();
                    System.out.println("Area of the rectangle is : "+(l*b));
                    break;
                case 4:
                    running=false;
                    break;
                default: 
                    System.out.println("Enter a valid choice");
                    break;
            }
        }
        sc.close();

    }
}