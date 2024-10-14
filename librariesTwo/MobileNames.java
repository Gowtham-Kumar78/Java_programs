
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

//48. Assume a txt file customers.txt which contains name & mobile no and you need to display in sorted order of name.(Use regular expression)



public class MobileNames {
    public static void main(String[] args) {
        Map<String,Long> data = new TreeMap<>();

        try {
            BufferedReader br = new BufferedReader(new FileReader(new File("customers.txt")));
            String line;
            while(true){
                line=br.readLine();
                if(line==null){break;}

                if(Pattern.matches("[a-zA-z]+ [0-9]{10}", line)){
                    String[] str =line.split(" ");
                    for(String i:str){System.out.println(i);}
                    data.put(str[0],Long.parseLong(str[1]));
                }


                
            }
            
            for(String key : data.keySet()){
                System.out.println("Name : "+key + " &  Mobile : "+ data.get(key));

            }

        } catch (Exception e) {
        }



    }
}
