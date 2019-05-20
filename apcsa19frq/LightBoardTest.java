

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class LightBoardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class LightBoardTest
{
    /**
     * Default constructor for test class LightBoardTest
     */
    public LightBoardTest()
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
    public void testEvaluateLight() {
        LightBoard sim = new LightBoard();
        
        assertFalse(sim.evaluateLight(0, 3));
        assertTrue(sim.evaluateLight(6, 0));
        assertFalse(sim.evaluateLight(4, 1));
        assertTrue(sim.evaluateLight(5, 4));
    }
}
