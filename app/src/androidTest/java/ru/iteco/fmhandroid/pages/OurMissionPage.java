package ru.iteco.fmhandroid.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;
import android.view.View;
import org.hamcrest.Matcher;
import ru.iteco.fmhandroid.R;

import org.hamcrest.Matcher;
import org.hamcrest.Matchers;

public class OurMissionPage {

    public Matcher<View> ourMissionLoveButton() {
        return Matchers.allOf(withId(R.id.our_mission_title_text_view));
    }

    public Matcher<View> ourMissionList() {
        return Matchers.allOf(withId(R.id.our_mission_item_list_recycler_view));
    }

    public Matcher<View> ourMissionCardTitle() {
        return Matchers.allOf(withId(R.id.our_mission_item_title_text_view));
    }

    public Matcher<View> ourMissionOpenCardButton() {
        return Matchers.allOf(withId(R.id.our_mission_item_open_card_image_button));
    }

    public Matcher<View> ourMissionCardText() {
        return Matchers.allOf(withId(R.id.our_mission_item_description_text_view));
    }
}

