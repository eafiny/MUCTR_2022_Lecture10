///**
// * Абстрактный класс машины, представленной в астосалоне
// */
//abstract class Car{
//    int maxSpeed;
//    String brand;
//
//    /**
//     * Абстрактный метод, должен быть переопределен в каждом подклассе
//     */
//    public abstract void displayPromo();
//
//    /**
//     * Метод, показывающий информацию о машине
//     */
//    public void showInformation(){
//        System.out.println(brand + ", скорость " + maxSpeed + "км/ч");
//    }
//}
//
///**
// * Класс, описывающий машины "BMW"
// */
//class BMWCar extends Car{
//    public BMWCar(){
//        brand = "BMW";
//        maxSpeed = 200;
//    }
//
//    @Override
//    public void displayPromo(){
//        System.out.println("BMW Car!");
////        displayVideoFile
//    }
//}
//
//public class CarDemo {
//    public static void main(String[] args){
//        Car bmw = new BMWCar();
//        bmw.showInformation();
//    }
//}
