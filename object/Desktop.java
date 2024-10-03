package object;

public class Desktop extends Computer {
    String operatingSystem;
    String waterCooling;
    
    public Desktop(String operatingSystem, String waterCooling) {
        this.operatingSystem = operatingSystem;
        this.waterCooling = waterCooling;
    }
    public Desktop(String cpu, String model, Integer ram, Integer yearMade, String operatingSystem,
            String waterCooling) {
        super(cpu, model, ram, yearMade);
        this.operatingSystem = operatingSystem;
        this.waterCooling = waterCooling;
    }
    public String getOperatingSystem() {
        return operatingSystem;
    }
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public String getWaterCooling() {
        return waterCooling;
    }
    public void setWaterCooling(String waterCooling) {
        this.waterCooling = waterCooling;
    }
    
    @Override    
    public void start(){
        System.out.printf("%s desktop has started \n", this.getModel());
    }

    @Override
    public void shutdown(){
        System.out.printf("%s desktop has shutdown \n", this.getModel());
    }

    @Override
    public void displaySpec(){
        System.out.printf("System Specifications are as follows \n cpu = %s \n model = %s \n ram = %d \n yearmade = %d \n",this.getCpu(), this.getModel(), this.getRam(), this.getYearMade());
        System.out.println("weight: " + this.getWaterCooling());
        System.out.println("battery: " + this.getOperatingSystem());
    }

    

}
