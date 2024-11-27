class TourFeedback {
    String name;
    int rating;
    String comment;

    public TourFeedback(String name, int rating, String comment) {
        this.name = name;
        this.rating = rating;
        this.comment = comment;
    }
}

public class FeedbackProgram {
    public static void main(String[] args) {
        TourFeedback[] feedbacks = {
                new TourFeedback("Alice", 8, "Great tour!"),
                new TourFeedback("Bob", 9, "Loved it!"),
                new TourFeedback("Charlie", 7, "It was good.")
        };

        int totalRating = 0;
        System.out.println("Feedback:");
        for (TourFeedback feedback : feedbacks) {
            System.out.println(feedback.name + " (Rating: " + feedback.rating + "): " + feedback.comment);
            totalRating += feedback.rating;
        }
        System.out.println("Average Rating: " + (totalRating / (double) feedbacks.length));
    }
}
