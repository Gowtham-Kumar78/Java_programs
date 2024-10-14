
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//38. Write a program to accept a file and convert its contents to uppercase.(write in compact way)

public class UpperCaseString {
    public static void main(String[] args) {

        List<String> lines = new ArrayList<>();
        
        try {
            File f = new File("stringData.txt");
            BufferedReader br =new BufferedReader(new FileReader(f));
            while(true){
                String line = br.readLine();
                if(line==null){break;}
                lines.add(line.toUpperCase());
               
            }
            br.close();
           
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }catch(IOException i){
            System.out.println(i);
        }




        try {
            File f = new File("stringData.txt");
            BufferedWriter bw = new BufferedWriter(new FileWriter(f)); 

            for (String s : lines){
                bw.write(s+"\n");
            }

            bw.close();
            
        } catch (Exception e) {
        }



    }
}
