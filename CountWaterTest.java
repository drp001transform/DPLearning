package code;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CountWaterTest {
    private CountWater countWater;
    @Before
    public void setUp() {
        countWater = new CountWater();
    }

    @Test
    public void testSimpleTest1()
    {
        assertEquals(1, countWater.measureWater(new int[]{1,0,1}));
    }

    @Test
    public void testSimpleTest2()
    {
        assertEquals(2, countWater.measureWater(new int[]{1,0,0,1}));
    }


    @Test
    public void testSimpleTest3()
    {
        assertEquals(5, countWater.measureWater(new int[]{2,0,0,2,0,1}));
    }

    @Test
    public void testSimpleTest4()
    {
        assertEquals(6, countWater.measureWater(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }




}