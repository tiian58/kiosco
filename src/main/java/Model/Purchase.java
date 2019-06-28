package Model;

import java.util.List;

public class Purchase {
    private final List<Product> products;

    public Purchase(List<Product> products) {
        this.products = products;
    }

    //Method
    public double totalPrice(){
        return products.stream().mapToDouble(product -> product.getPrecio()).sum();
    }
    

}
