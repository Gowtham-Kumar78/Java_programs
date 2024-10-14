
import java.io.*;
import java.util.LinkedHashSet;
import java.util.Set;



public class NamesOrderDisplay {
    public static void main(String[] args) {

        Set<String> names = new LinkedHashSet<>();
        
        try {

            File f1 = new File("name1.txt");
            File f2 = new File("names2.txt");

            BufferedReader br1 = new BufferedReader(new FileReader(f1));
            BufferedReader br2 = new BufferedReader(new FileReader(f2));

            String s1=br1.readLine();
            
            String s2=br2.readLine();

            while(true){

                if(s1==null && s2 == null){break;}
                
                if(s1!=null){
                    names.add(s1);
                    s1=br1.readLine();
                }
                if(s2!=null){
                    names.add(s2);
                    s2=br2.readLine();
                }


            }

            br1.close();

        } catch (Exception e) {
            // TODO: handle exception
        }
        
        System.out.println(names);
    }
}
