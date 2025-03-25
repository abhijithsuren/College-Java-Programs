import java.util.*;
public class thewordcount{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence : ");
        String s = sc.nextLine();
        s = s.trim();
        int i, c = 0;
        int l = s.length();
        for(i=0 ;i<l;i++){
            String wd="";
            while(i<l && s.charAt(i)!=' '){
                wd=wd+s.charAt(i);
                i++;
            }
            if(wd.equalsIgnoreCase("the")){
                c++;
            }
        }
        System.out.println("The number of occurance of THE : "+c);
        sc.close();
    }
}