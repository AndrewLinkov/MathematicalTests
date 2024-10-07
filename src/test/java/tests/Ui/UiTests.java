package tests.Ui;

import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class UiTests extends BaseTest {
    public static String url = "https://rosatom-career.ru/";

    @Test
    @Owner("Андрей")
    @Description("Поиск вакасии Инженер")
    public void findEngener() {
        open(url);
        $(".chakra-input").setValue("Инженер").pressEnter();
        $(".chakra-heading").shouldHave(Condition.text("Вакансии"));
    }

    @Test
    @Owner("Андрей")
    @Description("Поиск вакасии Менеджер")

    public void findManager() {
        $(".chakra-input").setValue("Менеджер").pressEnter();
        $(".chakra-heading").shouldHave(Condition.text("Вакансии"));
    }

    @Test
    @Owner("Андрей")
    @Description("Поиск вакасии Разработчик")
    public void findDeveloper() {
        $(".chakra-input").setValue("Разработчик").pressEnter();
        $(".chakra-heading").shouldHave(Condition.text("Разработчик"));
    }
}
