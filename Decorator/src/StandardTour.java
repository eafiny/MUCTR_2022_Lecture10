/**
 * Абстрактный класс тура в какой-либо город
 */
public abstract class StandardTour{
    abstract String getDescription();
    abstract int getCost();
}


class RomaStandardTour extends StandardTour{
    private int days;          //на сколько дней тур
    private int price = 200;   //стоимость одного дня

    public RomaStandardTour(int days) {
        this.days = days;
    }

    @Override
    String getDescription(){
        return "Тур в Рим на " + days + " д.";
    }
    @Override
    int getCost(){
        return days * price;
    }
}


class FlorenceStandardTour extends StandardTour{
    private int days;          //на сколько дней тур
    private int price = 180;   //стоимость одного дня

    public FlorenceStandardTour(int days) {
        this.days = days;
    }

    @Override
    String getDescription(){
        return "Тур во Флоренцию на " + days + " д.";
    }
    @Override
    int getCost(){
        return days * price;
    }
}


class VeniceStandardTour extends StandardTour{
    private int days;          //на сколько дней тур
    private int price = 250;   //стоимость одного дня

    public VeniceStandardTour(int days) {
        this.days = days;
    }

    @Override
    String getDescription(){
        return "Тур в Венецию на " + days + " д.";
    }
    @Override
    int getCost(){
        return days * price;
    }
}


class MilanoStandardTour extends StandardTour{
    private int days;          //на сколько дней тур
    private int price = 190;   //стоимость одного дня

    public MilanoStandardTour(int days) {
        this.days = days;
    }

    @Override
    String getDescription(){
        return "Тур в Милан на " + days + " д.";
    }
    @Override
    int getCost(){
        return days * price;
    }
}
