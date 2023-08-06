import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

public class FirstTest extends BaseTest{

    @Test
    public void openPage(){
        Selenide.open("https://www.youtube.com/");
    }
}
