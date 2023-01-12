package task2;

public class Truck extends Transport implements Competing {
    public Truck(String brand, String model, double engine) {
        super(brand, model, engine);
    }

    public void start() {
        System.out.println("Запрыгнуть в кабину и завести двигатель");
    }

    public void finish() {
        System.out.println("Выключить двигатель и спрыгнуть с подножки");
    }

    public String toString() {
        return "Грузовик: " + super.toString();
    }

    public void pitStop() {
        System.out.println("Заехать в боксы");
        System.out.println("Заправить грузовик и сменить резину");
    }

    public void lapTime() {
        System.out.println("Лучшая скорость круга у грузовика");
    }

    public void maxSpeed() {
        System.out.println("Максимальная скорость у грузовика");
    }
}

