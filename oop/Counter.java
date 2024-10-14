/*
 * 14. Create a class called Counter that stores a number and provides methods to increment, decrement and return the count. 
 *    Provide the constructor without parameters that sets the values to zero and another constructor with parameters takes the values and starts from there.
 */

public class Counter {
    int count;
    Counter(){
        this.count=0;
    }

    Counter(int n){
        this.count=n;
    }

    void increment(){
        count++;
        System.out.println(count);
    }

    void decrement(){
        count--;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c2 = new Counter(2);

        c.decrement();
        c2.increment();
        c2.increment();
        c2.increment();
    }
}
