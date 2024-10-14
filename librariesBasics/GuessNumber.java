package librariesBasics;
/*
18. Write a program to guess the random number in three attempts. The range is (1 to 25). 
*/

import java.util.Scanner;
public class GuessNumber {
    public static void main(String[] args) {
        int num =(int) (Math.random()*26);

        Scanner s = new Scanner(System.in);

        for (int i=1;i<4;i++){
            System.out.printf("Enter Number for %d time :",i);
            int n =s.nextInt();
            if (n==num){
                System.out.println("It's a Match");
                break;
            }
            else{
                System.out.println("Try again");
            }
        }
        System.out.println("The actual number is :"+num);


    }
}
