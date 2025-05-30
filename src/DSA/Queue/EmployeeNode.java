package DSA.Queue;

public class EmployeeNode {
    private Employee data;
    private EmployeeNode next;

    public EmployeeNode(Employee data) {
        this.data = new Employee(data.getId(),data.getName(),data.getSalary());
        this.next = null;
    }

    public Employee getData() {
        return data;
    }

    public void setData(Employee data) {
        this.data = data;
    }

    public EmployeeNode getNext() {
        return next;
    }

    public void setNext(EmployeeNode next) {
        this.next = next;
    }
}
