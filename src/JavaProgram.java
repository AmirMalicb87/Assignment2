public class JavaProgram {

    public static void main(String[] args) {

        Product product = new Product("Produkt", "235478", 300);
        System.out.println(product.getInfo());
        System.out.println("Product Final Price: " + product.calculatePrice());

        Chocolate chocolate = new Chocolate("White Chocolate", "457823", 100, 50);
        System.out.println(chocolate.getInfo());
        System.out.println("Chocolate Final Price: " + chocolate.calculatePrice());

        Wine wine = new Wine("Red Wine", "967488", 400, 0.75);
        System.out.println(wine.getInfo());
        System.out.println("Wine Final Price: " + wine.calculatePrice());

    }
}
