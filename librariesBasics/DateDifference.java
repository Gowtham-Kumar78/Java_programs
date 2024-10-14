package librariesBasics;
//Write a program to accept starting_date and ending_date in DD-MM-YYYY format and display no of days between those two dates.
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class DateDifference {
    
   
    public static void main(String[] args) {

       

        Scanner s =new Scanner(System.in);

        System.out.print("Enter Date 1[year(XXXX)-month(xx)-date(xx)]:");
        String d1= s.nextLine();
        
        System.out.print("Enter Date 2[year(XXXX)-month(xx)-date(xx)]:");
        String d2=s.nextLine();

        LocalDate date1=LocalDate.parse(d1);
        LocalDate date2=LocalDate.parse(d2);

        long days=ChronoUnit.DAYS.between(date1, date2);

        System.out.print("Days between two Dates :");
        System.out.println(days);



    }


}
