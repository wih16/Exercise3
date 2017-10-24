import org.junit.Test;
import static org.junit.Assert.*; 

import billyjosh.Exercise3; 

public class Exercise3Test{
    @Test
    public void testTri0(){
	assertEquals(Exercise3.tri(0), 0); 
    }
    @Test
    public void testTri1(){
	assertEquals(Exercise3.tri(1), 1);
    }
    @Test
    public void testTri10(){
	assertEquals(Exercise3.tri(10), 55);
    }
    @Test
    public void testLazy0(){
	assertEquals(Exercise3.lazy(0), 1);
    }
    @Test
    public void testLazy3(){
	assertEquals(Exercise3.lazy(3), 7);
    }
    @Test
    public void testLazy10(){
	assertEquals(Exercise3.lazy(10), 56); 
    }
}