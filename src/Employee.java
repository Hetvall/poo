public class Employee {
    String name;
    String position;
    int salary;

    public Employee(String name, String position, int salary) {
        this.name = name;
        this.position = position;
        this.salary = salary;
    }

    public void Work(){
        System.out.println(name + " is working as " + position + " developer");
    }
}
