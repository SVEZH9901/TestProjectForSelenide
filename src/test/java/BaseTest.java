import org.junit.Test;

import static com.codeborne.selenide.Selenide.*;


public class BaseTest {
    @Test
    public void userCanLoginByUsername() {
        open("https://demoqa.com/automation-practice-form");
        $("//*[@id=\"firstName\"]").setValue("Andrw");
    }
}
