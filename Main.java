public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle("6688069", "Honda Freed", "GB3", 2008, "Honda", 974000);

        System.out.println("Vehicle Information:");
        System.out.println("Serial Number: " + vehicle.getSerialNumber());
        System.out.println("Name: " + vehicle.getName());
        System.out.println("Model: " + vehicle.getModel());
        System.out.println("Year: " + vehicle.getYear());
        System.out.println("Manufacturer: " + vehicle.getManufacturer());
        System.out.println("Base Cost: " + vehicle.getBaseCost());
    }
}
