public class JavaProgram {

    public static void main(String[] args) {

        Product product = new Product("Produkt", "235478", 300);
        System.out.println(product.getInfo());

        Chocolate chocolate = new Chocolate("White Chocolate", "457823", 100, 50);
        System.out.println(chocolate.getInfo());

        Wine wine = new Wine("Red Wine", "967488", 400, 0.75);
        System.out.println(wine.getInfo());

    }
}
