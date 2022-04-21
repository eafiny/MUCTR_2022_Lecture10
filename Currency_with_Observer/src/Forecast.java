/**
 * @author Evgenia Skichko
 */
public class Forecast implements Observer {
    double dollarRatePrev;
    double dollarRate = 55;
    double euroRatePrev;
    double euroRate = 65;
    Subject parser;

    public Forecast(Subject parser){
        this.parser = parser;
        parser.registerObserver(this);
    }

    public void update(double $, double euro){
        dollarRatePrev = dollarRate;
        euroRatePrev = euroRate;
        dollarRate = $;
        euroRate = euro;
        this.printForecast();
    }

    void printForecast(){
        if (dollarRatePrev > dollarRate) {System.out.println("Рубль укрепляется к доллару.");}
        else {System.out.println("Курс доллара растёт.");}
        if (euroRatePrev > euroRate) {System.out.println("Рубль укрепляется к евро.");}
        else {System.out.println("Курс евро растёт.");}

    }
}
