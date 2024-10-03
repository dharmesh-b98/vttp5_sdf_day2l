package object;

public class Computer {
    private String cpu;
    private String model;
    private Integer ram;
    private Integer yearMade;

    //constructor has no return datatype

    public Computer(){
        this.cpu = "Intel i7";
        this.model = "Dell";
        this.ram = 16;
        this.yearMade = 1997;

    }

    public Computer(String cpu, String model, Integer ram, Integer yearMade){ 
        this.cpu = cpu;
        this.model = model;
        this.ram = ram;
        this.yearMade = yearMade;
    }

    //getters and setters
    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getYearMade() {
        return yearMade;
    }

    public void setYearMade(Integer yearMade) {
        this.yearMade = yearMade;
    }

    //functions
    public void start(){
        System.out.printf("%s has started \n", this.model);
    }

    public void shutdown(){
        System.out.printf("%s has shutdown \n", this.model);
    }

    public void displaySpec(){
        System.out.printf("System Specifications are as follows \n cpu = %s \n model = %s \n ram = %d \n yearmade = %d \n",this.getCpu(), this.getModel(), this.getRam(), this.getYearMade());
    }


}
;