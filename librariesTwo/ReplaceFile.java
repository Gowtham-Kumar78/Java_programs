
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//45. Write a program to accept a file and replace one (or) more spaces with a single space.



public class ReplaceFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter File Name");
        String fileName=sc.nextLine();

        List<String> data = new ArrayList<>();
        try {
            File f = new File(fileName+".txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
            String line;
            
            while (true) { 
                line = br.readLine();
                if(line == null){break;}

                data.add(line.replaceAll("[' ']+", " "));
                
                
            }

            br.close();
            

        } catch (FileNotFoundException  e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch(IOException e){
            System.out.println(e);
        }


        try {

            File f2 = new File(fileName+".txt");
            FileWriter bw = new  FileWriter(f2);

            for (String i:data){
                bw.write(i+"\n");
            }

            bw.close();
            
        } catch (Exception e) {
            System.out.println(e);
            
        }
    }
}
