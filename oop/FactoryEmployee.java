
// 16. Create a subclass called FactoryEmployee, for all factory employees we need to store bus_no, emp_boards.Create a super class related to this subclass.



class Employee {
    
  int empId;
  String name;

  void addEmployee(int id, String name){
    this.empId=id;
    this.name=name;
  }

  void showDetails(){
    System.out.println("Employee Id : "+ empId);
    System.out.println("Employee Name : "+name);
  }
    
    
}


class FactoryEmployee extends Employee {

    int bus_no;
    boolean emp_boards;

    void busBoarding(int bus_no,boolean emp_boards){
      this.bus_no=bus_no;
      this.emp_boards=emp_boards;

      System.out.println("Employee name : "+super.name);
      System.out.println("Employee bus Number : " +bus_no);
      System.out.println("Status of Employee board : "+emp_boards);
    }

    public static void main(String[] args) {

      FactoryEmployee f = new FactoryEmployee();

      f.addEmployee(24, "Uday");
      f.showDetails();
      f.busBoarding(25, true);
      
    }
}
