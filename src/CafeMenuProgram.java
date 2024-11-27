class BeachCafeMenu {
    String itemName;
    double price;
    boolean isVegetarian;

    public BeachCafeMenu(String itemName, double price, boolean isVegetarian) {
        this.itemName = itemName;
        this.price = price;
        this.isVegetarian = isVegetarian;
    }

    public void printMenu() {
        System.out.println(itemName + " - $" + price + (isVegetarian ? " (V)" : ""));
    }
}

public class CafeMenuProgram {
    public static void main(String[] args) {
        BeachCafeMenu[] menu = {
                new BeachCafeMenu("Burger", 5.99, false),
                new BeachCafeMenu("Salad", 4.99, true),
                new BeachCafeMenu("Fries", 2.99, true)
        };

        System.out.println("Menu:");
        for (BeachCafeMenu item : menu) {
            item.printMenu();
        }
    }
}
