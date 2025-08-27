public class Main {
    public static void main(String[] args) {

        Template t1 = new Department("Marketing");
        Template t2 = new Department("Technology");
        Template t3 = new Department("Research");

        Template e1 = new Employee("John", 2000);
        Template e2 = new Employee("Jane", 2000);
        Template e3 = new Employee("Bob", 2000);
        Template e4 = new Employee("Mike", 2000);
        Template e5 = new Employee("Jack", 2000);

        //John and Jane work in Marketing department
        t1.add(e1);
        t1.add(e2);

        //Bob works in Technology department
        t2.add(e3);

        //Mike and Jack work in Research department
        t3.add(e4);
        t3.add(e5);

        //Research department is part of the Technology department
        t2.add(t3);
        //Technology department is part of the Marketing department
        //Much to everyone's displeasure
        t1.add(t2);

        t1.printData();
        //Only calculates within one department
        System.out.println("Total salary is: " + t1.getTotalSalary());
        t1.toXML();
    }
}
