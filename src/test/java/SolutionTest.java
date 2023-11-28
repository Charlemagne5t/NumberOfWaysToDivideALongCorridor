import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void numberOfWaysTest1() {
        String corridor = "SSPPSPS";
        int expected = 3;
        int actual = new Solution().numberOfWays(corridor);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfWaysTest2() {
        String corridor = "PPSPSP";
        int expected = 1;
        int actual = new Solution().numberOfWays(corridor);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfWaysTest3() {
        String corridor = "S";
        int expected = 0;
        int actual = new Solution().numberOfWays(corridor);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void numberOfWaysTest4() {
        String corridor = "SPPSSSSPPS";
        int expected = 1;
        int actual = new Solution().numberOfWays(corridor);

        Assert.assertEquals(expected, actual);
    }
    @Test
    public void numberOfWaysTest5() {
        String corridor = "PPPPPPPSPPPSPPPPSPPPSPPPPPSPPPSPPSPPSPPPPPSPSPPPPPSPPSPPPPPSPPSPPSPPPSPPPPSPPPPSPPPPPSPSPPPPSPSPPPSPPPPSPPPPPSPSPPSPPPPSPPSPPSPPSPPPSPPSPSPPSSSS";
        int expected = 18335643;
        int actual = new Solution().numberOfWays(corridor);

        Assert.assertEquals(expected, actual);
    }
}
