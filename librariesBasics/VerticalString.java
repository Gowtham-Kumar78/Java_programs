package librariesBasics;
/*
 * 20. Write a program to accept a string from the user and display it vertically. use nextLine() to read a string from the user.
 */

 import java.util.Scanner;

public class VerticalString {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String str=s.nextLine();

        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}
