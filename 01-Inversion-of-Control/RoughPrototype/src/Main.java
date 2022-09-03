public class Main {
    public static void main(String[] args) throws Exception {
        // Create the object
        // BaseballCoach theCoach = new BaseballCoach();
        // Coach theCoach = new BaseballCoach();
        Coach theCoach = new TrackCoach();

        // use the object
        System.out.println(theCoach.getDailyWorkout());
    }
}
