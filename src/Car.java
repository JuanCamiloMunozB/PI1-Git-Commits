public class Car {

    private boolean wheels;
    private int cylinders;

   
    public Car(boolean wheels, int cylinders) {
        this.wheels = wheels;
        this.cylinders = cylinders;
    }


    public boolean isWheels() {
        return wheels;
    }

    public int getCylinders() {
        return cylinders;
    }

    
    public void setWheels(boolean wheels) {
        this.wheels = wheels;
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }

   
    @Override
    public String toString() {
        return "Wheels: " + wheels + " Cylinders: " + cylinders + "\n";
    }
}
