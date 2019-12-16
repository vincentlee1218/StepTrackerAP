/** This question involves the implementation of a fitness tracking system that is represented by the StepTracker class. A StepTracker object is created with a paramter that defines the minimum number of steps that must be taken for a day to be considered active.
* <p> The StepTracker class provides a constructor and the following methods.
* <p> addDailySteps, which acculumates information about steps, in readings taken once per day
* <br> activeDays, which reeturns the number of active days
* <br> averageSteps, which returns the average number of steps per day, calculated by dividing the total number of steps taken by the number of days tracked.
*/
class StepTracker {
    private final int STEPS;
    private int activeDay, day, totalSteps;
    
    /** Creates a StepTracker object with minimum steps per day to be considered an active day.
     * <br> Initializes day, activeDay, and totalSteps to 0.
     * @param minimum Sets the number of minimum steps.
     */
    StepTracker(int minimum) {
      STEPS = minimum;
      day=0;
      activeDay=0;
      totalSteps=0;
    }
    
    /** Adds daily steps.
     * <p> Adds one day, and if the daily steps is at least the minimum, adds an active day.
     * @param steps Number of steps taken in the day.
     */
    public void addDailySteps(int steps) {
        totalSteps+=steps;day++;
        if (steps>=STEPS) activeDay++;
    }
    
    /** Returns the number of active days.
     * @return Number of active days.
     */
    public int activeDays() {return activeDay;}
    
    /** Returns the average number of steps. Returns 0 if no days have been recorded.
     * @return totalSteps / day (the average steps per day) <br> 0 if there is no step data.
     */
    public double averageSteps() {
        if (day==0) return 0;
        return (double) totalSteps / day;}
}