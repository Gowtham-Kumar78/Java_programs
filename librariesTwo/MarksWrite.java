
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;


//37. Write 20 marks into Marks.data.

public class MarksWrite {
    public static void main(String[] args) {
        File f = new File("marksData.txt");
        try {
            FileWriter fr = new FileWriter(f);
            for (int i=1;i<21;i++){
               
                fr.write((String.valueOf((int)(Math.random()*100))));//generating 20 random numbers
                
                fr.append("\n");
            }
            fr.close();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
