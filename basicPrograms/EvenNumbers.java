//2. Write a program to print all even numbers between 1 to 50.


class EvenNumbers {
    public static void main(String[] args){
        for(int i=2;i<=50;i++){
            if(i%2==0){
                System.out.println(i);
            }
        }
    }
}