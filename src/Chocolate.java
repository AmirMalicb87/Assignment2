public class Chocolate extends Product {

    private double weight;

    public Chocolate(String name, String barcode, double basePrice, double weight) {
        super(name, barcode, basePrice);
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return "Chocolate name: " + name + "\n" +
                "Chocolate barcode: " + barcode + "\n" +
                "Chocolate base price: " + basePrice + "\n" +
                "Chocolate weight: " + weight;
    }
}
