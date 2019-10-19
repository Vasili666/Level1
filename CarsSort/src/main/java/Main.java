import java.util.ArrayList;

//Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString(). Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
public class Main {

    public static void main(String[] args) {


        ArrayList<Car> carsList= new ArrayList<Car>();
        carsList.add(new Car(1,"AUDI","A2",2001,"Black",3200,"0000 BT-5"));
        carsList.add(new Car(2,"BMW","120",2006,"White",5600,"0001 BT-5"));
        carsList.add(new Car(3,"BMW","525",2007,"Silver",6900,"0002 BT-5"));
        carsList.add(new Car(4,"Mercedes-Benz","S 600",2011,"Black",12500,"0003 BT-5"));
        carsList.add(new Car(5,"Mercedes-Benz","E 240",2005,"Red",4600,"0004 BT-5"));
        carsList.add(new Car(6,"BMW","X3",2017,"Red",35200,"0006 BT-5"));
        carsList.add(new Car(7,"BMW","X3",2018,"White",37100,"0007 BT-5"));
        carsList.add(new Car(8,"BMW","X3",2017,"Red",34300,"0008 BT-5"));
        carsList.add(new Car(9,"BMW","X3",2016,"Black",38600,"0009 BT-5"));
        carsList.add(new Car(10,"AUDI","A3",2016,"Black",31200,"0010 BT-5"));
        carsList.add(new Car(11,"AUDI","A5",2016,"Black",32300,"0011 BT-5"));
        carsList.add(new Car(12,"AUDI","A7",2015,"Black",32500,"0012 BT-5"));

        Car.chooseProducer(carsList);//a) список автомобилей заданной марки;
        Car.chooseModelAndLYear(carsList);  //b) список автомобилей заданной модели, которые эксплуатируются больше n лет;
        Car.chooseYearAndLPrice(carsList);//c) список автомобилей заданного года выпуска, цена которых больше указанной.*/


        //printResult(carsList); Вывод всего списка

    }

    public static void printResult(ArrayList<Car> lists){
        for (Car c:lists) {
            System.out.println(c);
        }

    }

}
