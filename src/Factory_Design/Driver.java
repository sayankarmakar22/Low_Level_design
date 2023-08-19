package Factory_Design;

public class Driver {
    public static void main(String[] args) {
        Computer pc = FactoryDesignClass.getComputer("PC",2,500,2);
        Computer server = FactoryDesignClass.getComputer("SERVER",16,1,2);
        System.out.println("Factory PC Config::"+pc);
        System.out.println("Factory Server Config::"+server);
    }
}
