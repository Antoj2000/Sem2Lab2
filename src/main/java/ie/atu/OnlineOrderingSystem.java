package ie.atu;

public class OnlineOrderingSystem {
    public static void main(String[] args) {
        // Create an array or list of MenuItem objects
        MenuItem[] menuItems = new MenuItem[] {
                new Burger("Beef Burger", 9.50, "Beef Patty, cheese, ketchup, bun."),
                new Pizza("Margherita Pizza", 11.50, " Tomato Sauce, dough , cheese."),
                new Salad(" Caesar Salad",6.00, "Lettuce, Croutons, Caesar dressing, chicken."),
                new Dessert("Ice cream ", 7.00, "Vanilla, Chocolate")

                // add menu items
        };

        // Display details of each new item
        for (MenuItem menuItem : menuItems) {
            // Print out the name, description and price for each item

                System.out.println("Name: " + menuItem.getName());
                System.out.println("Price: $" + menuItem.getPrice());
                System.out.println("Description : " +  menuItem.getDescription());

        }

        // Calculate and display the total cost of the order
        double totalCost = 0;
        for (MenuItem menuItem : menuItems) {
            // totalCost or all menuItem prices for an order
            totalCost += menuItem.getPrice();
        }

        System.out.println("Total Cost: $ " + totalCost);
    }
}