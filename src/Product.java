public class Product {

    String name;
    String barcode;
    double basePrice;

    private static final double TAX_RATE = 0.20;

    public Product() {

    }

    public Product(String name, String barcode, double basePrice) {
        this.name = name;
        this.barcode = barcode;
        this.basePrice = basePrice;
    }

    public double calculatePrice() {
        return basePrice * (1 + TAX_RATE);
    }

    public String getInfo() {
        return "Product name: " + name + "\n" +
                "Product barcode: " + barcode + "\n" +
                "Product base price: " + basePrice;
    }
}
