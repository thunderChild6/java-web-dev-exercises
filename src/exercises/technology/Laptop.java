package exercises.technology;

public class Laptop extends Computer {
    public double weight;
    public double batteryTime;

    //constructor
    public Laptop() {}

    public Laptop (String brand, int memory, boolean hasGames) {
        this.brand = brand;
        this.memory = memory;
        this.hasGames = hasGames;
    }

    public Laptop(String brand, int memory, double weight, double batteryTime) {
        this.brand = brand;
        this.memory = memory;
        this.hasGames = hasGames;
        this.weight = weight;
        this.batteryTime = batteryTime;
        idNumber = getIdNumber();
    }

    //my methods
    public double useLappy(double timeUsed) {
        if (batteryTime > 0.0) {
            batteryTime = batteryTime - timeUsed;
        }
        if (batteryTime == 0.0) {
            System.out.println("Dead battery!");
        }
        return batteryTime;
    }

    @Override
    public String toString() {
        return "Tech ID Num: " + idNumber + " Your " + brand + " laptop has " + memory + " memory, weighs " + weight + " weight units, has " + batteryTime + " minutes of battery time, and to say it has games would be " + hasGames + ".";
    }

    //getters and setters
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBatteryTime() {
        return batteryTime;
    }

    public void setBatteryTime(double batteryTime) {
        this.batteryTime = batteryTime;
    }
}
