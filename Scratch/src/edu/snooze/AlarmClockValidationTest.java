package edu.snooze;

/*
 * Test class focused on validation testing.
 * We will do BVT (Boundary Value Testing) for snoozeInterval:
 * Range: 1-20 (inclusive)
 * Need to check on the boundaries
 * 0,1  and  20,21
 */
class AlarmClockValidationTest {

    public static void main(String[] args) {
        AlarmClock clock1 = new AlarmClock();

        clock1.setSnoozeInterval(1);    // no error message
        System.out.println("snoozeInterval: " + clock1.getSnoozeInterval());    // should be 1

        clock1.setSnoozeInterval(20);   // no error message
        System.out.println("snoozeInterval: " + clock1.getSnoozeInterval());    // should be 20

        clock1.setSnoozeInterval(0);    // should see error message, should still be 20 (from before)
        clock1.setSnoozeInterval(21);   // should see error message, should still be 20
        System.out.println("snoozeInterval: " + clock1.getSnoozeInterval());     //should still be 20
    }
}