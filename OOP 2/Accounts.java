//27. Write a program to create an interface called account operation with methods deposit(), getBalance().Implement this interface in Account class.

public class Accounts implements InterfaceAccount {
    int balance=0;

    public void deposit(int n){
        System.out.println("Amount Deposited :"+n);
        balance+=n;
    }

    public void getBalance(){
        System.out.println("Your Account Balance :"+(balance));
    }


    public static void main(String[] args) {
        Accounts a=new Accounts();

        a.deposit(100);
        a.deposit(400);
        a.deposit(1000);
        a.getBalance();
    }
}
