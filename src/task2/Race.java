package task2;
public class Race {
    public Race() {
    }

    public static void main(String[] args) {
        MotorCars car1 = new MotorCars("Lada", "2109", 1.7);
        new MotorCars("Ford", "Mustang", 3.5);
        new MotorCars("Mazda", "RX-7", 1.3);
        new MotorCars("Toyota", "Supra", 2.0);
        new Truck("KAMAZ", "4326-9", 17.0);
        new Truck("Tatra", "Phoenix", 12.5);
        Truck truck3 = new Truck("Renault", "Phoenix", 14.5);
        new Truck("Iveco", "Valtr Racing", 13.8);
        new Bus("AEC", "Routemaster", 9.6);
        new Bus("KAMAZ", "6282", 0.0);
        Bus bus3 = new Bus("Göppel ", "Extra Grant", 9.3);
        new Bus("MAZ", "215", 8.2);
        DriverB alex = new DriverB("Alex", 'B', 10.0, car1);
        DriverC vasiliy = new DriverC("Vasiliy", 'C', 2.0, truck3);
        DriverD ivan = new DriverD("Ivan", 'D', 7.0, bus3);
        System.out.println(alex);
        alex.driveInfo();
        System.out.println(vasiliy);
        vasiliy.driveInfo();
        System.out.println(ivan);
        ivan.driveInfo();
    }
}
