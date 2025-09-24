public class OfficeComputerBuilder implements ComputerBuilder {

    private Computer computer;

    public OfficeComputerBuilder() {
        reset();
    }

    private void reset() {
        computer = new Computer();
    }

    @Override
    public void buildProcessor() {
        computer.setProcessor("Super Standard Processor");
    }

    @Override
    public void buildRAM() {
        computer.setRam(16);
    }

    @Override
    public void buildStorage() {
        computer.setStorage("2Tb SSD");
    }

    @Override
    public void buildGPU() {
        computer.setGpu("Super Standard GPU");
    }

    @Override
    public void buildOperatingSystem() {
        computer.setOperatingSystem("Windows 10 Office Edition");
    }

    @Override
    public Computer getComputer() {
        Computer result = computer;
        reset();
        return result;
    }
}
