package javacombined.src317.association.aggregation;

public class Employee {
    int id;
    String empName;
    //aggregation
    Address address;

    public Employee() {
    }

    public Employee(int id, String empName, Address address) {
        this.id = id;
        this.empName = empName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmpName() {
        return empName;
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public Address getAddress() {
        return address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", empName='" + empName + '\'' +
                ", address=" + address +
                '}';
    }
}
