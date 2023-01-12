package task2;

public class MotorCars extends Transport implements Competing {
    public MotorCars(String brand, String model, double engine) {
        super(brand, model, engine);
    }

    public void start() {
        System.out.println("Вставьте ключ в замок зажиганияи двигатель");
    }

    public void finish() {
        System.out.println("Выключить зажигание и выйти из машины");
    }

    public String toString() {
        return "Машина: " + super.toString();
    }

    public void pitStop() {
        System.out.println("Заехать в боксы");
        System.out.println("Заправить машину и сменить резину");
    }

    public void lapTime() {
        System.out.println("Лучшая скорость круга у машины");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость у машины");
    }
}

