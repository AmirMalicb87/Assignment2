public class Chocolate extends Product {

    private double weight;

    public Chocolate(String name, String barcode, double basePrice, double weight) {
        super(name, barcode, basePrice);
        this.weight = weight;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + "\n" +
                "Chocolate Weight: " + this.weight;
    }
}
