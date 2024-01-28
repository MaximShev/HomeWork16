public class Main {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);

        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Service[] services = {bicycle, bicycle2, car, car2, truck, truck2};
        ServiceStation station = new ServiceStation();
        for (Service service : services) {
            station.check(service);
        }
    }
}