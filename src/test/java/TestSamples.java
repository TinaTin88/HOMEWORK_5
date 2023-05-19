import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.testng.annotations.*;
import static com.codeborne.selenide.Selectors.byId;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class TestSamples extends ChromeRunner {
    @Test
    public void practice_1() {
        // ტესტ მეთოდი #1  - დადებითი მნიშვნელობები:
        $(byText("რეგისტრაცია")).click();
        $(byText("სწრაფი რეგისტრაცია")).shouldBe(Condition.visible);
        $(byId("firstName")).setValue("Tinatin").shouldNotBe(Condition.empty);
        $(byId("lastName")).setValue("Iobishvili").shouldNotBe(Condition.empty);
        $(byId("email")).setValue("tiko.iobishvili@gmail.com").shouldNotBe(Condition.empty);
        $(byId("password")).setValue("iobishvilitiko").shouldBe(Condition.visible);
        sleep(5000);
        $(byId("confirmPassword")).setValue("iobishvilitiko").shouldBe(Condition.visible);
        $(byId("singup")).shouldBe(Condition.enabled);
        sleep(5000);
    }
}
