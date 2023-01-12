package task2;

public abstract class Transport {
    private final String brand;
    private final String model;
    private final double engine;

    public Transport(String brand, String model, double engine) {
        if (brand != null && !brand.isEmpty()) {
            this.brand = brand;
        } else {
            this.brand = "Укажите бренд";
        }

        if (model != null && !model.isEmpty()) {
            this.model = model;
        } else {
            this.model = "Укажите марку";
        }

        if (engine < 0.0) {
            this.engine = 0.0;
            System.out.println("Укажите объем двигателя");
        } else {
            this.engine = engine;
        }

    }

    public String getBrand() {
        return this.brand;
    }

    public String getModel() {
        return this.model;
    }

    public double getEngine() {
        return this.engine;
    }

    public abstract void start();

    public abstract void finish();
}

