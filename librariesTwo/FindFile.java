
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Scanner;

/**
 * 47. Write a program to display the file which contains the given string in a path.

 */
public class FindFile {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Path");

        String path = sc.nextLine();

        try {
            File f = new File(path);
            if(f.exists()){
                BufferedReader br = new BufferedReader(new FileReader(f));
                String line;
                while(true){
                    line=br.readLine();
                    if(line==null){break;}
                    System.out.println(line);
                }

                br.close();

            }else{
                System.out.println("File not Found");
                
            }
            

        } catch (Exception e) {
        }
    }
}