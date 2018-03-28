package exercise1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Exercise1Should
{
    @Test
    public void getSockPairs()
    {
        int sockPairs = Exercise1.getSockPairs(5, new int[]{ 10, 10, 10, 20, 20 });
        assertEquals(2, sockPairs);
    }

    @Test
    public void getNoSockPairs()
    {
        int sockPairs = Exercise1.getSockPairs(5, new int[]{ 10, 20, 30, 40, 50 });
        assertEquals(0, sockPairs);
    }

    @Test
    public void getRepeatedPairs()
    {
        int sockPairs = Exercise1.getSockPairs(5, new int[]{ 10, 10, 10, 10, 50 });
        assertEquals(2, sockPairs);
    }

    @Test
    public void getFullMatch()
    {
        int sockPairs = Exercise1.getSockPairs(4, new int[]{ 10, 10, 10, 10 });
        assertEquals(2, sockPairs);
    }

    @Test(expected = NullPointerException.class)
    public void detectsNullArgument()
    {
        Exercise1.getSockPairs(1, null);
    }

    @Test(expected = Exception.class)
    public void detectsLessElements()
    {
        Exercise1.getSockPairs(4, new int[]{ 10, 10, 10 });
    }

    @Test(expected = Exception.class)
    public void detectsMoreElements()
    {
        Exercise1.getSockPairs(2, new int[]{ 10, 10, 20, 20 });
    }
}
