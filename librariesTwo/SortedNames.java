
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.TreeSet;



public class SortedNames {
    public static void main(String[] args) {

        TreeSet<String> names= new TreeSet<>();
        
        try {
            File f = new File("Names.txt");
            BufferedReader br = new BufferedReader(new FileReader(f));
        
            String lines=br.readLine();
            while(lines!=null){
              names.add(lines);
              lines=br.readLine();
            }
            
        } catch (Exception e) {
            // TODO: handle exception
        }

        System.out.println(names);

    }
}
