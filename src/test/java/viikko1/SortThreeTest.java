package viikko1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("SortThree")
public class SortThreeTest {
    @Test void basic(){ assertEquals("2,5,9", SortThree.ascending(5,2,9)); }
    @Test void equals(){ assertEquals("3,3,7", SortThree.ascending(3,7,3)); }
    @Test void descInput(){ assertEquals("1,2,3", SortThree.ascending(3,2,1)); }
}
