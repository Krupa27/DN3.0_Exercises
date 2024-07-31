package EX_1;
import java.util.*;

public class InventoryManagementSystem {
    HashMap<Integer, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    public void addProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            System.out.println("Product with this ID already exists.");
        } else {
            inventory.put(product.getProductId(), product);
            System.out.println("Product " + product.getProductName() + " added.");
        }
    }

    public void updateProduct(int productId, Integer quantity, Double price) {
        Product product = inventory.get(productId);
        if (product != null) {
            if (quantity != null) {
                product.setQuantity(quantity);
            }
            if (price != null) {
                product.setPrice(price);
            }
            System.out.println("Product " + productId + " updated.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void deleteProduct(int productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
            System.out.println("Product " + productId + " deleted.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayInventory() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem inventorySystem = new InventoryManagementSystem();
        Product product1 = new Product(1, "Laptop", 10, 999.99);
        Product product2 = new Product(2, "Smartphone", 20, 499.99);

        inventorySystem.addProduct(product1);
        inventorySystem.addProduct(product2);
        inventorySystem.displayInventory();

        inventorySystem.updateProduct(1, 15, null);
        inventorySystem.displayInventory();

        inventorySystem.deleteProduct(2);
        inventorySystem.displayInventory();
    }
}

