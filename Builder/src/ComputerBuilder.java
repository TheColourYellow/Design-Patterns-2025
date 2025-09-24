public interface ComputerBuilder {
    void buildProcessor();
    void buildRAM();
    void buildStorage();
    void buildGPU();
    void buildOperatingSystem();

    Computer getComputer();
}
