package BuilderDesign;

public class Computer {
    private String hdd;
    private String ram;
    private Boolean isGraphicsCardEnabled;
    private Boolean isBluetoothEnabled;

    public String getHdd() {
        return hdd;
    }

    public String getRam() {
        return ram;
    }

    public Boolean getGraphicsCardEnabled() {
        return isGraphicsCardEnabled;
    }

    public Boolean getBluetoothEnabled() {
        return isBluetoothEnabled;
    }

    private Computer(ComputerBuilder builder){
        this.hdd = builder.hdd;
        this.ram = builder.ram;
        this.isGraphicsCardEnabled = builder.isGraphicsCardEnabled;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "hdd='" + hdd + '\'' +
                ", ram='" + ram + '\'' +
                ", isGraphicsCardEnabled=" + isGraphicsCardEnabled +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                '}';
    }

    public static class ComputerBuilder{
        private String hdd;
        private String ram;
        private Boolean isGraphicsCardEnabled;
        private Boolean isBluetoothEnabled;

        public ComputerBuilder(String hdd,String ram){
                this.hdd = hdd;
                this.ram = ram;
        }

        public ComputerBuilder setGraphicsCardEnabled(Boolean graphicsCardEnabled) {
            isGraphicsCardEnabled = graphicsCardEnabled;
            return this;
        }

        public ComputerBuilder setBluetoothEnabled(Boolean bluetoothEnabled) {
            isBluetoothEnabled = bluetoothEnabled;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }
}
