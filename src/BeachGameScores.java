public class BeachGameScores {
    public static void main(String[] args) {
        int[][] scores = {
                {10, 20},
                {15, 25},
                {12, 18}
        };

        int totalTeamA = 0, totalTeamB = 0;
        for (int[] game : scores) {
            totalTeamA += game[0];
            totalTeamB += game[1];
        }

        System.out.println("Total Team A Score: " + totalTeamA);
        System.out.println("Total Team B Score: " + totalTeamB);
    }
}

