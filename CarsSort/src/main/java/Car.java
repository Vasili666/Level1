import java.util.ArrayList;


public class Car {
    private int id;
    private String producer;
    private String model;
    private int yearProduced;
    private String color;
    private int price;
    private String registrationNumber;



    public Car(int id){
        this.id=id;
    }


    public Car(int id, String producer){
        this(id);
        this.producer=producer;
    }
    public Car(int id, String producer, String model){
        this( id, producer);
        this.model=model;

    }
    public Car(int id, String producer, String model, int yearProduced){
        this( id, producer,model);
        this.yearProduced=yearProduced;
    }
    public Car(int id, String producer, String model, int yearProduced, String color){
        this( id, producer,model,yearProduced);
        this.color=color;
    }
    public Car(int id, String producer, String model, int yearProduced, String color, int price){
        this( id, producer,model,yearProduced,color);
        this.price=price;
    }
    public Car(int id, String producer, String model, int yearProduced, String color, int price, String registrationNumber){
        this( id, producer,model,yearProduced,color,price);
        this.registrationNumber=registrationNumber;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYearProduced() {
        return yearProduced;
    }

    public void setYearProduced(int yearProduced) {
        this.yearProduced = yearProduced;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }


    @Override
    public String toString() {
        return  "Порядковый номер: " + getId() +"; "+
                "Производитель: " + producer +"; "+
                "Модель: " + model +"; "+
                "Год выпуска: " + yearProduced +"; "+
                "Цвет: " + color +"; "+
                "Цена: " + price +"; "+
                "Регистрационный номер: " + registrationNumber;

    }
    public  static void chooseProducer(ArrayList<Car> lists){
        System.out.println("\nВыборка по производителю: ");
// Выборка  по Производителю
        for (Car c:lists ){
            if (c.getProducer().equals("BMW")){
                System.out.println(c);

            }
        }

    }
    public static void chooseModelAndLYear(ArrayList<Car> lists){

        System.out.println("\nВыборка по модели и году: ");

        for (Car c:lists ){
            if (c.getModel().equals("X3")&&c.getYearProduced()>2016){
                System.out.println(c);

            }
        }
    }

    public static void chooseYearAndLPrice(ArrayList<Car> lists){

        System.out.println("\nВыборка по году и цене: ");

        for (Car c:lists ){
            if ((c.getYearProduced()==2016)&&(c.getPrice()>32000)){
                System.out.println(c);

            }
        }
    }


}
/*
8. Car: id, Марка, Модель, Год выпуска, Цвет, Цена, Регистрационный номер.

        Создать массив объектов. Вывести:

        a) список автомобилей заданной марки;

        b) список автомобилей заданной модели, которые эксплуатируются больше n лет;

        c) список автомобилей заданного года выпуска, цена которых больше указанной.*/
