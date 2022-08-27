import java.util.*;



interface Moveable {
    void move();
}

class Dimensions {
    private int height;
    private int weight;
    private int length;

    Dimensions() {
        // int random_int = (int)Math.floor(Math.random()*(4-1+1)+1);
        height = (int)Math.floor(Math.random()*(4-1+1)+1);
        weight = (int)Math.floor(Math.random()*(4-1+1)+1);
        length = (int)Math.floor(Math.random()*(4-1+1)+1);
    }

    Dimensions(int height, int weight, int length){
        this.height = height;
        this.weight = weight;
        this.length = length;
    }

    void showDetails() {
        System.out.println("this is Dimensions class");
        System.out.println("Length = " + length);
        System.out.println("Weight = " + weight);
        System.out.println("height = " + height);
    }
}

abstract class Appliance implements Moveable {

    public void move() {
        System.out.println("this is a moveable interface");
    }


    private int voltage;
    Dimensions dim = new Dimensions();

    Appliance() {
        voltage = (int)Math.floor(Math.random()*(4-1+1)+1);;
    }


    void showDetails() {
        this.move();
        dim.showDetails();

        System.out.println("the appliance volatge = " + voltage);

    }
    // void move();
}

class Fridge extends Appliance {
    private int volume;

    Fridge() {
        volume = (int)Math.floor(Math.random()*(4-1+1)+1);;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("this is Fridge class");
        System.out.println("volume = " + volume);
        System.out.println("-----------------------");
        System.out.println();
    }
}

class Computer extends Appliance {
    private int CPUFreq;

    Computer() {
        CPUFreq = (int)Math.floor(Math.random()*(4-1+1)+1);;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("this is Computer class");
        System.out.println("CPU Freq = " + CPUFreq);
        System.out.println("-----------------------");
        System.out.println();
    }
}

class LEDLight extends Appliance {
    private int illumination;

    LEDLight() {
        illumination = (int)Math.floor(Math.random()*(4-1+1)+1);;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("this is LED-light class");
        System.out.println("illumination = " + illumination);
        System.out.println("-----------------------");
        System.out.println();
    }
}

class Stove extends Appliance {
    private int Units;

    Stove() {
        Units = (int)Math.floor(Math.random()*(4-1+1)+1);;
    }

    void showDetails() {
        super.showDetails();
        System.out.println("this is Stove class");
        System.out.println("Units = " + Units);
        System.out.println("-----------------------");
        System.out.println();
    }
}

class ApplianceFactory {
    public Appliance createAppliance(String appliance_type) {
        if (appliance_type == null) {
            return null;
        }
        if (appliance_type.equalsIgnoreCase("FRIDGE")) {
    
            return new Fridge();
        } else if (appliance_type.equalsIgnoreCase("COMPUTER")) {
            return new Computer();
        } else if (appliance_type.equalsIgnoreCase("STOVE")) {
            return new Stove();
        } else if (appliance_type.equalsIgnoreCase("LEDLIGHT")) {
            return new LEDLight();
        }
        return null;
    }
}

class Main {
    public static void main(String[] args) {
        ApplianceFactory appfact = new ApplianceFactory();
        ArrayList<Appliance> appliance = new ArrayList<Appliance>();

        // Appliance app1 = appfact.createAppliance("COMputer");
        // Appliance app2 = appfact.createAppliance("Stove");
        // appfact.createAppliance(appliance_type)
        // appliance.add(app1);
        // appliance.add(app2);

        int random_object;
        for (int i = 0; i<5;i++){
            random_object = (int)Math.floor(Math.random()*(4-1+1)+1);
            if (random_object == 1){
                appliance.add(appfact.createAppliance("computer"));
            }
            else if (random_object == 2){
                appliance.add(appfact.createAppliance("Stove"));
            }
            else if (random_object == 3){
                appliance.add(appfact.createAppliance("LEDlight"));
            }
            else if (random_object == 4){
                appliance.add(appfact.createAppliance("fridge"));
            }
        }
        
        // Appliance app1 = appfact.createAppliance("COMputer");
        for (int i = 0; i < appliance.size(); i++) {
            appliance.get(i).showDetails();
        }

    }

}