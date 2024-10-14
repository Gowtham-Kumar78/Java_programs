
import java.util.Scanner;

//8. Write a program to create an array of 5 elements and store values into it by taking them from the keyboard and display them in reverse order.


public class ReverseArray {
    public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int[] arr =new int[5];
      for(int i=4;i>=0;i--){
        arr[i]=s.nextInt();
      }

      
      for(int i:arr){
        System.out.print(i+" ");
      }
    }
}
