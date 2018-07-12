public class Main {
    public  static void main (String[] args) {

        Product p1 = new Product("vacuum cleaner", 100);
        Product p2 = new Product("pencil", 3);
        Product p3 = new Product("bike", 300);
        Product p4 = new Product("car", 500);


        ShoppingCart cart = new ShoppingCart();


        cart.addProducts(p1);
        cart.addProducts(p2);
        cart.addProducts(p3);
        cart.addProducts(p3);
        cart.addProducts(p3);
        cart.addProducts(p3);
//        cart.addProducts(p4);




        cart.replaceProduct("bike", p4);
        System.out.println(cart.totalPrice());

//        System.out.println(cart.getProducts());


//        for (Product product : cart.getProducts()) {
//            System.out.println(product.getName());
//            System.out.println(product.getPrice());
//        }


    }
}
