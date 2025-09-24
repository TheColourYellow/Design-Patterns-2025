public class Main {
    public static void main(String[] args) {
        ComputerBuilder builder = new GamingComputerBuilder();
        ComputerBuilder builder2 = new OfficeComputerBuilder();

        Director director = new Director(builder);
        director.constructComputer();

        Computer computer = builder.getComputer();
        computer.computerDetails();
    }
}
