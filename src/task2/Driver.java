package task2;

public abstract class Driver<T extends Transport & Competing> {
    private final String name;
    private final Character typeOfLicence;
    private double experience;
    private T car;

    protected Driver(String name, Character typeOfLicence, double experience, T car) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
            if (typeOfLicence != 'B' && typeOfLicence != 'C' && typeOfLicence != 'D') {
                throw new NullPointerException("Нет прав, иди в автошколу");
            } else {
                this.typeOfLicence = typeOfLicence;
                if (car != null) {
                    this.car = car;
                }

                this.setExperience(experience);
            }
        } else {
            throw new NullPointerException("Укажите имя водителя");
        }
    }

    public void startMove() {
        String var10001 = this.name;
        System.out.println(var10001 + " Заводит " + this.car.getBrand() + this.car.getModel());
    }

    public void finishMove() {
        String var10001 = this.name;
        System.out.println(var10001 + " Останавливает " + this.car.getBrand() + this.car.getModel());
    }

    public void fillVehicle() {
        String var10001 = this.name;
        System.out.println(var10001 + " Запрвляет " + this.car.getBrand() + this.car.getModel());
    }

    public Character getTypeOfLicence() {
        return this.typeOfLicence;
    }

    public double getExperience() {
        return this.experience;
    }

    public String getName() {
        return this.name;
    }

    public void setExperience(double experience) {
        if (experience <= 0.0) {
            throw new NullPointerException("Иди учись водить!");
        } else {
            this.experience = experience;
        }
    }

    public void driveInfo() {
        String var10001 = this.name;
        System.out.println("Водитель " + var10001 + " управляет " + this.car.getBrand() + " " + this.car.getModel() + " и будет учавствовать в заезде");
    }

    public String toString() {
        return "Имя водителя: " + this.name + " Категория прав:  " + this.typeOfLicence + "Опыт вождения: " + this.experience;
    }
}

