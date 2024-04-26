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
import io.qameta.allure.kotlin.Epic;
import io.qameta.allure.kotlin.Story;
import io.qameta.allure.kotlin.junit4.Tag;
import ru.iteco.fmhandroid.ui.AppActivity;
import ru.iteco.fmhandroid.steps.AuthorizationSteps;
import ru.iteco.fmhandroid.pages.AuthorizationPage;
import ru.iteco.fmhandroid.util.TestData;

@LargeTest
@RunWith(AllureAndroidJUnit4.class)
@Epic("Functional tests Authorization page")
public class AuthorizationTest {
    AuthorizationPage authorizationPage = new AuthorizationPage();
    AuthorizationSteps authorizationSteps = new AuthorizationSteps(authorizationPage);
    @Rule
    public ActivityScenarioRule<AppActivity> activityTestRule = new ActivityScenarioRule<>(AppActivity.class);


    @Before
    public void setUp() {
        onView(isRoot()).perform(waitId(authorizationPage.getAppBarFragmentMain(), 5000));
        if (authorizationSteps.isDisplayedButtonProfile()) {
            authorizationSteps.clickLogOutButton();
        }
    }
    public void loginAuth() {
        AuthorizationSteps login = new AuthorizationSteps(authorizationPage);
        login.login();
        try {
            authorizationSteps.textAuthorization();
        } catch (androidx.test.espresso.NoMatchingViewException e) {
            authorizationSteps.clickExitButton();
            authorizationSteps.clickLogOutButton();
        }
    }

    @Test
    @Tag("2")
    @Story("Вход в приложение с валидными значениями login / PW")
    public void successfulAuthorization() {
        authorizationSteps.textAuthorization();
        authorizationSteps.clickLoginField(TestData.VALID_LOGIN);
        authorizationSteps.passwordTextInput(TestData.VALID_PASSWORD);
        authorizationSteps.clickSingInButton();
        authorizationSteps.clickExitButton();
        authorizationSteps.clickLogOutButton();
    }

    @Test
    @Tag("3")
    @Story("Вход в приложение - отправка пустой формы")
    public void loginPasswordAreEmpty() {
        authorizationSteps.textAuthorization();
        authorizationSteps.clickLoginField(TestData.EMPTY_LOGIN);
        authorizationSteps.passwordTextInput(TestData.EMPTY_PASSWORD);
        authorizationSteps.clickSingInButton();
        authorizationSteps.textAuthorizationErrorWrong();
    }

    @Test
    @Tag("4")
    @Story("Вход в приложение - отправка формы без логина")
    public void loginFieldIsEmpty() {
        authorizationSteps.textAuthorization();
        authorizationSteps.clickLoginField(TestData.EMPTY_LOGIN);
        authorizationSteps.passwordTextInput(TestData.VALID_PASSWORD);
        authorizationSteps.clickSingInButton();
        authorizationSteps.textAuthorizationErrorEmpty();
    }


    @Test
    @Tag("5")
    @Story("Вход в приложение - отправка формы без пароля")
    public void passwordFieldIsEmpty() {
        authorizationSteps.textAuthorization();
        authorizationSteps.clickLoginField(TestData.VALID_PASSWORD);
        authorizationSteps.passwordTextInput(TestData.EMPTY_PASSWORD);
        authorizationSteps.clickSingInButton();
        authorizationSteps.textAuthorizationErrorEmpty();
    }

    @Test
    @Tag("6")
    @Story("Вход в приложение - ввод логина, состоящего из спец символов")
    public void loginFieldWithSpecialCharacters() {
        authorizationSteps.textAuthorization();
        authorizationSteps.clickLoginField(TestData.SPECIAL_SYMBOLS_LOGIN);
        authorizationSteps.passwordTextInput(TestData.VALID_PASSWORD);
        authorizationSteps.clickSingInButton();
        authorizationSteps.textAuthorizationErrorWrong();
    }

    @Test
    @Tag("7")
    @Story("Вход в приложение - ввод логина на кириллице")
    public void loginFieldRussian() {
        authorizationSteps.textAuthorization();
        authorizationSteps.clickLoginField(TestData.RUSSIAN_LOGIN);
        authorizationSteps.passwordTextInput(TestData.VALID_PASSWORD);
        authorizationSteps.clickSingInButton();
        authorizationSteps.textAuthorizationErrorWrong();
    }

    @Test
    @Tag("8")
    @Story("Вход в приложение - ввод логина на арабском")
    public void loginFieldArabian() {
        authorizationSteps.textAuthorization();
        authorizationSteps.clickLoginField(TestData.ARABIAN_LOGIN);
        authorizationSteps.passwordTextInput(TestData.VALID_PASSWORD);
        authorizationSteps.clickSingInButton();
        authorizationSteps.textAuthorizationErrorWrong();
    }

    @Test
    @Tag("9")
    @Story("Вход в приложение - логин и пароль не существуют")
    public void loginPasswordNotExist() {
        authorizationSteps.textAuthorization();
        authorizationSteps.clickLoginField(TestData.INVALID_LOGIN);
        authorizationSteps.passwordTextInput(TestData.INVALID_PASSWORD);
        authorizationSteps.clickSingInButton();
        authorizationSteps.textAuthorizationErrorWrong();
    }
}
