public class SouvenirShopping {
    public static void main(String[] args) {
        String[] souvenirs = {"Keychain", "T-Shirt", "Mug"};
        double[] prices = {2.99, 9.99, 5.49};
        boolean[] cart = {true, false, true}; // Items in the cart

        double totalCost = 0;
        System.out.println("Items in cart:");
        for (int i = 0; i < cart.length; i++) {
            if (cart[i]) {
                System.out.println(souvenirs[i] + " - $" + prices[i]);
                totalCost += prices[i];
            }
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}
