package main.java.base_patterns.behavioral.chain;

public class Runner {
    public static void main(String[] args) {
        Notifier oneMoreNotifier = new OneMoreAlarm(DegreeOfLateness.OK);
        Notifier lastAlarm = new LastAlarm(DegreeOfLateness.STILL_OK);
        Notifier urgentCall = new UrgentCall(DegreeOfLateness.TOO_LATE);

        oneMoreNotifier.setNextNotifier(lastAlarm);
        lastAlarm.setNextNotifier(urgentCall);

        oneMoreNotifier.notifyColleagues("I'm still sleeping, but it's okey", DegreeOfLateness.OK);
        oneMoreNotifier.notifyColleagues("I'm still sleeping, but it may be too late", DegreeOfLateness.STILL_OK);
        oneMoreNotifier.notifyColleagues("Oops", DegreeOfLateness.TOO_LATE);

    }
}
