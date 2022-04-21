/**
 * Абстрактный класс машины, представленной в автосалоне
 */
abstract class Car{
    ShowInformationBehavior show;
    int MaxSpeed;
    String brand;

    /**
     * Абстрактный метод, должен быть переопределен в каждом подклассе
     */
    public abstract void displayPromo();

    /**
     * Метод, выводящий информацию о машине
     */
    public void showInformation(){
        show.showInformation(brand, MaxSpeed); //аспект поведения объекта делегируется другому классу
    }
}

/**
 * Класс, описывающий машины "BMW"
 */
class BMWCar extends Car{
    public BMWCar(){
        brand = "BMW";
        MaxSpeed = 200;
        show = new RealCar();
    }

    @Override
    public void displayPromo(){
        System.out.println("BMW Car!");
//        displayVideoFile
    }
}

/**
 * Класс, описывающий игрушечные машины
 */
class Toy extends Car{
    public Toy(String b){
        brand = b;
        MaxSpeed = 0;
        show = new ToyCar();
    }

    @Override
    public void displayPromo(){
        System.out.println("Toy Car!");
//        displayVideoFile
    }
}

public class CarDemo {
    public static void main(String[] args){
        Car bmw = new BMWCar();
        bmw.showInformation();

        Car toyToyota= new Toy("Toyota");
        toyToyota.showInformation();

        //динамическое изменение поведения объекта
        System.out.println("Some magic takes place...");
        toyToyota.show = new RealCar();
        toyToyota.MaxSpeed = 300;
        toyToyota.showInformation();
    }
}
