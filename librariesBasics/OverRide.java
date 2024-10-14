package librariesBasics;
class OverRide {


    
    public boolean equals() {
        System.out.println(" overiding equals method  ");
        return true;
    }

  
    public String toString() {
        System.out.println(" overiding toString method  ");
        return " ";
    }

    
    public int hashCode() {
        System.out.println(" overiding hashCode method  ");
        return 0;
    }

    public static void main(String[] args) {
        OverRide o = new OverRide();
        o.equals();
        o.toString();
        o.hashCode();
    }
}
