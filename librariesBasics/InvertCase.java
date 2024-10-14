package librariesBasics;

/*
 * 23. Write a program to take a String and invert the case of characters.
 */

 import java.util.Scanner;
public class InvertCase {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String str= s.nextLine();
       
       
       for (int i=0;i<str.length();i++){
        char ch = str.charAt(i);
        if (ch>=65 && ch<=90){
            ch+=32;
            System.out.print(ch);
        }
        else{
            ch-=32;
            System.out.print(ch);
        }
       }
    }
}
