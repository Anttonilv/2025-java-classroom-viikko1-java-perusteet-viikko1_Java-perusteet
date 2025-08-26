package viikko1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("TimesTable")
public class TimesTableTest {
    @Test void five(){
        String expected = String.join("\n",
            "5 x 1 = 5","5 x 2 = 10","5 x 3 = 15","5 x 4 = 20","5 x 5 = 25",
            "5 x 6 = 30","5 x 7 = 35","5 x 8 = 40","5 x 9 = 45","5 x 10 = 50") + "\n";
        assertEquals(expected, TimesTable.table(5));
    }
    @Test void one(){
        String expected = String.join("\n",
            "1 x 1 = 1","1 x 2 = 2","1 x 3 = 3","1 x 4 = 4","1 x 5 = 5",
            "1 x 6 = 6","1 x 7 = 7","1 x 8 = 8","1 x 9 = 9","1 x 10 = 10") + "\n";
        assertEquals(expected, TimesTable.table(1));
    }
}
