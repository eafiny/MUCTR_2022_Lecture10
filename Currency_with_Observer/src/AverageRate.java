import java.util.ArrayList;
import java.util.List;

/**
 * @author Evgenia Skichko
 */
public class AverageRate implements Observer {
    Subject parser;

    List<Double> dollarRates = new ArrayList<>(List.of(65.0));
    List<Double> euroRates = new ArrayList<>(List.of(85.0));

    public AverageRate(Subject parser){
        this.parser = parser;
        parser.registerObserver(this);
    }

    public void update(double $, double euro){
        dollarRates.add($);
        euroRates.add(euro);
        this.printAverage();
    }

    public void printAverage(){
        System.out.printf("Средний курс доллара: %.4f\n", calculateAverage(dollarRates));
        System.out.printf("Средний курс евро: %.4f\n", calculateAverage(euroRates));
    }

    private double calculateAverage(List<Double> rates) {
        double sumRates;
        sumRates = rates.stream()
                .reduce(0.0, (acc, el) -> acc + el);
        return sumRates / rates.size();
    }
}
