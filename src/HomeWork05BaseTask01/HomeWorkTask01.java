package HomeWork05BaseTask01;

public class HomeWorkTask01 {
    public static void main(String[] args) {
        Toyota toyota = new Toyota();
        Jiguly jiguly = new Jiguly();

        Car[] cars = {jiguly, toyota};
        for (Car car : cars) {
            if (car instanceof Jiguly) {
                Jiguly myJiguly = (Jiguly) car;
                myJiguly.broken();
                car.startMove();
                car.stopMove();
                car.turnLight();
            } else if (car instanceof Toyota) {
                Toyota myToyota = (Toyota) car;
                myToyota.turnMusic();
                car.startMove();
                car.stopMove();
                car.turnLight();
            }

        }
    }
}