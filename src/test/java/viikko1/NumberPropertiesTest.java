package viikko1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("NumberProperties")
public class NumberPropertiesTest {
    @Test void zero(){ assertEquals("nolla", NumberProperties.describe(0)); }
    @Test void posEven(){ assertEquals("positiivinen parillinen", NumberProperties.describe(8)); }
    @Test void posOdd(){ assertEquals("positiivinen pariton", NumberProperties.describe(7)); }
    @Test void negEven(){ assertEquals("negatiivinen parillinen", NumberProperties.describe(-12)); }
    @Test void negOdd(){ assertEquals("negatiivinen pariton", NumberProperties.describe(-5)); }
}
