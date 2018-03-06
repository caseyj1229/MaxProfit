import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MaxProfitTest {
    @Test
    void solution() {
        int[] A = {23171,21011,21123,21366,21013,21367};
        assertEquals(356,MaxProfit.solution(A));

        int[] B = {23171};
        assertEquals(0,MaxProfit.solution(B));

        int[] C = {100,99,99,65,55};
        assertEquals(0,MaxProfit.solution(C));

        int[] D = {5,10,20,40,80,160,320};
        assertEquals(315,MaxProfit.solution(D));

        int[] E = {100000,1,2,3,4,5,6,7,8,9,10,100002};
        assertEquals(100001,MaxProfit.solution(E));
    }
}