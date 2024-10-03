import java.util.ArrayList;
import java.util.List;

import object.Computer;
import object.Laptop;
import object.Desktop;

public class App {  
    public static void main(String[] args){
        Computer computer2 = new Computer();
        //computer2.setCpu("Apple M1");
        //computer2.start();
        //computer2.shutdown();
        //computer2.displaySpec();


        Laptop laptop2 = new Laptop(2,"Big Battery", "16inch");
        laptop2.setCpu("Intel");
        laptop2.setModel("xps");
        laptop2.setRam(16);
        laptop2.setYearMade(2000);

        Desktop desktop2 = new Desktop ("Windows", "yes");
        desktop2.setCpu("GTX2040");
        desktop2.setModel("Zephyrus");
        desktop2.setRam(32);
        desktop2.setYearMade(2024);

        List<Computer> machines = new ArrayList<Computer>();
        machines.add(desktop2);
        machines.add(computer2);
        machines.add(laptop2);

        for(Computer com: machines){
            com.start();
            com.displaySpec();
            System.out.println(" ");
        }
    }
}
