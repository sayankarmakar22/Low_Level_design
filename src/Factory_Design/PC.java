package Factory_Design;

public class PC extends Computer {
    private int ram;
    private int hdd;
    private int cpu;
    public PC(int ram,int hdd,int cpu){
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
        return "PC{" +
                "ram=" + ram +
                ", hdd=" + hdd +
                ", cpu=" + cpu +
                '}';
    }
}
