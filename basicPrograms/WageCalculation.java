
/*
4. Write a program to accept the day of a week and the number of hours worked and calculate the wage.
Conditions:
     1,2,3 —>  Rs200/ hour
        4,5  —> Rs400 / hour
           6  —> Rs600 / hour
           7  —> Rs800 / hour
        1 to 7 is Monday to Friday.
   If the total amount exceeds Rs2000 then there will be a bonus of 10%.  (Use Switch Expression)

   */

import java.util.Scanner;
public class WageCalculation {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Number of Days Worked:");
        int days=s.nextInt();
        System.out.println("Enter Number of hours Worked:");
        int hours=s.nextInt();

        int wage;

        switch(days){
            
            case 4,5 -> wage=400*hours;
            case 6 -> wage=600*hours;
            case 7 -> wage=800*hours;

            default ->wage=200*hours;
            
        }

        if(wage>2000){
            double bonus=wage*0.1;
            int b =(int)bonus;
            System.out.println("wage="+(wage+b));
            
        }
        else{
            System.out.println("wage="+wage);
        }

        
    }
}
