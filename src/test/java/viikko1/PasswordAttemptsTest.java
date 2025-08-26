package viikko1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("PasswordAttempts")
public class PasswordAttemptsTest {
    @Test void successFirst(){ assertEquals("Tervetuloa!", PasswordAttempts.login(new String[]{"java123"})); }
    @Test void successSecond(){ assertEquals("Tervetuloa!", PasswordAttempts.login(new String[]{"no","java123","wrong"})); }
    @Test void onlyThreeChecked(){ assertEquals("Liian monta virheellistä yritystä.", PasswordAttempts.login(new String[]{"no","no","no","java123"})); }
    @Test void tooFewWrong(){ assertEquals("Liian monta virheellistä yritystä.", PasswordAttempts.login(new String[]{"a","b"})); }
}
