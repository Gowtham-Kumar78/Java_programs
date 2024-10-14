
import java.util.Scanner;

//44. Write a program to accept a string & display each word on a separate line (use any separator)

public class StringSeperator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str = s.nextLine();

        String[] strr = str.split("");

        for(String i : strr){
            System.out.println(i);
        }



        
    }
}
