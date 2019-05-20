

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class StepTrackerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class StepTrackerTest
{
    StepTracker tr;
    /**
     * Default constructor for test class StepTrackerTest
     */
    public StepTrackerTest()
    {
        tr = new StepTracker(10000);
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testStepTracker()
    {
        assertEquals(0, tr.activeDays());
        assertEquals(0.0, tr.averageSteps(), 1e-6);
        tr.addDailySteps(9000);
        tr.addDailySteps(5000);
        assertEquals(0, tr.activeDays());
        assertEquals(7000.0, tr.averageSteps(), 1e-6);
        tr.addDailySteps(13000);
        assertEquals(1, tr.activeDays());
        assertEquals(9000.0, tr.averageSteps(), 1e-6);
        tr.addDailySteps(23000);
        tr.addDailySteps(1111);
        assertEquals(2, tr.activeDays());
        assertEquals(10222.2, tr.averageSteps(), 1e-6);
    }
}
