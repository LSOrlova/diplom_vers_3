package ru.iteco.fmhandroid.steps;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.clearText;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.action.ViewActions.scrollTo;

import io.qameta.allure.kotlin.Allure;
import ru.iteco.fmhandroid.pages.NewsPage;

public class NewsSteps {
    public NewsSteps(NewsPage newsPage) {
    }

    NewsPage newsPage = new NewsPage();

    public void clickEditNews() {
        NewsPage.EditNewsNewsPage editNews = newsPage.new EditNewsNewsPage();
        Allure.step("Нажать на кнопку Редактировать новости");
        onView(editNews.getEditNewsNewsPage()).perform(click());
    }

    public void clickAddNew() {
        NewsPage.AddNewsImageView addNewsImageView = newsPage.new AddNewsImageView();
        Allure.step("Нажать на кнопку Добавить новость");
        onView(addNewsImageView.getAddNewsControlPanel()).perform(click());
    }

    public void setCategory() {
        NewsPage.AddNewSetCategory addNewSetCategory = newsPage.new AddNewSetCategory();
        Allure.step("Установить категорию для новости");
        onView(addNewSetCategory.getAddNewSetCategory()).perform(click());
    }

    public void inputTitle() {
        String textToReplace = "Главные новости сегодня";
        NewsPage.AddNewInputTitle addNewInputTitle = newsPage.new AddNewInputTitle();
        Allure.step("Ввести заголовок в поле Заголовок");
        onView(addNewInputTitle.getAddNewInputTitle()).perform(click(), clearText(), replaceText(textToReplace), closeSoftKeyboard());
    }

    public void setPublicationDate() {
        NewsPage.AddNewPublicationDate addNewPublicationDate = newsPage.new AddNewPublicationDate();
        Allure.step("Установить дату публикации");
        onView(addNewPublicationDate.getAddNewPublicationDate()).perform(click());
    }

    public void confirmPublicationDate() {
        NewsPage.AddNewPublicationDateOk addNewPublicationDateOk = newsPage.new AddNewPublicationDateOk();
        Allure.step("Нажать кнопку ОК для подтверждения даты");
        onView(addNewPublicationDateOk.getAddNewPublicationDateOk()).perform(click());
    }

    public void setPublicationTime() {
        NewsPage.AddNewPublicationTime addNewPublicationTime = newsPage.new AddNewPublicationTime();
        Allure.step("Установить время публикации");
        onView(addNewPublicationTime.getAddNewPublicationTime()).perform(click());
    }

    public void confirmPublicationTime() {
        NewsPage.AddNewPublicationDateOk addNewPublicationDateOk = newsPage.new AddNewPublicationDateOk();
        Allure.step("Нажать кнопку ОК для подтверждения времени");
        onView(addNewPublicationDateOk.getAddNewPublicationDateOk()).perform(click());
    }

    public void addNewTextDescription() {
        String textDescription = "My new new";
        NewsPage.AddNewTextDescription addNewTextDescription = newsPage.new AddNewTextDescription();
        Allure.step("Добавить текст новости");
        onView(addNewTextDescription.getAddNewTexDescription()).perform(replaceText(textDescription), closeSoftKeyboard());
    }

    public void clickSaveNews() {
        NewsPage.AddNewSaveButton addNewSaveButton = newsPage.new AddNewSaveButton();
        Allure.step("Нажать кнопку Сохранить новость");
        onView(addNewSaveButton.getAddNewSaveButton()).perform(scrollTo(), click());
    }
}
