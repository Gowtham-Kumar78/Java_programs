/*
 * 15. Create a class Student that stores the details like admin_no, stu_name, course_joined and fees_paid.
—> Courses are: JAVA, PYTHON.
—> The total fees for java is 10k and for python is 7.5k.
—> Provide a constructor to take required details.The default course is JAVA.
—> Provide the following methods: getTotalFee(), getDue(), getFeePaid(), payment(amount).
 */

public class Student {
    int admin_no;
    String stu_name;
    String course_joined;
    double fees_paid;
    double courseFee;

    Student(int admin_no,String stu_name, double fees_paid){
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined="JAVA";
        this.fees_paid=fees_paid;
    }

    Student(int admin_no,String stu_name, String course_joined, double fees_paid){
        this.admin_no=admin_no;
        this.stu_name=stu_name;
        this.course_joined=course_joined;
        this.fees_paid=fees_paid;
    }

    void getTotalFee(){ 
        if (course_joined.equalsIgnoreCase("java")){
            courseFee=10000;
            System.out.println("Course Fee for JAVA : " + courseFee );

        }
        else if(course_joined.equalsIgnoreCase("python")){
            courseFee=7500;
            System.out.println("Course Fee for Python : " + courseFee );

        }
        else{
            System.out.println("Invalid Course");
        }

        
    }


    void getDue(){
        System.out.println(" Fee Due : "+(courseFee-fees_paid));

    }

    void fees_paid(){
        System.out.println("Fee Paid :"+fees_paid);

    }

    void payment(double amount){
        System.out.println("Fee before Payment : " + fees_paid);
        fees_paid+=amount;
        System.out.println("Fee After payment : "+ fees_paid);
        
    }

    public static void main(String[] args) {
        Student s1=new Student(12,"Uday","Python",7000) ;
        
        s1.getTotalFee();
        s1.getDue();
        s1.payment(400);


        Student s2 = new Student(21,"Indrajeet" ,4030);  
        
        s2.getTotalFee();
        s2.getDue();
    
    }

}
