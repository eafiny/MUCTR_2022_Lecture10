//Потребует доработки для многопоточных приложений

public class Singleton {
    private static Singleton uniqueInstance;

    private Singleton() {
        //...
    }

    public static Singleton getInstance(){
        if (uniqueInstance == null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
//    other methods
}
