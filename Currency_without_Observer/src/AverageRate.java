import java.util.ArrayList;
import java.util.List;

/**
 * Класс, рассчитывающий средний курс валют
 * @author Evgenia Skichko
 */
public class AverageRate {
    List<Double> dollarRates = new ArrayList<>(List.of(55.0));
    List<Double> euroRates = new ArrayList<>(List.of(85.0));

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
