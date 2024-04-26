package ru.iteco.fmhandroid.pages;

import static androidx.test.espresso.Espresso.onView;

import android.view.View;

import static androidx.test.espresso.matcher.ViewMatchers.isDescendantOfA;
import static androidx.test.espresso.matcher.ViewMatchers.supportsInputMethods;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

import androidx.test.espresso.ViewInteraction;
import androidx.test.espresso.ViewInteraction_Factory;

import ru.iteco.fmhandroid.R;
import ru.iteco.fmhandroid.steps.AuthorizationSteps;

public class AuthorizationPage {
    public class LoginField {
        private static final int LOGIN_TEXT_INPUT_LAYOUT_ID = R.id.login_text_input_layout;

        public ViewInteraction getLoginField() {
            return onView(withId(LOGIN_TEXT_INPUT_LAYOUT_ID));
        }
    }

    public class PasswordField {
        private static final int PASSWORD_TEXT_INPUT_LAYOUT_ID = R.id.password_text_input_layout;

        public ViewInteraction getPasswordField() {
            return onView(withId(PASSWORD_TEXT_INPUT_LAYOUT_ID));
        }
    }

    public class EnterButton {
        private static final int ENTER_BUTTON_ID = R.id.enter_button;

        public ViewInteraction getEnterButton() {
            return onView(withId(ENTER_BUTTON_ID));
        }
    }

    public class LoginTextInput {
        private static final int LOGIN_TEXT_INPUT_LAYOUT_ID = R.id.login_text_input_layout;

        public ViewInteraction getLoginTextInput() {
            return onView(allOf(supportsInputMethods(), isDescendantOfA(withId(LOGIN_TEXT_INPUT_LAYOUT_ID))));
        }
    }

    public class PasswordTextInput {
        private static final int PASSWORD_TEXT_INPUT_LAYOUT_ID = R.id.password_text_input_layout;

        public ViewInteraction getPasswordTextInput() {
            return onView(allOf(supportsInputMethods(), isDescendantOfA(withId(PASSWORD_TEXT_INPUT_LAYOUT_ID))));
        }
    }

    public class TitleAuthorization {
        public ViewInteraction getTitleAuthorization() {
            return onView(withText("Authorization"));
        }
    }

    public class LogOut {
        private static final int TITLE_ID = android.R.id.title;
        public ViewInteraction logOut = onView(allOf(withId(TITLE_ID), withText("Log out")));
    }

    public class ExitButton {
        private static final int AUTHORIZATION_IMAGE_BUTTON_ID = R.id.authorization_image_button;

        public ViewInteraction getExitButton() {
            return onView(allOf(withId(AUTHORIZATION_IMAGE_BUTTON_ID)));
        }
    }
    private final int appBarFragmentMain = R.id.container_custom_app_bar_include_on_fragment_main;
    public int getAppBarFragmentMain() {
        return appBarFragmentMain;
    }

}
