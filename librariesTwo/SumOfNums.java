
import java.util.Scanner;

//32. Write a program to accept some numbers from the user until 'O' and display the sum of +ve numbers.

/**
 * SumOfNums
 */
public class SumOfNums {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;

        while(num!=0){
            sum+=num;
            num=sc.nextInt();

        }
        System.out.println(sum);
    }
}



