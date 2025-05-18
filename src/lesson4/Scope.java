package lesson4;

public class Scope {
    public static void main(String[] args) {
        double priceCar = 10_000;

        if (priceCar > 9_000) {
            priceCar *= 0.95;
            double oldPrice = priceCar;
            System.out.println(oldPrice);
            System.out.println(priceCar);
        }
    }
}
