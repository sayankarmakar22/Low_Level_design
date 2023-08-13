package Factory_Design;

public class Server extends Computer {
    private int ram;
    private int hdd;
    private int cpu;
    public Server(int ram,int hdd,int cpu){
        this.ram = ram;
        this.hdd = hdd;
        this.cpu = cpu;
    }
    @Override
    public int getRAM() {
        return this.ram;
    }

    @Override
    public int getHDD() {
        return this.hdd;
    }

    @Override
    public int getCPU() {
        return this.cpu;
    }

    @Override
    public String toString() {
        return "Server{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", cpu=" + cpu +
                '}';
    }
}
