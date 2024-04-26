package ru.iteco.fmhandroid.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withContentDescription;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import static ru.iteco.fmhandroid.WaitId.waitUntilElement;


import androidx.test.espresso.NoMatchingViewException;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.pages.AuthorizationPage;

public class AuthorizationSteps {
    public AuthorizationSteps(AuthorizationPage authorizationSteps) {
    }

    AuthorizationPage authorizationPage = new AuthorizationPage();

    public void login() {
        try {
            textAuthorization();
            clickLoginField("login2");
            passwordTextInput("password2");
            clickSingInButton();
        } catch (androidx.test.espresso.NoMatchingViewException e) {
            System.out.println("Already login");
        }
    }

    public void clickExitButton() {
        AuthorizationPage.ExitButton exitButton = authorizationPage.new ExitButton();
        Allure.step("Нажать на кнопку Выход");
        waitUntilElement(R.id.authorization_image_button);
        exitButton.getExitButton().check(matches(isDisplayed()));
        exitButton.getExitButton().perform(click());
    }

    public void clickLogOutButton() {
        AuthorizationPage.LogOut logOut = authorizationPage.new LogOut();
        Allure.step("Нажать на кнопку Log out");
        waitUntilElement(android.R.id.title);
        logOut.logOut.perform(click());
    }

    public void clickSingInButton() {
        AuthorizationPage.EnterButton enterButton = authorizationPage.new EnterButton();
        Allure.step("Нажать кнопку Войти");
        waitUntilElement(R.id.enter_button);
        enterButton.getEnterButton().perform(click());
    }

    public void passwordTextInput(String password) {
        AuthorizationPage.PasswordTextInput passwordTextInput = authorizationPage.new PasswordTextInput();
        AuthorizationPage.PasswordField passwordField = authorizationPage.new PasswordField();
        Allure.step("Ввести пароль в поле Пароль");
        waitUntilElement(R.id.password_text_input_layout);
        passwordTextInput.getPasswordTextInput().perform(click());
        passwordTextInput.getPasswordTextInput().perform(replaceText(password), closeSoftKeyboard());
        passwordField.getPasswordField().check(matches(isDisplayed()));
    }

    public void clickLoginField(String login) {
        AuthorizationPage.LoginField loginField = authorizationPage.new LoginField();
        AuthorizationPage.LoginTextInput loginTextInput = authorizationPage.new LoginTextInput();
        Allure.step("Ввести логин в поле Логин");
        waitUntilElement(R.id.login_text_input_layout);
        loginTextInput.getLoginTextInput().perform(click());
        loginTextInput.getLoginTextInput().perform(replaceText(login), closeSoftKeyboard());
        loginField.getLoginField().check(matches(isDisplayed()));
    }

    public void textAuthorization() {
        AuthorizationPage.TitleAuthorization titleAuthorization = authorizationPage.new TitleAuthorization();
        Allure.step("Отображается страница Авторизации");
        waitUntilElement(R.id.nav_host_fragment);
        titleAuthorization.getTitleAuthorization().check(matches(isDisplayed()));
    }

    public void textAuthorizationErrorWrong() {
        Allure.step("Ошибка Something went wrong. Try again later.");
        onView(allOf(withContentDescription("Something went wrong. Try again later."), isDisplayed()));
    }

    public void textAuthorizationErrorEmpty() {
        Allure.step("Ошибка Login and password cannot be empty");
        onView(allOf(withContentDescription("Login and password cannot be empty"), isDisplayed()));

    }
    private final int containerNews = R.id.container_list_news_include_on_fragment_main;

    public int getContainerNews() {
        return containerNews;
    }
    public Boolean isDisplayedButtonProfile() {
        try {
            onView(withId(containerNews)).check(matches(isDisplayed()));
            return true;
        } catch (NoMatchingViewException e) {
            return false;
        }
    }
}

