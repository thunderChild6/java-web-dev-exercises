package exercises.technology;

public class SmartPhone extends Computer {
    private int screenSize;
    private boolean isScreenCracked = false;

    //constructor
    public SmartPhone() {}

    public SmartPhone(String brand, int memory, int screenSize) {
        this.brand = brand;
        this.memory = memory;
        this.screenSize = screenSize;
        this.hasGames = hasGames;
        this.isScreenCracked = isScreenCracked();
        idNumber = getIdNumber();
    }

    //my methods
    public void droppedIt() {
        isScreenCracked = true;
    }

    @Override
    public String toString() {
        return "Tech ID Num: " + idNumber + " Your " + brand + " smartphone has " + memory + " memory, a " + screenSize + " inch screen size, and to say it has games would be " + hasGames + ". But is the screen cracked? " + isScreenCracked;
    }

    //getters and setters
    public int getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }

    public boolean isScreenCracked() {
        return isScreenCracked;
    }

    public void setScreenCracked(boolean screenCracked) {
        isScreenCracked = screenCracked;
    }
}
