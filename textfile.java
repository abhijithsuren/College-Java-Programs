import java.util.*;
import java.io.*;
public class textfile {
    public static void main(String[] args)
    throws IOException {
        String s1, s;
        int l, i , vow=0, con=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        s = sc.nextLine();
        FileWriter fw = new FileWriter("Text.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(s);
        bw.close();
        FileReader fr = new FileReader("Text.txt");
        BufferedReader br = new BufferedReader(fr);
        while((s1 = br.readLine()) != null){
            l = s1.length();
            for(i=0;i<l;i++){
                char ch = s1.charAt(i);
                switch(ch){
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                case 'U':
                case 'u': vow++;
                        break;
                default: if(Character.isLetter(ch)){
                    con++;
                }
                }
            }
        }
        br.close();
        System.out.println("Consonants : "+con);
        System.out.println("Vowels : "+vow);
        sc.close();
    }
}
