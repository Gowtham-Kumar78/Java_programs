
import java.util.Scanner;

//7. Write a program to accept the number and display the number in reverse order.


public class ReverseNum {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int num=s.nextInt();

        int reverseNum=0;

        while(num!=0){
            int digit = num%10;
            reverseNum=(reverseNum*10)+digit;
            num=num/10;
        }

        System.out.println(reverseNum);
    }
    
}
