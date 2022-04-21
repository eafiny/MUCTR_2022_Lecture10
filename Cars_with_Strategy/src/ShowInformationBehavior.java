/**
 * Интерфейс, представляющий поведение метода showInformation
 */
public interface ShowInformationBehavior {
    void showInformation(String brand, int speed);
}

/**
 * Класс, описывающий поведение метода showInformation() для реальных машин
 */
class RealCar implements ShowInformationBehavior{
    public void showInformation(String brand, int speed){
        System.out.println("Brand - " + brand + ",  Max Speed is " + speed + " km/h");
    }
}

/**
 * Класс, описывающий поведение метода showInformation() для игрушечных машин
 */
class ToyCar implements ShowInformationBehavior{
    public void showInformation(String brand, int speed){
        System.out.println("I'm a toy car, a little copy of " + brand);
    }
}

