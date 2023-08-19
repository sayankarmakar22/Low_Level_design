package AbstractFactoryDesign;

public class Driver {
    public static void main(String[] args) {
        Computer pc = ComputerFactory.getComputer(new PCFactory("2gb","500gb","2.4ghz"));
        System.out.println(pc.getCPU());
    }
}
