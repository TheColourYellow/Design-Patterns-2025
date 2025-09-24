public class GamingComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public GamingComputerBuilder() {
        reset();
    }

    private void reset() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Super Fast Processor");
    }

    @Override
    public void buildRAM() {
        computer.setRam(64);
    }

    @Override
    public void buildStorage() {
        computer.setStorage("8Tb SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGpu("Super Fast GPU");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 10 Home Edition");

    }

    @Override
    public Computer getComputer() {
        Computer result = computer;
        reset();
        return result;

    }
}
