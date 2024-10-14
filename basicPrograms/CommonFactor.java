//10. Write a program to create a function that takes multiple numbers and displays common factors.


public class CommonFactor {

    public void commonFactors(int... num){
        int min=num[0];
        
        //to find minimum element
        for(int i=1;i<num.length;i++){
            if(num[i]<min){
                min=num[i];
            }
        }

        // to find factors of minimum number
        int[] factors =new int[min];
        int fact=0;

        for (int i=1;i<=min;i++){
            
            if(min%i==0){
                factors[fact]=i;
                fact++;

            }
        }
            
        // to find common factors
        for (int i=0;i<factors.length;i++){
            if(factors[i]==0){continue;}
            int count=0;
            for(int j=0;j<num.length;j++){
                if(num[j]%factors[i]!=0){
                count++;
               }

            }
            if(count==0){
                System.out.println(factors[i]);
            }
        }
                
    }
    
    public static void main(String[] args) {
        CommonFactor c=new CommonFactor();
        c.commonFactors(10,20,30);
    }
}
