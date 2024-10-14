
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

//36. File Marks.txt, which have marks separated by comma in different lines.Find the total marks of each line and display them.(Use fault tolerance)


public class TotalMarks {
    public static void main(String[] args) {

        
        int count=0;
        File f = new File("Marks.txt");
        try {
            BufferedReader br = new BufferedReader(new FileReader(f));

            while(true){
                String line = br.readLine();
                if(line==null){break;}
                String[] marks = line.split("[,]");
                int sum =0;
                
                for(int i = 0;i<marks.length;i++){
                    
                    sum+=Integer.parseInt(marks[i]);
                }
                count++;
               System.out.printf("sum of %d line : %d \n",count,sum);

            }

            br.close();
           

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}
