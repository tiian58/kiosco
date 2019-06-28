package Model;

public class Product {
    private final String name;
    private double price;
    private final Brand brand;

    public Product(String name, double price, Brand brand) {
        this.name = name;
        this.price = price;
        this.brand = brand;
    }

    //Getters and Setters
    public double getPrecio() {
        return price;
    }

    public void setPrecio(double price) {
        this.price = price;
    }
}
