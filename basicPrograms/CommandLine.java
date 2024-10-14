/**
 * CommandLine
 * 11. Write a program to consider command line arguments num, length as inputs (where length is optional) if you won't get that use default number as length.
 */
public class CommandLine {
    public static void main(String[] args) {
        if(args.length!=0){
            System.out.println(args[0]);
        }
        else{
            System.out.println(231);
        }
    }
    
}