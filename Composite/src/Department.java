import java.util.ArrayList;
import java.util.List;

public class Department extends Template {

    private String name;
    private int totalSalary;

    private List<Template> entities = new ArrayList<>();

    public Department(String name) {
        this.name = name;
    }
    
    @Override
    public void printData() {
        System.out.println(" \n Department Name: " + name);
        for (Template te : entities) {
            te.printData();
        }
        System.out.println("----------------------------------");

    }

    @Override
    public void add(Template template) {
        entities.add(template);

    }

    @Override
    public void remove(Template template) {
        entities.remove(template);

    }

    @Override
    public Template getChildren(int index) {
        return entities.get(index);
    }

    @Override
    public int getTotalSalary() {
        for (Template te : entities) {
            if (te instanceof Employee) {
                totalSalary += ((Employee) te).getSalary();
            }
        }
        return totalSalary;
    }

    @Override
    public void toXML() {
        System.out.println("<Department>");
        System.out.println("  <name> " + name + " </name>");
        System.out.println("   <Employees>");
        for (Template te : entities) {
            te.toXML();
        }
        System.out.println("   </Employees>");
        System.out.println("</Department>");

    }
}
