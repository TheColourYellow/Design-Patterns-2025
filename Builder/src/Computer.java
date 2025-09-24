public class Computer {
    private String processor;
    private int ram;
    private String storage;
    private String gpu;
    private String operatingSystem;

    public void setProcessor(String processor) {this.processor = processor;}
    public void setRam(int ram) {this.ram = ram;}
    public void setStorage(String storage) {this.storage = storage;}
    public void setGpu(String gpu) {this.gpu = gpu;}
    public void setOperatingSystem(String operatingSystem) {this.operatingSystem = operatingSystem;}

    public void computerDetails() {
        System.out.println("Computer details: ");
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram);
        System.out.println("Storage: " + storage);
        System.out.println("Gpu: " + gpu);
        System.out.println("Operating System: " + operatingSystem);
    }
}
