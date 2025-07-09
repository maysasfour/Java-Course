package JordanParcelServicesJPS_ShipmentManagementSystem;

public class Person {
    private String name;
    private String nationalID;
    private String address;

    public Person(String name, String nationalID, String address) {
        this.name = name;
        this.setNationalID(nationalID);
        this.address = address;
    }
public Person(){}

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNationalID() {
        return nationalID;
    }
    public void setNationalID(String nationalID) {

        boolean flag = true;
        if (nationalID.length() != 10)
            flag = false;
        else {
            for (int i = 0; i < 10; i++)
                if (nationalID.charAt(i) < '0' || nationalID.charAt(i) <= 9)
                    flag = false;
        }
        if(flag)
            this.nationalID = nationalID;
        else
            System.out.println("Invalid ID");
        this.nationalID="";
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", nationalID='" + nationalID + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
