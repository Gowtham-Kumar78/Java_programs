
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//35. Write a program to display lines that contains more than 5 characters.

public class DisplayLines {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        File f = new File("displaynames.txt");
        try {
            BufferedReader bf = new BufferedReader(new FileReader(f));

            while(true){
                String line = bf.readLine();
                if(line==null){break;}
                if(line.length()>5){
                    System.out.println(line);
                }


            }

            bf.close();
            s.close();


        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
