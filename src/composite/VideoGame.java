package composite;

public class VideoGame extends Product {

    public VideoGame(String title, double price) {
        super(title, price);
    }

    @Override
    public double calculatePrice() {
        double basePrice = getPrice();
        double tax = basePrice * 0.21;
        return basePrice + tax;
    }
}
