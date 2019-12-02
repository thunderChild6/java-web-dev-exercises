package exercises.technology;

public class Computer extends AbstractEntity{
    public String brand;
    public int memory;
    public boolean hasGames = false;
    public boolean somethingPrinted = false;
    public int idNumber;

    //constructors
    public Computer() { }

    public Computer(String aBrand, int aMemory) {
        this.brand = aBrand;
        this.memory = aMemory;
        idNumber = getIdNumber();
    }

    //my methods
    public void installGames() {
        this.hasGames = true;
    }

    public void printThePaper() {
        somethingPrinted = true;
        System.out.println("It's the paper! \n'Preeeeow, World'");
    }


    @Override
    public String toString() {
        return "Tech ID Num: " + idNumber + " Your " + brand + " computer has " + memory + " memory, and to say it has games would be " + hasGames + ".";
    }


    //getters and setters
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public boolean isHasGames() {
        return hasGames;
    }

    public void setHasGames(boolean hasGames) {
        this.hasGames = hasGames;
    }

}
