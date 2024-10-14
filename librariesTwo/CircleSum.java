
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

//41. Create a class called Circle with x & y radius, Now create Hashset & insert circle objects with some duplicates, 
//and also use treeset for the same for circle objects and see what happens.

class Circle implements Comparable<Circle>{
    int x;
    int y;
    public Circle(int x, int y) {
        this.x = x;
        this.y = y;
    }
    
    public String toString() {
        return "Circle [x=" + x + ", y=" + y + "]";
    }

    public int compareTo(Circle t){
        return 1;
    }
    
}

public class CircleSum {
    public static void main(String[] args) {
        Circle c1 = new Circle(10, 20);
        Circle c2 = new Circle(30, 40);
        Circle c3 = new Circle(10, 20);
        Circle c4 = new Circle(50, 20);
        Circle c5 = new Circle(10, 60);

        Set<Circle> cHash= new HashSet<>();
        Set<Circle> cTree=new TreeSet<>();

        cHash.add(c1);
        cHash.add(c2);
        cHash.add(c3);
        cHash.add(c4);
        cHash.add(c5);


        cTree.add(c1);
        cTree.add(c2);
        cTree.add(c3);
        cTree.add(c4);
        cTree.add(c5);

        System.out.println(cHash);
        System.out.println(cTree);

        cHash.forEach(n->System.out.println(n));
        System.out.println();
        cTree.forEach(n->System.out.println(n));
    }
}
