package javacombined.src317.association.aggregation;

public class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "Rahul Singh",
                new Address("Jaipur", "Rajashtan", "India"));
        //here toString method of employee will call
        System.out.println(employee);
    }
}
