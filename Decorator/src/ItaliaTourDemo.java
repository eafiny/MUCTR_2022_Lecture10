public class ItaliaTourDemo {
    public static void main(String[] args) {
        StandardTour standardTour = new RomaStandardTour(3);

        //********  1 способ записи декоратора  *****************
        StandardTour myTour = new Excursions(standardTour);
        myTour = new WineTasting(myTour);
        myTour = new Museums(myTour);
        System.out.println(myTour.getDescription());
        System.out.println("Стоимость тура составит " + myTour.getCost() + " Euro");
        System.out.println();

        //********  2 способ записи декоратора  *****************
        StandardTour standardTour2 = new MilanoStandardTour(5);
        StandardTour myTour2 = new Excursions(new WineTasting(new Museums(standardTour2)));
        System.out.println(myTour2.getDescription());
        System.out.println("Стоимость тура составит " + myTour2.getCost() + " Euro");
    }
}
