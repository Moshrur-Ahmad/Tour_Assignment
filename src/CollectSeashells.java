public class CollectSeashells {
    public static void main(String[] args) {
        int[] seashells = {5, 3, 7, 2}; // Initial count of each type
        System.out.println("Initial seashell counts:");
        printArray(seashells);

        // Collecting more seashells
        seashells[0] += 3;
        seashells[1] += 2;
        seashells[2] += 1;
        seashells[3] += 4;

        System.out.println("After collecting:");
        printArray(seashells);

        int total = 0;
        for (int count : seashells) {
            total += count;
        }
        System.out.println("Total seashells collected: " + total);
    }

    private static void printArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
