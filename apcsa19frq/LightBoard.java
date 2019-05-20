public class LightBoard
{
    /** The lights on the board, where true represents on and false represents off.
     */
    private boolean[][] lights;
    
    /** Constructs a LightBoard object having numRows rows and numCols columns.
     * Precondition: numRows > 0, numCols > 0
     * Postcondition: each light has a 40% probability of being set to on.
     */
    public LightBoard(int numRows, int numCols) {
        lights = new boolean[numRows][numCols];
        
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                if (Math.random() <= .4) {
                    lights[i][j] = true;
                }
                else {
                    lights[i][j] = false;
                }
            }
        }
    }
    
    // simulation
    public LightBoard() {
        lights = new boolean[][]{{true, true, false, true, true},
                                 {true, false, false, true, false},
                                 {true, false, false, true, true},
                                 {true, false, false, false, true},
                                 {true, false, false, false, true},
                                 {true, true, false, true, true},
                                 {false, false, false, false, false}};
    }

    /** Evaluates a light in row index row and column index col and returns a status
     * as described in part (b).
     * Precondition: row and col are valid indexes in lights.
     */
    public boolean evaluateLight(int row, int col) {
        int numLightsInCol = 0;
        
        for (int i = 0; i < lights.length; i++) {
            if (lights[i][col]) {
                numLightsInCol++;
            }
        }
        
        if (lights[row][col] && (numLightsInCol % 2 == 0)) {
            return false;
        }
        if (!lights[row][col] && (numLightsInCol % 3 == 0)) {
            return true;
        }
        
        return lights[row][col];
    }
    // There may be additional instance variables, constructors, and methods not shown.
} 