public class TrafficSignalStreakAnalyzer {

static void findLongestStreak(String signalLog) {
    if (signalLog == null || signalLog.isEmpty()) {
        System.out.println("No signal readings available.");
        return;
    }

    int currentStreak = 1;
    int maxStreak = 1;
    char longestColor = signalLog.charAt(0);

    for (int i = 1; i < signalLog.length(); i++) {
        if (signalLog.charAt(i) == signalLog.charAt(i - 1)) {
            currentStreak++;
        } else {
            currentStreak = 1;
        }

        if (currentStreak > maxStreak) {
            maxStreak = currentStreak;
            longestColor = signalLog.charAt(i);
        }
    }

    System.out.println(
        "Longest Streak: '" + longestColor +
        "' repeated " + maxStreak + " times"
    );
}

public static void main(String[] args) {
    findLongestStreak("RRGGGYRR");
}

}
