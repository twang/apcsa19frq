

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class APCalendarTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class APCalendarTest
{
    /**
     * Default constructor for test class APCalendarTest
     */
    public APCalendarTest()
    {
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
    public void testNumLeapYears()
    {
        assertEquals(6, APCalendar.numberOfLeapYears(2000, 2020));
    }

    @Test
    public void testDayOfWeek()
    {
        assertEquals(6, APCalendar.dayOfWeek(1, 5, 2019));
        assertEquals(4, APCalendar.dayOfWeek(1, 10, 2019));
    }
}


