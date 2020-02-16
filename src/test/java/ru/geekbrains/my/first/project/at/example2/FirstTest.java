//package ru.geekbrains.my.first.project.at.example2;
//
//import com.codeborne.selenide.Condition;
//import com.codeborne.selenide.Selenide;
//import org.junit.Before;
//import org.junit.Test;
//
//public class FirstTest {
//
////1.Зайти на сайт https://geekbrains.ru/courses
////2.Нажать на кнопку Курсы
////3.Проверить что страница Курсы открылась
////4.Повторить для
////     1.Курсы
////     2.Вебинары
////     3.Форум
////     4.Блог
////     5.Тесты
////     6.Карьера
//
//
//    @Before
//    public void setUp() throws Exception {
//        Selenide.open("https://geekbrains.ru/courses");
//    }
//
//    @Test
//    public void courses(){
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/courses\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Курсы"));
//    }
//
//    @Test
//    public void topics(){
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/topics\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Форум"));
//    }
//
//    @Test
//    public void events(){
//        Selenide.$("[class=\"gb-left-menu__nav\"] [hrPaef=\"/events\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Вебинары"));
//    }
//
//    @Test
//    public void posts(){
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/posts\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Блог"));
//    }
//
//    @Test
//    public void tests(){
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/tests\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Тесты"));
//    }
//
//    @Test
//    public void career(){
//        Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/career\"]").click();
//        Selenide.$("[class=\"gb-header__title\"]").shouldHave(Condition.exactText("Карьера"));
//    }
//}
