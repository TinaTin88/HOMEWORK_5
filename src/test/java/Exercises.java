import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class Exercises extends ChromeRunner {
    @Test
    public void forExample () {
        $(byClassName("cart-count")).click();
        sleep(5000);
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        $(byId("search_list")).setValue("კომპიუტერი").sendKeys(Keys.ENTER);
        sleep(5000);
        $(byClassName("fa-shopping-cart")).click();
        sleep(5000);
        $(byClassName("cart-count")).click();
        $(byText("სრული ღირებულება")).shouldBe(Condition.visible);
        $(byText("წაშლა")).click();
        $(byText("კალათა ცარიელია")).shouldBe(Condition.visible);
        sleep(5000);
    }
}
