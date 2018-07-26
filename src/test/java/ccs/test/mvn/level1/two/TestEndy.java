package ccs.test.mvn.level1.two;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;

public class TestEndy {

    Endy endy = new Endy();

    @Test (expected = BadArgumentException.class)
    public void testNullArray() {
        endy.copyEndy(null, 1);
    }

    @Test (expected = BadArgumentException.class)
    public void testZeroCount() {
        endy.copyEndy(new int[]{1, 2, 3} , 0);
    }


    @Test (expected = BadArgumentException.class)
    public void testLessZeroCount() {
        endy.copyEndy(new int[]{1, 2, 3} , -10);
    }


    @Test
    public void testHappy1() {
        int[] returned =  endy.copyEndy(new int[]{9, 11, 90, 22, 6}, 2);
        assertNotNull(returned);
        assertEquals(2, returned.length);
        assertEquals(9, returned[0] );
        assertEquals(90, returned[1] );
    }

    @Test
    public void testHappy2() {
        int[] returned =  endy.copyEndy(new int[]{9, 11, 90, 22, 6}, 3);
        assertNotNull(returned);
        assertEquals(3, returned.length);
        assertEquals(9, returned[0] );
        assertEquals(90, returned[1] );
        assertEquals(6, returned[2] );
    }

    @Test
    public void testHappy3() {
        int[] returned =  endy.copyEndy(new int[]{0}, 1);
        assertNotNull(returned);
        assertEquals(1, returned.length);
        assertEquals(0, returned[0] );
    }
    @Test
    public void testHappy4() {
        int[] returned =  endy.copyEndy(new int[]{13, 2, 2, 0, 2}, 2);
        assertNotNull(returned);
        assertEquals(2, returned.length);
        assertEquals(2, returned[0] );
        assertEquals(2, returned[1] );
    }
}
