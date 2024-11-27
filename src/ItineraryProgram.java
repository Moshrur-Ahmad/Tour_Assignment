class TourItinerary {
    String day;
    String time;
    String activity;

    public TourItinerary(String day, String time, String activity) {
        this.day = day;
        this.time = time;
        this.activity = activity;
    }

    public void printDetails() {
        System.out.println(day + " - " + time + " - " + activity);
    }
}

public class ItineraryProgram {
    public static void main(String[] args) {
        TourItinerary[] itinerary = {
                new TourItinerary("Day 1", "10:00 AM", "Beach Walk"),
                new TourItinerary("Day 2", "2:00 PM", "Boat Ride"),
                new TourItinerary("Day 3", "5:00 PM", "Sunset Watching")
        };

        System.out.println("Tour Itinerary:");
        for (TourItinerary item : itinerary) {
            item.printDetails();
        }
    }
}
