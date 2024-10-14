//31. Create an insufficientBalanceException Class with the message "Insufficient Balance X for withdrawal of Y".


class InsufficientBalanceException extends RuntimeException{

    public InsufficientBalanceException(){
        super("Insufficient Balance X for withdrawal of Y");
    }
}


public class Withdraw {

    int balance = 200;

    public void withdrawal(int num){

        try{
            if(num > balance) throw new InsufficientBalanceException();
            else{
                System.out.println("Collect your Money........");
            }
        
        }
        catch(InsufficientBalanceException e){
            System.out.println("Withdraw Failed   "+e);
        }
            
    }

    public static void main(String[] args) {
       Withdraw w = new Withdraw();
       w.withdrawal(500); 
    }

    
}
