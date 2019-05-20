import java.util.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DelimitersTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DelimitersTest
{
    /**
     * Default constructor for test class DelimitersTest
     */
    public DelimitersTest()
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
    public void testGetDelimitersList()
    {
        Delimiters paren = new Delimiters("(", ")");
        ArrayList<String> parens = new ArrayList<String>();
        parens.add("(");
        parens.add(")");
        assertTrue(parens.equals(paren.getDelimitersList(new String[]{"(", "x + y", ")", " * 5"})));

        Delimiters q = new Delimiters("<q>", "</q>");
        ArrayList<String> qs = new ArrayList<String>();
        qs.add("<q>");
        qs.add("</q>");
        qs.add("</q>");
        assertTrue(qs.equals(q.getDelimitersList(new String[]{"<q>", "yy", "</q>", "zz", "</q>"})));
    }

    @Test
    public void testIsBalanced()
    {
        Delimiters sup = new Delimiters("<sup>", "</sup>");
        ArrayList<String> a = new ArrayList<String>();
        a.add("<sup>");
        a.add("<sup>");
        a.add("</sup>");
        a.add("<sup>");
        a.add("</sup>");
        a.add("</sup>");
        assertTrue(sup.isBalanced(a));

        ArrayList<String> b = new ArrayList<String>();
        b.add("<sup>");
        b.add("</sup>");
        b.add("</sup>");
        b.add("<sup>");
        assertFalse(sup.isBalanced(b));

        ArrayList<String> c = new ArrayList<String>();
        c.add("</sup>");
        assertFalse(sup.isBalanced(c));

        ArrayList<String> d = new ArrayList<String>();
        d.add("<sup>");
        d.add("<sup>");
        d.add("</sup>");
        assertFalse(sup.isBalanced(d));
    }
}
