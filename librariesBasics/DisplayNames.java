package librariesBasics;
/*
 * 25. Write a program to accept names until the END is given and display all the names separated by '-'.

 */

import java.util.Scanner;


public class DisplayNames {
    public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String str=s.nextLine();
       String str2="";
       while(!str.equalsIgnoreCase("END")){
            str2=str2+str+"-";
            str=s.nextLine();
            
           
       }

       System.out.println(str2.substring(0,str2.length()-1));
    }
    
    
}
