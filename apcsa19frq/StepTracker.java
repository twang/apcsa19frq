public class StepTracker
{
    private int stepsActive;
    private int steps;
    private int days;
    private int daysActive;
    
    public StepTracker(int stepsActive) {
        this.stepsActive = stepsActive;
        steps = 0;
        days = 0;
        daysActive = 0;
    }
    
    public void addDailySteps(int newSteps) {
        steps += newSteps;
        days++;
        if (newSteps > stepsActive) {
            daysActive++;
        }
    }
    
    public int activeDays() {
        return daysActive;
    }
    
    public double averageSteps() {
        if (days == 0) {
            return 0.0;
        }
        return 1.0 * steps / days;
    }
}
