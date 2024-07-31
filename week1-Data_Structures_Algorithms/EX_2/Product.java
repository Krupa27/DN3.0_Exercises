package EX_2;

public class Product {
    private String productId;
    private String productName;
    private String category;

    public Product(String productId, String productName, String category) {
        this.productId = productId;
        this.productName = productName;
        this.category = category;
    }

    public String getProductId() {
        return productId;
    }

    public String getProductName() {
        return productName;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product ID: " + productId + ", Name: " + productName + ", Category: " + category;
    }
    
    public static void main(String[] args) {
        Product[] products = {
                new Product("001", "Laptop", "Electronics"),
                new Product("002", "Smartphone", "Electronics"),
                new Product("003", "Chair", "Furniture"),
                new Product("004", "Desk", "Furniture"),
                new Product("005", "Book", "Books"),
        };

        String searchNameLinear = "Chair";
        Product resultLinear = LinearSearch.linearSearch(products, searchNameLinear);
        if (resultLinear != null) {
            System.out.println("Linear Search - Product found: " + resultLinear);
        } else {
            System.out.println("Linear Search - Product not found.");
        }

        String searchNameBinary = "Desk";
        Product resultBinary = BinarySearch.binarySearch(products, searchNameBinary);
        if (resultBinary != null) {
            System.out.println("Binary Search - Product found: " + resultBinary);
        } else {
            System.out.println("Binary Search - Product not found.");
        }

    }
}
