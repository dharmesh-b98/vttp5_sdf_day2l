package object;

public class Laptop extends Computer{
    private Integer weight;
    private String battery;
    private String screenSize;
    
    public Laptop(Integer weight, String battery, String screenSize) {
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }
    public Laptop(String cpu, String model, Integer ram, Integer yearMade, Integer weight, String battery,
            String screenSize) {
        super(cpu, model, ram, yearMade);
        this.weight = weight;
        this.battery = battery;
        this.screenSize = screenSize;
    }
    public Integer getWeight() {
        return weight;
    }
    public void setWeight(Integer weight) {
        this.weight = weight;
    }
    public String getBattery() {
        return battery;
    }
    public void setBattery(String battery) {
        this.battery = battery;
    }
    public String getScreenSize() {
        return screenSize;
    }
    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    @Override    
    public void start(){
        System.out.printf("%s laptop has started \n", this.getModel());
    }

    @Override
    public void shutdown(){
        System.out.printf("%s laptop has shutdown \n", this.getModel());
    }

    @Override
    public void displaySpec(){
        System.out.printf("System Specifications are as follows \n cpu = %s \n model = %s \n ram = %d \n yearmade = %d \n",this.getCpu(), this.getModel(), this.getRam(), this.getYearMade());
        System.out.println("weight: " + this.getWeight());
        System.out.println("battery: " + this.getBattery());
        System.out.println("screensize: " + this.getScreenSize());
    }
}
