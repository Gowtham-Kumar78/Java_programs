
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//33. Write a program to accept names from users until 'END' is given and write them into names.txt as one name for the line.


public class AcceptNames {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        File f = new File("Names.txt");
        try {
            f.createNewFile();
            String str = sc.nextLine();
           FileWriter fw = new FileWriter(f);
            
            while(!str.equalsIgnoreCase("end")){
                //fw.append(str);
                fw.write(str);
                fw.write("\n");
                str=sc.nextLine();

            }

            fw.close();
            
        } catch (IOException e) {
            
            e.printStackTrace();
        }

        
    }
}
