
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;

//46. Write  a program to accept strings until 'end' is given and sort them and write them into Codes.txt and the string must be one/more alphabets followed by one/more digits.(use Regular Expressions)


public class StringInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Strings: ");
        String str = sc.nextLine();

        Set<String> data = new TreeSet<>();

        while(!str.equalsIgnoreCase("end")){
            if(Pattern.matches("[a-zA-z]+[0-9]+", str)){
                data.add(str.toLowerCase());
            }

            str=sc.nextLine();

        }

        
        try {
            File f = new File("Unique.txt");
            f.createNewFile();
            BufferedWriter bw = new BufferedWriter(new FileWriter(f));

            for(String i : data){
                bw.write(i+"\n");
            }

            bw.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
