import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Store {
    static String storeName;
    static String storeLocation;

    List<Product> productList = new ArrayList<>();


    static void setStoreDetails(String name, String location) {
        storeName = name;
        storeLocation = location;
    }


    static void displayStoreDetails() {
        System.out.println("Store name is " + storeName + ", and store location is " + storeLocation);
    }

    void addProduct(Product p) {
        productList.add(p);
    }

    void displayAllProducts() {
        for (Product p : productList) {
            p.displayProduct();
        }
    }
}

class Product {
    int product_id;
    String name;
    int price;
    int quantity;

    Product(int product_id, String name, int price, int quantity) {
        this.product_id = product_id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void displayProduct() {
        System.out.println("Product ID: " + product_id + ", Name: " + name +
                ", Price: " + price + ", Quantity: " + quantity);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Scanner sd = new Scanner(System.in);

        System.out.print("Enter store name: ");
        String storeName = sd.nextLine();

        System.out.print("Enter store location: ");
        String storeLocation = sd.nextLine();

        Store.setStoreDetails(storeName, storeLocation);
        Store.displayStoreDetails();

        Store s1 = new Store();
        Product p1 = new Product(125, "Shampoo", 450, 2);
        Product p2 = new Product(126, "Soap", 30, 5);

        s1.addProduct(p1);
        s1.addProduct(p2);

        System.out.println("\nProduct list:");
        s1.displayAllProducts();
    }
}
