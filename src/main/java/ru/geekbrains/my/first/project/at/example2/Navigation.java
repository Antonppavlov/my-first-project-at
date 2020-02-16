package ru.geekbrains.my.first.project.at.example2;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lombok.Data;

@Data
public class Navigation {
    private final SelenideElement courses = Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/courses\"]");
    private final SelenideElement events = Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/events\"]");
    private final SelenideElement topics = Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/topics\"]");
    private final SelenideElement posts = Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/posts\"]");
    private final SelenideElement tests = Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/tests\"]");
    private final SelenideElement career = Selenide.$("[class=\"gb-left-menu__nav\"] [href=\"/career\"]");

    public SelenideElement getButton(String nameButton) {
        switch (nameButton) {
            case "Курсы": {
                return courses;
            }
            case "Вебинары": {
                return events;
            }
            case "Форум": {
                return topics;
            }
            case "Блог": {
                return posts;
            }
            case "Тесты": {
                return tests;
            }
            case "Карьера": {
                return career;
            }
            default: {
                throw new RuntimeException("Кнопка: " + nameButton + " не найдена в списке");
            }
        }
    }
}
