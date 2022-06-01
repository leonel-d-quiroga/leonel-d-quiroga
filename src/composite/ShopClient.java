package composite;

public class ShopClient {
    public static void main(String[] args) {
        DeliveryService deliveryService = new DeliveryService();
        deliveryService.setupOrder(
                new CompositeBox(
                        new VideoGame("Crash Bandicoot", 100)
                ),
                new CompositeBox(
                        new CompositeBox(
                                new Book("The Hobbit", 200),
                                new Book("Animal Farm", 150 )
                        ),
                        new VideoGame("Fifa 2022", 1000),
                        new VideoGame("Mortal Kombat", 700),
                        new Book("The Da Vinci Code",800)
                )
        );
        System.out.println(String.format("Total order price: $ %s ",deliveryService.calculateOrderPrice()));
    }
}
