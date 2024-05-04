package ru.iteco.fmhandroid;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.matcher.ViewMatchers.isRoot;
import static ru.iteco.fmhandroid.WaitId.waitId;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import io.qameta.allure.android.runners.AllureAndroidJUnit4;
import io.qameta.allure.kotlin.Story;
import io.qameta.allure.kotlin.junit4.Tag;
import ru.iteco.fmhandroid.pages.AuthorizationPage;
import ru.iteco.fmhandroid.pages.MainPage;
import ru.iteco.fmhandroid.pages.NewsPage;
import ru.iteco.fmhandroid.pages.OurMissionPage;
import ru.iteco.fmhandroid.steps.NewsSteps;
import ru.iteco.fmhandroid.steps.OurMissionSteps;
import ru.iteco.fmhandroid.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.steps.MainPageSteps;
import ru.iteco.fmhandroid.ui.AppActivity;

//@LargeTest
@RunWith(AllureAndroidJUnit4.class)
public class MainPageTest {
    AuthorizationPage authorizationPage = new AuthorizationPage();
    AuthorizationSteps authorizationSteps = new AuthorizationSteps(authorizationPage);
    NewsPage newsPage = new NewsPage();
    NewsSteps newsSteps = new NewsSteps(newsPage);
    MainPage mainPage = new MainPage();
    MainPageSteps mainPageSteps = new MainPageSteps(mainPage);
    OurMissionPage ourMissionPage = new OurMissionPage();
    OurMissionSteps ourMissionSteps = new OurMissionSteps(ourMissionPage);
    @Rule
    public ActivityScenarioRule<AppActivity> activityTestRule = new ActivityScenarioRule<>(AppActivity.class);

//    @Before
//    public void setUp() {
//        onView(isRoot()).perform(waitId(authorizationPage.getAppBarFragmentMain(), 7000));
//        if (authorizationSteps.isDisplayedButtonProfile()) {
//            authorizationSteps.clickLogOutButton();
//        }
//    }
//
//    public void loginAuth() {
//        AuthorizationSteps loginSteps = new AuthorizationSteps(authorizationPage);
//        loginSteps.login();
//        try {
//            authorizationSteps.textAuthorization();
//        } catch (androidx.test.espresso.NoMatchingViewException e) {
//            authorizationSteps.clickExitButton();
//            authorizationSteps.clickLogOutButton();
//        }
//    }

    @Test
    @Tag("10")
    @Story("Главная страница - свернуть развернуть новость")
    public void clickDDListNews() {
        mainPageSteps.clickContainerNews();
        mainPageSteps.clickContainerNews();
        mainPageSteps.clickContainerNews();
    }

    @Test
    @Tag("11")
    @Story("Главная страница - свернуть развернуть All news")
    public void gotoAllNewsPage() {
        mainPageSteps.clickAllNewsButton();
        mainPageSteps.checkNewsFromContainer();
    }

    @Test
    @Tag("12")
    @Story("Развернуть новость")
    public void clickDDListNewsInContainer() {
        mainPageSteps.openNewFromContainer();
        mainPageSteps.checkTextNewFromContainer();
    }

    @Test
    @Tag("13")
    @Story("Переход на главную страницу через клик по баннеру ВХОСПИСЕ - обновление страницы")
    public void goToMainFromOurMissionPage() {
        mainPageSteps.clickOurMissionButtonTopBar();
        ourMissionSteps.ourMissionPage();
        mainPageSteps.clickMainBanner();
        mainPageSteps.checkNewsFromContainer();
    }

    @Test
    @Tag("15")
    @Story("Переход в раздел Love is all")
    public void goToLoveIsAllPage() {
        mainPageSteps.clickOurMissionButtonTopBar();
        ourMissionSteps.ourMissionPage();
    }
}

