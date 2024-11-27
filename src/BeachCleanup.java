public class BeachCleanup {
    public static void main(String[] args) {
        int[] beach = {1, 0, 1, 1, 0, 1}; // 1 = dirty, 0 = clean
        System.out.println("Before cleanup:");
        printArray(beach);

        // Cleanup process
        for (int i = 0; i < beach.length; i++) {
            beach[i] = 0; // Set all sections to clean
        }

        System.out.println("After cleanup:");
        printArray(beach);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
