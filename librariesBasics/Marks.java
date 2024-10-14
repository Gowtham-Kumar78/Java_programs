package librariesBasics;
import java.util.Scanner;

/*
 * 21. Write a program to accept a string that contains marks separated by commas and display total.

 */

public class Marks {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        String marks=s.nextLine();
        String[] str=new String[marks.length()];
        str=marks.split("[,]");
        int total=0;

        for (int i=0;i< str.length;i++){
            int num=Integer.parseInt(str[i]);
            total+=num;
        }

        System.out.println(total);
    }
    
}
