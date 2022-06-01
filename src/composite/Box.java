package composite;

public interface Box {
    double calculatePrice();
    /**
     * La solucion sin composite seria algo asi
     *  private List<Box> boxes
     *  private List<Product> products
     *
     *  public double calculatePrice() {
     *      double sum = products.stream()
     *              .mapToDouble(Product::getPrice)
     *              .sum();
     *      for (Box box : boxes) {
     *          sum = sum + box.calculatePrice();
     *      }
     *      return sum;
     *  }
     */


}
