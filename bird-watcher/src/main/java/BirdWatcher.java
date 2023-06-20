import java.util.Arrays;

class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return birdsPerDay;
    }

    public int getToday() {
        int lastElement = birdsPerDay.length -1;
        int today = birdsPerDay[lastElement];
        return today;
    }

    public void incrementTodaysCount() {
        int lastElement = birdsPerDay.length -1;
        int today = birdsPerDay[lastElement];
        int todayPlusOne = today + 1;
        birdsPerDay[lastElement] = todayPlusOne;
        }

    public boolean hasDayWithoutBirds() {
        boolean truth = false;
        for (int j : birdsPerDay) {
            if (j == 0) {
                truth = true;
                break;
            }
        }
        return truth;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int total = 0;

        for(int i = 0; i <= numberOfDays; i++) {
            total += i;
        }
        return total;
    }

    public int getBusyDays() {
        throw new UnsupportedOperationException("Please implement the BirdCount.getBusyDays() method");
    }
}
