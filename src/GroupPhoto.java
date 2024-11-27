import java.util.Arrays;

public class GroupPhoto {
    public static void main(String[] args) {
        int[] heights = {160, 175, 168, 182, 170};
        Arrays.sort(heights); // Sort heights in ascending order

        System.out.println("Arranged Heights for Group Photo:");
        for (int height : heights) {
            System.out.print(height + " ");
        }
    }
}
