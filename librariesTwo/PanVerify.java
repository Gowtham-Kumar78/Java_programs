
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//43. Write a program to accept pan no and check whether it is valid or not.


public class PanVerify {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter PAN number");
        String num = sc.nextLine();

        Pattern p = Pattern.compile("[A-Z]{5}[0-9]{4}[A-Z]");
        Matcher m = p.matcher(num);
    

        if(m.matches()){
            System.out.println("valid PAN number");
        }
        else{
            System.out.println("Invalid PAN number");
        }
    }
}
