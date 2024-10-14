
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//34. Write a program to accept a filename from the user and display how many uppercase, lowercase and digits the file has.

public class FileCases {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter File Name");
        String fileNmae= s.nextLine();

        File f = new File(fileNmae+".txt");

        int upperCase=0;
        int lowerCase=0;
        int digits = 0;


                
        try {
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);

            

            while(true){

                String line = br.readLine();
                if (line==null){break;}

                for(int i=0;i<line.length();i++){
                    if (line.charAt(i)>=65 && line.charAt(i)<=90){
                        upperCase++;
                    }
                    else if(line.charAt(i)>=97 && line.charAt(i)<=122){
                        lowerCase++;
    
                    }
                    else if (line.charAt(i)>=48 && line.charAt(i)<=57){
                        digits++;
                    }
                }
    
                System.out.println(line);
    

            }
            

           
            br.close();
            fr.close();

     
        } 
        
        catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
        catch( Exception e){
            System.out.println(e);
        }

        

        System.out.println("Uppercase: "+upperCase+"  lower case : "+lowerCase+" digits : "+ digits);
        
    }
}
