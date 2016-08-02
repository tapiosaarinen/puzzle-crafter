
package ohha.puzzlecrafter.grid;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;


public class CellTest {
    
    private Cell a;
    private Cell b1;
    private Cell b2;
    private Cell b3;
    
    
    @Before
    public void setUp() {
        a = new Cell(0, 2);
        b1 = new Cell(1, 3);
        b2 = new Cell(1, 3);
        b3 = new Cell(1, 3);
    }
    
    
    @Test
    public void switchXChangesXCoordinate() {
        assertEquals(3, a.switchX(3).getX());
    }
    
    @Test
    public void switchXDoesntChangeYCoordinate() {
        assertEquals(2, a.switchX(3).getY());
    }
    
    @Test
    public void switchYChangesYCoordinate() {
        assertEquals(5, a.switchY(5).getY());
    }
    
    @Test
    public void switchYDoesntChangeXCoordinate() {
        assertEquals(0, a.switchY(5).getX());
    }
    
    
    
    @Test
    public void equalsDoesntEquateWithNull() {
        assertFalse(a.equals(null));
    }
    
    
    @Test
    public void equalsIsConsistentWhenReturningTrue() {
        assertEquals(b1.equals(b2), b1.equals(b2));
    }
    
    @Test
    public void equalsIsConsistentWhenReturningFalse() {
        assertEquals(a.equals(b1), a.equals(b1));
    }
    
    
    @Test
    public void equalsIsReflexive() {
        assertTrue(a.equals(a));
    }
    
    
    @Test
    public void equalsIsSymmetricWhenReturningTrue() {
        assertEquals(b1.equals(b2), b2.equals(b1));
    }
    
    @Test
    public void equalsIsSymmetricWhenReturningFalse() {
        assertEquals(a.equals(b1), b1.equals(a));
    }
    
    
    @Test
    public void equalsIsTransitive() {
        assertEquals(b1.equals(b2) && b2.equals(b3), b1.equals(b3));
    }
    
    
    @Test
    public void hashCodeIsConsistent() {
        assertEquals(a.hashCode(), a.hashCode());
    }
    
    
    @Test
    public void equalObjectsHaveEqualHashCodes() {
        assertEquals(b1.hashCode(), b2.hashCode());
    }
}
