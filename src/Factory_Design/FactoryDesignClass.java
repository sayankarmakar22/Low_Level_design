package Factory_Design;

public class FactoryDesignClass {
    public static Computer getComputer(String type,int ram,int hdd,int cpu){
        if (type.equals("SERVER")){
            return new Server(ram,hdd,cpu);
        }
        else if(type.equals("PC")){
            return new PC(ram,hdd,cpu);
        }
        else{
            return null;
        }
    }
}
