public class MotorBike extends AbstractBike implements InterfaceBike {

    @Override
    public void nameOfBike(String x) {
        System.out.println("Name of the Bike: " +x);
    }

    @Override
    public void sizeOfBike(double a) {
        System.out.println("Size of the Bike: " +a);
    }

    @Override
    public void colorOfBike(String y) {
        System.out.println("Color of the bike: " +y);
    }

    @Override
    public void start(String s) {
        System.out.println(s);
    }

    @Override
    public void stop(String st) {
        System.out.println(st);
    }

    @Override
    public void bikeModel(String model) {
        System.out.println("Bike Model: " +model);
    }

    @Override
    public void bikeSpeed(String speed) {
        System.out.println("Bike's Top Speed: " +speed);
    }
}
