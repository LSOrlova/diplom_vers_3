package ru.iteco.fmhandroid.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static ru.iteco.fmhandroid.WaitId.waitUntilElement;

import android.view.View;

import org.hamcrest.Matcher;

import ru.iteco.fmhandroid.R;

public class MainPage {
    public Matcher<View> getMainAllNews() {
        waitUntilElement(R.id.all_news_text_view);
        return withId(R.id.all_news_text_view);
    }

    public Matcher<View> getMainOurMissionButton() {
        waitUntilElement(R.id.our_mission_image_button);
        return withId(R.id.our_mission_image_button);
    }

    public Matcher<View> clickDropdownListNewsButton() {
        waitUntilElement(R.id.expand_material_button);
        return withId(R.id.expand_material_button);
    }

    public Matcher<View> clickDropdownListNewsInContainer() {
        waitUntilElement(R.id.container_list_news_include_on_fragment_main);
        return withId(R.id.container_list_news_include_on_fragment_main);
    }
}

