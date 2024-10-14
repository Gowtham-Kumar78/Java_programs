//42. Create a treeset of strings and sort them by length (use Comparator)

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

class Helper implements Comparator<String>{
    public int compare(String s1,String s2){
        
        if(s1.length() > s2.length())
        return -1;
        else
        return 1;
    }
}

public class TreeSetString {


    public static void main(String[] args) {

        
        Set<String> names = new TreeSet<>(new Helper());
        names.add("Gowtham");
        names.add("Arun");
        names.add("Chandini");
        names.add("Srinu");
        names.add("Ramesh");
        
       
        
        names.forEach(n-> System.out.println(n));

        

    }
}
