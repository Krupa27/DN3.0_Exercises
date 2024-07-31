package EX_3;

public class Order {
    private String orderId;
    private String customerName;
    private double totalPrice;

    public Order(String orderId, String customerName, double totalPrice) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalPrice = totalPrice;
    }

    public String getOrderId() {
        return orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Order ID: " + orderId + ", Customer Name: " + customerName + ", Total Price: $" + totalPrice;
    }

   
    public static void main(String[] args) {
        // Sample orders
        Order[] orders = {
                new Order("001", "Alice", 250.0),
                new Order("002", "Bob", 150.0),
                new Order("003", "Charlie", 350.0),
                new Order("004", "Diana", 200.0),
                new Order("005", "Eve", 300.0)
        };

        // Bubble Sort
        System.out.println("Before Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        BubbleSort.bubbleSort(orders);

        System.out.println("\nAfter Bubble Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        // Re-initialize the orders array for Quick Sort demonstration
        orders = new Order[] {
                new Order("001", "Alice", 250.0),
                new Order("002", "Bob", 150.0),
                new Order("003", "Charlie", 350.0),
                new Order("004", "Diana", 200.0),
                new Order("005", "Eve", 300.0)
        };

        // Quick Sort
        System.out.println("\nBefore Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }

        QuickSort.quickSort(orders, 0, orders.length - 1);

        System.out.println("\nAfter Quick Sort:");
        for (Order order : orders) {
            System.out.println(order);
        }
    }
    

}
