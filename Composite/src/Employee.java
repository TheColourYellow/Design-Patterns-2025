public class Employee extends Template {

    private String name;
    private int salary;

    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void printData() {
        System.out.println("Employee Name: " + name + " Salary: " + salary + "€");
    }

    @Override
    public void add(Template template) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public void remove(Template template) {
        throw new UnsupportedOperationException("Not supported yet.");

    }

    @Override
    public Template getChildren(int index) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public int getTotalSalary() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void toXML() {
        System.out.println("      <Employee>");
        System.out.println("         <name> " + name + " </name>");
        System.out.println("         <salary> " + salary + " </salary>");
        System.out.println("      </Employee>");
    }

    public int getSalary() {
        return salary;
    }

}
