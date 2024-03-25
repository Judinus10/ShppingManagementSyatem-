import java.util.ArrayList;

// Class representing a shopping cart
public class shoppingCart {

    // ArrayList to store the list of products in the cart
    ArrayList<Product> listOfProducts = new ArrayList<>();

    // Method to add a product to the cart
    public void addItem(Product item) {
        listOfProducts.add(item);
        System.out.println("Product added to the Shopping Cart Successfully!");
    }

    // Method to remove a product from the cart
    public void removeItem(Product item) {
        if (listOfProducts.contains(item)) {
            listOfProducts.remove(item);
            System.out.println("Product removed from the Shopping Cart Successfully!");
        } else {
            System.out.println("Product not found in the cart.");
        }
    }

    // Method to calculate the total cost of all products in the cart
    public double calculateTotal() {
        double totalCost = 0;
        for (Product product : listOfProducts) {
            totalCost += product.getPrice();
        }
        return totalCost;
    }
}

