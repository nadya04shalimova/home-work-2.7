package task2;

import java.time.LocalDate;

public class Car {
    private String marka;
    private String model;
    private double value;
    private String color;
    private int year;
    private String country;

    public Car(String marka, String model, double value, String color, int year, String country) {
        if (marka == null) {
            this.marka = "default";
        } else {
            this.marka = marka;
        }

        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }

        if (value == 0.0) {
            this.value = 1.5;
        } else {
            this.value = value;
        }

        if (color == null) {
            this.color = "white";
        } else {
            this.color = color;
        }

        if (year == 0) {
            this.year = 2000;
        } else {
            this.year = year;
        }

        if (country == null) {
            this.country = "default";
        } else {
            this.country = marka;
        }

    }

    public String toString() {
        return this.marka + this.model + this.value + this.color + this.year + this.country;
    }



    public boolean diagnostic()throws CantDiagnosticException{
        int month;
        LocalDate localDate=LocalDate.now();
        month=localDate.getMonthValue();
        if ((month>0&& month<5)||month>10){
            System.out.println("Автомобиль "+ getBrand()+" "+getModel()+ " нуждается в смене резины на зимнюю");
        }else {
            System.out.println("Ставим на автомобиль "+getBrand() +" "+ getModel()+" летнюю резину");
        }
        return false;
    }

    private String getModel() {
        return null;
    }

    private String getBrand() {
        return null;    }


}
