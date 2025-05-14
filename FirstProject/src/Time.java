public class Time {
    //Exercise question 2.3
    public static void main(String[] args) {
        hoursToMidnight();
    }
    public static void hoursToMidnight() {
        int hour = 15;
        int minute = 32;
        int second = 17;
        int secondsSinceMidnight = hour*3600 + minute*60 + second;
        double totalSecondsInDay = 24*3600;

        System.out.println(secondsSinceMidnight + " seconds since midnight.");
        System.out.println((secondsSinceMidnight / totalSecondsInDay)*100 + " percent of the day has elapsed.");

        int remainingHours = 23 - hour;
        int remainingMinutes = 60 - minute;
        int remainingSeconds = 60 - second;

        System.out.println("Remaining time to midnight (H:M:S): " + remainingHours + ":" + remainingMinutes + ":" + remainingSeconds);

        int endHour = 15;
        int endMinute = 44;
        int endSecond = 28;

        System.out.println((endHour - hour) + "Hours, " + (endMinute - minute) + " minutes, and " + (endSecond - second) + " seconds since I started.");
    }
}
