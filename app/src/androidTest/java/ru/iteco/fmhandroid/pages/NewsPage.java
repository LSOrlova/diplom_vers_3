package ru.iteco.fmhandroid.pages;

import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static org.hamcrest.Matchers.allOf;

import android.view.View;
import org.hamcrest.Matcher;
import ru.iteco.fmhandroid.R;

public class NewsPage {

    public class EditNewsNewsPage {
        private static final int EDIT_NEWS_MATERIAL_BUTTON_ID = R.id.edit_news_material_button;

        public Matcher<View> getEditNewsNewsPage() {
            return allOf(withId(EDIT_NEWS_MATERIAL_BUTTON_ID));
        }
    }

    public class AddNewsImageView {
        private static final int ADD_NEWS_IMAGE_BUTTON_ID = R.id.add_news_image_view;

        public Matcher<View> getAddNewsControlPanel() {
            return allOf(withId(ADD_NEWS_IMAGE_BUTTON_ID));
        }
    }

    public class AddNewSetCategory {
        private static final int NEWS_ITEM_CATEGORY_TEXT_AUTO_COMPLETE_TEXT_VIEW_ID = R.id.news_item_category_text_auto_complete_text_view;

        public Matcher<View> getAddNewSetCategory() {
            return allOf(withId(NEWS_ITEM_CATEGORY_TEXT_AUTO_COMPLETE_TEXT_VIEW_ID));
        }
    }

    public class AddNewInputTitle {
        private static final int NEWS_ITEM_TITLE_TEXT_INPUT_EDIT_TEXT_ID = R.id.news_item_title_text_input_edit_text;

        public Matcher<View> getAddNewInputTitle() {
            return allOf(withId(NEWS_ITEM_TITLE_TEXT_INPUT_EDIT_TEXT_ID));
        }
    }

    public class AddNewPublicationDate {
        private static final int NEWS_ITEM_PUBLISH_DATE_TEXT_INPUT_EDIT_TEXT_ID = R.id.news_item_publish_date_text_input_edit_text;

        public Matcher<View> getAddNewPublicationDate() {
            return allOf(withId(NEWS_ITEM_PUBLISH_DATE_TEXT_INPUT_EDIT_TEXT_ID));
        }
    }

    public class AddNewPublicationDateOk {
        private static final int BUTTON1_ID = android.R.id.button1;

        public Matcher<View> getAddNewPublicationDateOk() {
            return allOf(withId(BUTTON1_ID));
        }
    }

    public class AddNewPublicationTime {
        private static final int NEWS_ITEM_PUBLISH_TIME_TEXT_INPUT_EXIT_TEXT_ID = R.id.news_item_publish_time_text_input_edit_text;

        public Matcher<View> getAddNewPublicationTime() {
            return allOf(withId(NEWS_ITEM_PUBLISH_TIME_TEXT_INPUT_EXIT_TEXT_ID));
        }
    }

    public class AddNewTextDescription {
        private static final int NEWS_ITEM_DESCRIPTION_TEXT_INPUT_EDIT_TEXT_ID = R.id.news_item_description_text_input_edit_text;

        public Matcher<View> getAddNewTexDescription() {
            return allOf(withId(NEWS_ITEM_DESCRIPTION_TEXT_INPUT_EDIT_TEXT_ID));
        }
    }

    public class AddNewSaveButton {
        private static final int SAVE_BUTTON_ID = R.id.save_button;

        public Matcher<View> getAddNewSaveButton() {
            return allOf(withId(SAVE_BUTTON_ID));
        }
    }
}

