
import java.util.Scanner;

//Write a program to accept the number and display the largest factor other than the number.

public class LargestFactor {

    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        int num =s.nextInt();

        for(int i=num-1;i>=1;i--){
            if (num%i==0){
                System.out.println(i);
                break;
            }

        }
    }
    
}
