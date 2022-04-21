import java.util.ArrayList;


public class CurrencyDemo {
    public static void main(String[] args){
        Forecast fc =new Forecast();
        AverageRate ar = new AverageRate();
        Parser parser = new Parser(fc, ar);

        parser.newRates(60, 69);
        System.out.println();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        parser.newRates(62, 80);
        System.out.println();
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        parser.newRates(70, 78);
    }
}
