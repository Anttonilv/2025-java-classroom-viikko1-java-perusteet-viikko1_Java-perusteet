package viikko1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("ArrayStats")
public class ArrayStatsTest {
    @Test void avg(){ assertEquals(10.0, ArrayStats.average(new int[]{5,10,15}), 0.0001); }
    @Test void avgEmpty(){ assertEquals(0.0, ArrayStats.average(new int[]{}), 0.0001); }
    @Test void maxNormal(){ assertEquals(20, ArrayStats.max(new int[]{-1,20,3,7})); }
    @Test void maxEmpty(){ assertEquals(Integer.MIN_VALUE, ArrayStats.max(new int[]{})); }
}
