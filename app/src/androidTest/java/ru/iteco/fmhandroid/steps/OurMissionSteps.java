package ru.iteco.fmhandroid.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;

import android.view.View;

import org.hamcrest.Matcher;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.pages.OurMissionPage;

public class OurMissionSteps {
    OurMissionPage ourMissionPage = new OurMissionPage();
    Matcher<View> loveButtonMatcher = ourMissionPage.ourMissionLoveButton();
    Matcher<View> listMatcher = ourMissionPage.ourMissionList();
    Matcher<View> cardTitleMatcher = ourMissionPage.ourMissionCardTitle();
    Matcher<View> openCardButtonMatcher = ourMissionPage.ourMissionOpenCardButton();
    Matcher<View> cardTextMatcher = ourMissionPage.ourMissionCardText();

    public OurMissionSteps(OurMissionPage ourMissionPage) {
    }

    public void clickOurMissionButton() {
        Allure.step("Нажать на кнопку our mission");
        onView(loveButtonMatcher).perform(click());
    }

    public void ourMissionPage() {
        Allure.step("Отображается страница Наша миссия");
        onView(loveButtonMatcher).check(matches(isDisplayed()));
    }

    public void ourMissionList() {
        Allure.step("Список цитат отображается на странице");
        onView(listMatcher).check(matches(isDisplayed()));
    }


    public void ourMissionItemTitle() {
        Allure.step("Отображается заголовок цитаты");
        onView(cardTitleMatcher).check(matches(isDisplayed()));
    }

    public void ourMissionExpandItem() {
        Allure.step("Развернуть полный текст цитаты");
        onView(openCardButtonMatcher).perform(click());
    }

    public void ourMissionItemText() {
        Allure.step("Отображается полный текст цитаты");
        onView(cardTextMatcher).check(matches(isDisplayed()));
    }
}

