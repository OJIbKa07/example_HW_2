import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SearchTests {
    @Test
    void successfulSearchTest() {
        open("https://www.duckduckgo.com/");
        $("[name=q]").setValue("Курсы тестировщиков qa guru").pressEnter();
        $("[.Wo6ZAEmESLNUuWBkbMxx]").shouldHave(text("https://qa.guru"));
    }

}