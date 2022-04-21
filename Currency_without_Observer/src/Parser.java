/**
 * Класс, получающий новые курсы валют и рассылающий обновления остальным классам
 * @author Evgenia Skichko
 */
public class Parser {
    Forecast fc;
    AverageRate ar;

    Parser(Forecast fc, AverageRate ar){
        this.fc = fc;
        this.ar = ar;
    }

    public void newRates(double $, double euro){
        fc.update($, euro);
        ar.update($, euro);
    }
}
