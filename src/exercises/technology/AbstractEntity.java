package exercises.technology;

public abstract class AbstractEntity {

    public int idNumber;
    public static int uniqueId = 100;

    //constructor
    public AbstractEntity() {
        idNumber = uniqueId;
        uniqueId++;
    }

    //my methods
//    public int getUniqueId() {
//        return idNumber++;
//    }

    //getters and setters

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

}
