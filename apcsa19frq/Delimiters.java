import java.util.*;

public class Delimiters
{
    /** The open and close delimiters. */
    private String openDel;
    private String closeDel;
    /** Constructs a Delimiters object where open is the open delimiter and close is the
     * close delimiter.
     * Precondition: open and close are non-empty strings.
     */
    public Delimiters(String open, String close)
    {
        openDel = open;
        closeDel = close;
    }

    /** Returns an ArrayList of delimiters from the array tokens, as described in part (a). */
    public ArrayList<String> getDelimitersList(String[] tokens) {
        ArrayList<String> delims = new ArrayList<String>();
        
        for (String s : tokens) {
            if (s.equals(openDel) || s.equals(closeDel)) {
                delims.add(s);
            }
        }
        
        return delims;
    }

    /** Returns true if the delimiters are balanced and false otherwise, as described in part (b).
     * Precondition: delimiters contains only valid open and close delimiters.
     */
    public boolean isBalanced(ArrayList<String> delimiters) {
        int openCount = 0;
        int closeCount = 0;
        
        for (String s : delimiters) {
            if (s.equals(openDel)) {
                openCount++;
            }
            else if (s.equals(closeDel)) {
                closeCount++;
            }
            
            if (closeCount > openCount) {
                return false;
            }
        }
        
        return openCount == closeCount;
    }
    // There may be instance variables, constructors, and methods that are not shown.
} 