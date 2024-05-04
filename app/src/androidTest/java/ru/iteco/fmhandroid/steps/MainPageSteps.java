package ru.iteco.fmhandroid.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.contrib.RecyclerViewActions.actionOnItemAtPosition;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import android.view.View;

import org.hamcrest.Matcher;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.pages.AuthorizationPage;
import ru.iteco.fmhandroid.pages.MainPage;

public class MainPageSteps {
    MainPage mainPage = new MainPage();
    public MainPageSteps(MainPage mainPageSteps) {
    }

    public void clickAllNewsButton() {
        Matcher<View> allNewsMatcher = mainPage.getMainAllNews();
        Allure.step("Нажать на кнопку All news");
        onView(allNewsMatcher).perform(click());
    }

    public void newsPage() {
        onView(withId(R.id.news_list_swipe_refresh)).check(matches(isDisplayed()));
    }

    public void ourMissionButton() {
        onView(withId(R.id.our_mission_image_button)).check(matches(isDisplayed()));
    }
    public void clickMainBanner() {
       Matcher<View> mainBanner = mainPage.mainBanner();
       Allure.step("Клик по баннеру ВХосписе");
       onView(mainBanner).perform(click());
    }

    public void clickContainerNews() {
        Matcher<View> dropdownListNewsButtonMatcher = mainPage.clickDropdownListNewsButton();
        Allure.step("Развернуть / скрыть все новости");
        onView(dropdownListNewsButtonMatcher).perform(click());
    }

    public void checkNewsFromContainer() {
        Allure.step("Отображаются все новости");
        onView(withId(R.id.all_news_cards_block_constraint_layout)).check(matches(isDisplayed()));
    }

    public void openNewFromContainer() {
        Matcher<View> dropdownListNewsInContainerMatcher = mainPage.clickDropdownListNewsInContainer();
        Allure.step("Развернуть полный текст новости из списка");
        onView(dropdownListNewsInContainerMatcher).perform(click());
    }

    public void checkTextNewFromContainer() {
        Allure.step("Отображение текста новости");
        onView(withId(R.id.news_item_material_card_view)).check(matches(isDisplayed()));
    }

    public void itemIsVisible(String value) {
        Allure.step("Найти элемент по тексту");
        onView(allOf(withId(R.id.news_item_title_text_view), withText(value)));
    }

    public void checkItemByDescription(String description) {
        Allure.step("Найти элемент по описанию");
        onView(withId(R.id.news_list_recycler_view)).perform(actionOnItemAtPosition(0, click()));
        onView(allOf(withId(R.id.news_item_description_text_view), withText(description))).check(matches(isDisplayed()));
    }
    public void clickOurMissionButtonTopBar() {
        Matcher<View> ourMissionButtonMatcher = mainPage.getMainOurMissionButton();
        Allure.step(("Нажать на кнопку Наша Миссия в верхней панели"));
        onView(ourMissionButtonMatcher).perform(click());
    }
}


