import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {

    List<Product> products;



    public ShoppingCart(){
        this.products = new ArrayList<>();
    }

    public void addProducts(Product product) {
        this.products.add(product);
    }



    public Double totalPrice(){
        double total = 0.0;
        Map<String, Integer> count = new HashMap<String, Integer>();
        System.out.println(count);
        for (Product product : products) {
            total += product.getPrice();
//            System.out.println(count);

            if (count.containsKey(product.getName())){
                int x = count.get(product.getName());
                count.put(product.getName() ,x+1);
            }
            else{
                count.put(product.getName(), 1);
//                System.out.println("count");
            }
            if (count.get(product.getName()) % 4 == 0){
                total -= product.getPrice();
            }
            System.out.println(count);
        }
        {

            if (this.products.size() >= 5) {
                total = total - (total * 0.1);
            }
        }
        return total;
    }
    public void replaceProduct( String productName, Product replacementProduct){
        for(Product product : products){
            String y = product.getName();
            Integer l = product.getPrice();
            if (y== productName){

                product.setName(replacementProduct.getName());
                product.setPrice(replacementProduct.getPrice());
            }
        }

    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
}


//    List<Object>productsNamesArrayObject = new ArrayList<>();
//    Map<String,Object> productsNames = new LinkedHashMap<>();
//            productsNames.put("name",product.getName());
//                    productsNames.put("price",product.getPrice());
//                    productsNamesArrayObject.add(productsNames);
//                    System.out.println(productsNamesArrayObject);