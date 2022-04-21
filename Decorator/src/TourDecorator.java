/**
 * Абстрактный класс-декоратор, обязвтельно расширяющий класс декорируемых объектов
 */
public abstract class TourDecorator extends StandardTour {
    public abstract String getDescription();
}

/**
 * Декоратор, добавляющий функциональность "Экскурсионная программа"
 */
class Excursions extends TourDecorator{
    StandardTour standardTour;

    public Excursions(StandardTour standardTour) {
        this.standardTour = standardTour;
    }

    @Override
    public String getDescription() {
        return standardTour.getDescription() + ", с экскурсиями";
    }

    @Override
    int getCost() {
        return standardTour.getCost() + 20;
    }
}

/**
 * Декоратор, добавляющий функциональность "Дегустация вин"
 */
class WineTasting extends TourDecorator{
    StandardTour standardTour;

    public WineTasting(StandardTour standardTour) {
        this.standardTour = standardTour;
    }

    @Override
    public String getDescription() {
        return standardTour.getDescription() + ", с дегустацией традиционных вин";
    }

    @Override
    int getCost() {
        return standardTour.getCost() + 15;
    }
}

/**
 * Декоратор, добавляющий функциональность "Посещение музеев"
 */
class Museums extends TourDecorator{
    StandardTour standardTour;

    public Museums(StandardTour standardTour) {
        this.standardTour = standardTour;
    }

    @Override
    public String getDescription() {
        return standardTour.getDescription() + ", с посещением музеев";
    }

    @Override
    int getCost() {
        return standardTour.getCost() + 40;
    }
}