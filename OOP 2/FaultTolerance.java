import java.util.Scanner;

/**
 * FaultTolerance
 * 
 * 29. Accept five strings which contain numbers and display the total for those numbers. Make your program fault tolerant.
 */
public class FaultTolerance {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int total=0;
        boolean fault=true;

        for (int i=0;i<5;i++){
            String str=s.nextLine();
            
            try{
                int num=Integer.parseInt(str);
                total+=num;
            }
            catch(NumberFormatException e){
                fault=false;
                System.out.println("enter Numbers only");
                break;

            }
        }

        if(fault){
            System.out.println("Sum of numbers : "+total);
        }
            

    }

    
}
