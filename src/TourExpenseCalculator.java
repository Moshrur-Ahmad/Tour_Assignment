class TourExpense {
    String type;
    double cost;
    String date;

    public TourExpense(String type, double cost, String date) {
        this.type = type;
        this.cost = cost;
        this.date = date;
    }
}

public class TourExpenseCalculator {
    public static void main(String[] args) {
        TourExpense[] expenses = {
                new TourExpense("Food", 50.0, "2024-11-01"),
                new TourExpense("Transport", 30.0, "2024-11-01"),
                new TourExpense("Accommodation", 100.0, "2024-11-02")
        };

        double totalCost = 0;
        System.out.println("Daily Expenses:");
        for (TourExpense expense : expenses) {
            System.out.println(expense.date + ": " + expense.type + " - $" + expense.cost);
            totalCost += expense.cost;
        }
        System.out.println("Total Cost: $" + totalCost);
    }
}
