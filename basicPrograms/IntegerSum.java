/**
 * 9. Write a program to create a function that takes a set of integers and returns the largest of integers.

 */
public class IntegerSum {

    public int integerSum(int... num){
        int max=num[0];
        for(int i=1;i<num.length;i++){
            if(num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {

        IntegerSum s=new IntegerSum();
        int result=s.integerSum(2,3,4,55,7,8,9);
        System.out.println(result);
        
    }
    
}