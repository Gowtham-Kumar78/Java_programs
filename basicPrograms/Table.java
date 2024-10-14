//3. Write a program to print a table for number 15 with length 10.(use printf)


public class Table {
    public static void main(String[] args) {
        int n=15;
        for(int i=1;i<=10;i++){
            System.out.printf("%d x %d = %d \n",n,i,(n*i));
        }
    }
}
