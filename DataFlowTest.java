import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataFlowTest {
    @Test
    public void R1() {
        assertEquals(4500, Main.calculateReward(5, 11, true));
    }

    @Test
    public void R2() {
        assertEquals(-1, Main.calculateReward(51, 8, false));
    }

    @Test
    public void R3() {
        assertEquals(9000, Main.calculateReward(15, 11, false));
    }

    @Test
    public void R4() {
        assertEquals(3000, Main.calculateReward(5, 9, false));
    }

    @Test
    public void R5() {
        assertEquals(6000, Main.calculateReward(15, 9, false));
    }

    @Test
    public void R6() {
        assertEquals(3500, Main.calculateReward(5, 9, true));
    }

    @Test
    public void R7() {
        assertEquals(7500, Main.calculateReward(15, 9, true));
    }
}
