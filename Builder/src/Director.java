public class Director {

    private ComputerBuilder builder;

    public Director(ComputerBuilder builder) {
        this.builder = builder;
    }
/*
    public void constructGamingComputer() {
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildGPU();
        builder.buildStorage();
        builder.buildOperatingSystem();
    }
    public void constructOfficeComputer() {
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildGPU();
        builder.buildStorage();
        builder.buildOperatingSystem();
    }*/
    public void constructComputer() {
        builder.buildProcessor();
        builder.buildRAM();
        builder.buildGPU();
        builder.buildStorage();
        builder.buildOperatingSystem();
    }
}
