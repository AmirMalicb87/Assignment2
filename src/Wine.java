public class Wine extends Product {

    private double volume;

    public static final double ADDITIONAL_TAX_RATE = 0.10;

    public Wine(String name, String barcode, double basePrice, double volume) {
        super(name, barcode, basePrice);
        this.volume = volume;
    }

    @Override
    public String getInfo() {
        return "Wine name: " + name + "\n" +
                "Wine barcode: " + barcode + "\n" +
                "Wine base price: " + basePrice + "\n" +
                "Wine volume: " + volume;
    }

    @Override
    public double calculatePrice() {
        return super.calculatePrice() * (1 + ADDITIONAL_TAX_RATE);
    }
}
