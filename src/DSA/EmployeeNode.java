package DSA;

public class EmployeeNode {

  private   Employee objEmp;
  private   Date date;
  private EmployeeNode next;


    //data
    // next

    // 25046814
    // YN$AG9B
    public EmployeeNode(Employee obj, Date date) {
        this.objEmp = new Employee(obj.name, obj.id, obj.salary);
        this.date = new Date(date.getDay(),date.getMonth(),date.getYear());
        next=null;
    }

    public Employee getObjEmp() {
        return objEmp;
    }

    public void setObjEmp(Employee obj) {
        this.objEmp = obj;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }

    @Override
    public String toString() {
        return "Employee obj= " + objEmp.toString() + "\nStart date= " + date.toString() ;
    }
}
