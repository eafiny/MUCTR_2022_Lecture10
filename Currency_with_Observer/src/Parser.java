import java.util.ArrayList;

/**
 * Класс, загружающий курсы валют
 * @author Evgenia Skichko
 */
public class Parser implements Subject {
    private double dollarRate;
    private double euroRate;
    ArrayList<Observer> obsList = new ArrayList<>();

    public void registerObserver(Observer o){obsList.add(o);}

    public void  removeObserver(Observer o){
        if (obsList.contains(o)) {
            obsList.remove(o);
        }
    }
    public void notifyObservers(){
        for (Observer o:obsList) {
            o.update(dollarRate, euroRate);
        }
    }

    public void newRates(double $, double euro){
        dollarRate = $;
        euroRate = euro;
        notifyObservers();
    }
}
