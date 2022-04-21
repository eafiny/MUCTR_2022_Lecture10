public class CurrencyDemo {
    public static void main(String[] args){
        Parser parser = new Parser();
        Forecast fc =new Forecast(parser);
        AverageRate ar = new AverageRate(parser);

        parser.newRates(60, 69);
        System.out.println();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        parser.newRates(62, 80);
        System.out.println();
        try{
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }

        parser.newRates(70, 78);
        System.out.println();
    }
}
